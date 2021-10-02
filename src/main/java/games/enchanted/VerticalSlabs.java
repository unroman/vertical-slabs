package games.enchanted;

import games.enchanted.registry.ModItems;
import games.enchanted.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VerticalSlabs implements ModInitializer{

    // mod id
    public static final String MOD_ID = "enchanted-vertical-slabs";

    // creative tabs
    public static final ItemGroup VERTICAL_SLABS_GROUP = FabricItemGroupBuilder.create(
        new Identifier(MOD_ID, "vertical_slabs"))
        // group icon
        .icon(() -> new ItemStack(ModItems.VERTICAL_OAK_SLAB))
        // items in the group
        .appendItems(stacks -> {
            stacks.add(new ItemStack(ModBlocks.VERTICAL_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SPRUCE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_BIRCH_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_JUNGLE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_ACACIA_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DARK_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CRIMSON_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_WARPED_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_STONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PETRIFIED_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_COBBLESTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_STONE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_NETHER_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_QUARTZ_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PURPUR_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PRISMARINE_SLAB));
        }
    ).build();

    @Override
    public void onInitialize() {
        // calls block and item classes
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
    
}