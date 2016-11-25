package xeno.wulfenite.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xeno.wulfenite.WulfeniteMod;

public class ItemScythe extends Item implements ItemModelProvider{
	
	protected Item.ToolMaterial toolMaterial;
	private String name;
	
	public ItemScythe(Item.ToolMaterial material, String name) {
        this.toolMaterial = material;
        this.maxStackSize = 1;
        this.name = name;
        this.setMaxDamage(material.getMaxUses());
        setRegistryName(name);
        setUnlocalizedName(name);
    }
	
	// Strong against leaves
	@Override
    public float getStrVsBlock(ItemStack itemstack, IBlockState state) {
        return state.getMaterial() == Material.LEAVES ? 15.0F : super.getStrVsBlock(itemstack, state);
    }
	
	@Override
    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = this.toolMaterial.getRepairItemStack();
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
	
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving)
    {

        if (state.getBlock() == null || worldIn.getBlockState(pos).getBlock() == Blocks.AIR) {return false;}
                        
        boolean isLeaves = state.getBlock().isLeaves(worldIn.getBlockState(pos), worldIn, pos);
        
        int radius = isLeaves ? 0 : 3;
        int height = isLeaves ? 0 : 4;
        if (toolMaterial == ToolMaterial.IRON || toolMaterial == ToolMaterial.GOLD)
        {
            radius = 4;
            height = 4;
        }
        else if (toolMaterial == ToolMaterial.DIAMOND || toolMaterial == WulfeniteMod.molybdenumToolMaterial || toolMaterial == WulfeniteMod.rubyToolMaterial)
        {
            radius = 5;
            height = 5;
        }
        else if (toolMaterial == WulfeniteMod.diamoniteToolMaterial)
        {
        	radius = 6;
        	height = 6;
        }
        
        // automatically damage the item once - for the block originally destroyed
        stack.damageItem(1, entityLiving);
        
        int numberTrimmed = 0;
        if (isLeaves)
        {
            numberTrimmed += trim(stack, entityLiving, worldIn, pos, height, radius, TrimType.TRIM_LEAVES, false, 40);
        }
        else
        {
            // trim once with the corners cut
            numberTrimmed += trim(stack, entityLiving, worldIn, pos, height, radius, TrimType.TRIM_GRASS_AND_FLOWERS, true, 70);
            if (worldIn.rand.nextInt(3) == 0)
            {
                // with one in 3 chance, also do another 'free' trim of a smaller radius, without the corners cut
                // ('free' in the sense that it does not damage the scythe)
                numberTrimmed += trim(stack, entityLiving, worldIn, pos, height, radius - 1, TrimType.TRIM_GRASS_AND_FLOWERS, false, 0);
            }
        }
        return numberTrimmed > 0;
    }
	
	public int trim(ItemStack stack, EntityLivingBase entity, World world, BlockPos pos, int height, int radius, TrimType trimType, boolean cutCorners, int damagePercentChance)
    {
        int numberTrimmed = 0;
        int fortune = 0; // TODO fortune of scythe ?
        
        // apply to every block in a rectangle around pos
        for (int dx = -radius; dx <= radius; dx++) { for (int dy = -radius; dy <= radius; dy++) { for (int dz = -radius; dz <= radius; dz++) {
            if (dx == 0 && dy == 0 && dz == 0
                    || cutCorners && (Math.abs(dx) + Math.abs(dz) >= 2 * radius))
            {
                continue;
            }
            if (trimType.trimAtPos(world, pos.add(dx,dy,dz), fortune))
            {
                numberTrimmed++;
                if (world.rand.nextInt(100) < damagePercentChance)
                {
                    stack.damageItem(1, entity);
                }
            }
        }}}
        return numberTrimmed;
    }
	
	public enum TrimType {
        
        TRIM_GRASS_AND_FLOWERS, TRIM_LEAVES;
        
        // return true if a block was trimmed, false otherwise
        public boolean trimAtPos(World world, BlockPos pos, int fortune)
        {
            IBlockState state = world.getBlockState(pos);
            Block block = state.getBlock();
            
            switch (this) {
            
                case TRIM_LEAVES:
                    
                    // remove leaves
                    if (block.isLeaves(state, world, pos))
                    {
                        block.dropBlockAsItem(world, pos, state, fortune);
                        world.setBlockToAir(pos);
                        return true;
                    }
                    return false;
                    
            
                case TRIM_GRASS_AND_FLOWERS: default:
            
                    // TODO: remove other plants?
                    // shorten grass and destroy flowers
                    if (block == Blocks.TALLGRASS)
                    {
                        block.dropBlockAsItem(world, pos, state, fortune);
                        return true;
                    }
                    else if (block instanceof BlockBush && block.isReplaceable(world, pos))
                    {
                        block.dropBlockAsItem(world, pos, state, fortune);
                        world.setBlockToAir(pos);
                        return true;
                    }
                    else if ((block instanceof BlockFlower))
                    {
                        block.dropBlockAsItem(world, pos, state, fortune);
                        world.setBlockToAir(pos);
                        return true;
                    }
                    return false;
            
            }
        }
	}

	@Override
	public void registerItemModel(Item item) {
		WulfeniteMod.proxy.registerItemRenderer(this, 0, name);
	}
}
