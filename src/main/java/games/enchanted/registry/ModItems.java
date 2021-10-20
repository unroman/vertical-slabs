package games.enchanted.registry;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.VerticalSlabItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //block items
    // wood slabs
    public static final BlockItem VERTICAL_OAK_SLAB = registerBlockItem(ModBlocks.VERTICAL_OAK_SLAB ,"vertical_oak_slab");
    public static final BlockItem VERTICAL_SPRUCE_SLAB = registerBlockItem(ModBlocks.VERTICAL_SPRUCE_SLAB ,"vertical_spruce_slab");
    public static final BlockItem VERTICAL_BIRCH_SLAB = registerBlockItem(ModBlocks.VERTICAL_BIRCH_SLAB ,"vertical_birch_slab");
    public static final BlockItem VERTICAL_JUNGLE_SLAB = registerBlockItem(ModBlocks.VERTICAL_JUNGLE_SLAB ,"vertical_jungle_slab");
    public static final BlockItem VERTICAL_ACACIA_SLAB = registerBlockItem(ModBlocks.VERTICAL_ACACIA_SLAB ,"vertical_acacia_slab");
    public static final BlockItem VERTICAL_DARK_OAK_SLAB = registerBlockItem(ModBlocks.VERTICAL_DARK_OAK_SLAB ,"vertical_dark_oak_slab");
    public static final BlockItem VERTICAL_CRIMSON_SLAB = registerBlockItem(ModBlocks.VERTICAL_CRIMSON_SLAB ,"vertical_crimson_slab");
    public static final BlockItem VERTICAL_WARPED_SLAB = registerBlockItem(ModBlocks.VERTICAL_WARPED_SLAB ,"vertical_warped_slab");
    
    // stone slabs
    public static final BlockItem VERTICAL_STONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_STONE_SLAB ,"vertical_stone_slab");
    public static final BlockItem VERTICAL_SMOOTH_STONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB ,"vertical_smooth_stone_slab");
    public static final BlockItem VERTICAL_SANDSTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_SANDSTONE_SLAB ,"vertical_sandstone_slab");
    public static final BlockItem VERTICAL_CUT_SANDSTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB ,"vertical_cut_sandstone_slab");
    public static final BlockItem VERTICAL_PETRIFIED_OAK_SLAB = registerBlockItem(ModBlocks.VERTICAL_PETRIFIED_OAK_SLAB ,"vertical_petrified_oak_slab");
    public static final BlockItem VERTICAL_COBBLESTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_COBBLESTONE_SLAB ,"vertical_cobblestone_slab");
    public static final BlockItem VERTICAL_BRICK_SLAB = registerBlockItem(ModBlocks.VERTICAL_BRICK_SLAB ,"vertical_brick_slab");
    public static final BlockItem VERTICAL_STONE_BRICK_SLAB = registerBlockItem(ModBlocks.VERTICAL_STONE_BRICK_SLAB ,"vertical_stone_brick_slab");
    public static final BlockItem VERTICAL_NETHER_BRICK_SLAB = registerBlockItem(ModBlocks.VERTICAL_NETHER_BRICK_SLAB ,"vertical_nether_brick_slab");
    public static final BlockItem VERTICAL_QUARTZ_SLAB = registerBlockItem(ModBlocks.VERTICAL_QUARTZ_SLAB ,"vertical_quartz_slab");
    public static final BlockItem VERTICAL_SMOOTH_QUARTZ_SLAB = registerBlockItem(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB ,"vertical_smooth_quartz_slab");
    public static final BlockItem VERTICAL_RED_SANDSTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB ,"vertical_red_sandstone_slab");
    public static final BlockItem VERTICAL_CUT_RED_SANDSTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB ,"vertical_cut_red_sandstone_slab");
    public static final BlockItem VERTICAL_PURPUR_SLAB = registerBlockItem(ModBlocks.VERTICAL_PURPUR_SLAB ,"vertical_purpur_slab");
    public static final BlockItem VERTICAL_PRISMARINE_SLAB = registerBlockItem(ModBlocks.VERTICAL_PRISMARINE_SLAB ,"vertical_prismarine_slab");
    public static final BlockItem VERTICAL_PRISMARINE_BRICK_SLAB = registerBlockItem(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB ,"vertical_prismarine_brick_slab");
    public static final BlockItem VERTICAL_DARK_PRISMARINE__SLAB = registerBlockItem(ModBlocks.VERTICAL_DARK_PRISMARINE__SLAB ,"vertical_dark_prismarine_slab");
    public static final BlockItem VERTICAL_POLISHED_GRANITE_SLAB = registerBlockItem(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB ,"vertical_polished_granite_slab");
    public static final BlockItem VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB ,"vertical_smooth_red_sandstone_slab");
    public static final BlockItem VERTICAL_MOSSY_STONE_BRICK_SLAB = registerBlockItem(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB ,"vertical_mossy_stone_brick_slab");


    // registers all block items and puts them in building blocks
    public static BlockItem registerBlockItem(Block blockId ,String id) {
        Item.Settings settings = new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
        return Registry.register(Registry.ITEM, new Identifier(VerticalSlabs.MOD_ID, id), new VerticalSlabItem(blockId, settings));
    }

    public static void registerItems(){
        //Registry.register(Registry.ITEM, new Identifier(VerticalSlabs.MOD_ID, "vertical_oak_slab"), VERTICAL_OAK_SLAB);
    }
}
