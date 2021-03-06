package mod.beethoven92.betterendforge.data;

// MOST LOOT TABLE ARE MESSED UP AND DON'T WORK AS EXPECTED, NEED TO IMPROVE THIS
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import mod.beethoven92.betterendforge.BetterEnd;
import mod.beethoven92.betterendforge.common.block.BlockProperties.TripleShape;
import mod.beethoven92.betterendforge.common.block.EndLilyBlock;
import mod.beethoven92.betterendforge.common.block.ShadowBerryBlock;
import mod.beethoven92.betterendforge.common.block.material.StoneMaterial;
import mod.beethoven92.betterendforge.common.block.material.WoodenMaterial;
import mod.beethoven92.betterendforge.common.init.ModBlocks;
import mod.beethoven92.betterendforge.common.init.ModItems;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.loot.conditions.RandomChance;
import net.minecraft.loot.conditions.TableBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTables extends BlockLootTables
{
	@Override
	protected void addTables() 
	{
		// TERRAINS
	    registerLootTable(ModBlocks.CRYSTAL_MOSS.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
	    registerLootTable(ModBlocks.END_MYCELIUM.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
	    registerLootTable(ModBlocks.END_MOSS.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
	    registerLootTable(ModBlocks.CHORUS_NYLIUM.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
	    registerLootTable(ModBlocks.CAVE_MOSS.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
	    registerLootTable(ModBlocks.SHADOW_GRASS.get(), (terrain) -> {
	    	return droppingWithSilkTouch(terrain, Blocks.END_STONE);
	    });
		registerDropSelfLootTable(ModBlocks.ENDSTONE_DUST.get());
		
		// PATHS
		registerDropping(ModBlocks.CRYSTAL_MOSS_PATH.get(), Blocks.END_STONE);
		registerDropping(ModBlocks.END_MYCELIUM_PATH.get(), Blocks.END_STONE);
		registerDropping(ModBlocks.END_MOSS_PATH.get(), Blocks.END_STONE);
		registerDropping(ModBlocks.CHORUS_NYLIUM_PATH.get(), Blocks.END_STONE);
		registerDropping(ModBlocks.CAVE_MOSS_PATH.get(), Blocks.END_STONE);
		registerDropping(ModBlocks.SHADOW_GRASS_PATH.get(), Blocks.END_STONE);
		
		// MATERIALS
		registerDropSelfLootTable(ModBlocks.AETERNIUM_BLOCK.get());
		registerDropSelfLootTable(ModBlocks.TERMINITE_BLOCK.get());
		registerDropSelfLootTable(ModBlocks.ENDER_BLOCK.get());
	    registerLootTable(ModBlocks.AURORA_CRYSTAL.get(), (block) -> {
	    	return droppingItemWithFortune(block, ModItems.CRYSTAL_SHARDS.get());
	    });
		
		// ORES
	    registerLootTable(ModBlocks.ENDER_ORE.get(), (ore) -> {
	    	return droppingItemWithFortune(ore, ModItems.ENDER_SHARD.get());
	    });
	    
		// STONES
		registerDropSelfLootTable(ModBlocks.FLAVOLITE_RUNED.get());
		
		registerDropSelfLootTable(ModBlocks.QUARTZ_PEDESTAL.get());
		registerDropSelfLootTable(ModBlocks.PURPUR_PEDESTAL.get());
		registerDropSelfLootTable(ModBlocks.ETERNAL_PEDESTAL.get());
		registerDropSelfLootTable(ModBlocks.INFUSION_PEDESTAL.get());
		
		registerLootTable(ModBlocks.END_STONE_SMELTER.get(), BlockLootTables::droppingWithName);
		
		// PLANTS
		registerLootTable(ModBlocks.UMBRELLA_MOSS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		// TO DO
		registerDropSelfLootTable(ModBlocks.UMBRELLA_MOSS_TALL.get());
		//
		registerLootTable(ModBlocks.CREEPING_MOSS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.CHORUS_GRASS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.CAVE_GRASS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.CRYSTAL_GRASS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.SHADOW_PLANT.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		
		registerLootTable(ModBlocks.BLUE_VINE_SEED.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.BLUE_VINE.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerDropSelfLootTable(ModBlocks.BLUE_VINE_LANTERN.get());
		registerLootTable(ModBlocks.BLUE_VINE_FUR.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, withSurvivesExplosion(block, ItemLootEntry.builder(ModBlocks.BLUE_VINE_SEED.get())).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.025F, 0.083333336F, 0.1F)));
		});
		
		registerDropSelfLootTable(ModBlocks.CAVE_BUSH.get());
		
		registerLootTable(ModBlocks.END_LILY_SEED.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
	    
		this.registerLootTable(ModBlocks.END_LILY.get(), (block) -> {
			return endLilyDrop();
	    });
		registerLootTable(ModBlocks.END_LOTUS_SEED.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.END_LOTUS_LEAF.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerDropSelfLootTable(ModBlocks.END_LOTUS_STEM.get());
		registerLootTable(ModBlocks.END_LOTUS_FLOWER.get(), droppingRandomly(ModBlocks.END_LOTUS_SEED.get(), RandomValueRange.of(1.0F, 2.0F)));
		
		registerLootTable(ModBlocks.BUBBLE_CORAL.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});		
		registerLootTable(ModBlocks.MURKWEED.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
	    registerLootTable(ModBlocks.NEEDLEGRASS.get(), (block) -> {
	    	return droppingWithShears(block, withExplosionDecay(block, ItemLootEntry.builder(Items.STICK).acceptFunction(SetCount.builder(RandomValueRange.of(0.0F, 2.0F)))));
	    });
	    ILootCondition.IBuilder ilootcondition$ibuilder1 = BlockStateProperty.builder(ModBlocks.SHADOW_BERRY.get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(ShadowBerryBlock.AGE, 3));
	    registerLootTable(ModBlocks.SHADOW_BERRY.get(), droppingAndBonusWhen(ModBlocks.SHADOW_BERRY.get(), ModItems.SHADOW_BERRY_RAW.get(), ModBlocks.SHADOW_BERRY.get().asItem(), ilootcondition$ibuilder1)); 
		
	    // WALL_PLANTS
		registerDropSelfLootTable(ModBlocks.PURPLE_POLYPORE.get());
		registerLootTable(ModBlocks.TAIL_MOSS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.CYAN_MOSS.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		
		// VINES
		registerLootTable(ModBlocks.DENSE_VINE.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		registerLootTable(ModBlocks.TWISTED_VINE.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, ItemLootEntry.builder(block).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
		});
		
		// TREES
		registerDropSelfLootTable(ModBlocks.MOSSY_GLOWSHROOM_SAPLING.get());
		registerDropSelfLootTable(ModBlocks.MOSSY_GLOWSHROOM_CAP.get());
		registerDropSelfLootTable(ModBlocks.MOSSY_GLOWSHROOM_HYMENOPHORE.get());
		registerLootTable(ModBlocks.MOSSY_GLOWSHROOM_FUR.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, withSurvivesExplosion(block, ItemLootEntry.builder(ModBlocks.MOSSY_GLOWSHROOM_SAPLING.get())).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.025F, 0.083333336F, 0.1F)));
		});
		registerDropSelfLootTable(ModBlocks.LACUGROVE_SAPLING.get());
		registerLootTable(ModBlocks.LACUGROVE_LEAVES.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, withSurvivesExplosion(block, ItemLootEntry.builder(ModBlocks.LACUGROVE_SAPLING.get())).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.025F, 0.083333336F, 0.1F)));
		});
		registerDropSelfLootTable(ModBlocks.PYTHADENDRON_SAPLING.get());
		registerLootTable(ModBlocks.PYTHADENDRON_LEAVES.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, withSurvivesExplosion(block, ItemLootEntry.builder(ModBlocks.PYTHADENDRON_SAPLING.get())).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.025F, 0.083333336F, 0.1F)));
		});
		registerDropSelfLootTable(ModBlocks.DRAGON_TREE_SAPLING.get());
		registerLootTable(ModBlocks.DRAGON_TREE_LEAVES.get(), (block) -> {
			return droppingWithSilkTouchOrShears(block, withSurvivesExplosion(block, ItemLootEntry.builder(ModBlocks.DRAGON_TREE_SAPLING.get())).acceptCondition(TableBonus.builder(Enchantments.FORTUNE, 0.05F, 0.0625F, 0.025F, 0.083333336F, 0.1F)));
		});
		
		// WOODEN_MATERIALS
		registerWoodenMaterialLootTables(ModBlocks.MOSSY_GLOWSHROOM);
		registerWoodenMaterialLootTables(ModBlocks.LACUGROVE);
		registerWoodenMaterialLootTables(ModBlocks.END_LOTUS);
		registerWoodenMaterialLootTables(ModBlocks.PYTHADENDRON);
		registerWoodenMaterialLootTables(ModBlocks.DRAGON_TREE);
		
		// STONE MATERIALS
		registerStoneMaterialLootTables(ModBlocks.FLAVOLITE);
		registerStoneMaterialLootTables(ModBlocks.VIOLECITE);
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks()
	{
		return StreamSupport.stream(ForgeRegistries.BLOCKS.spliterator(), false)
				.filter(entry -> entry.getRegistryName() != null && entry.getRegistryName().getNamespace().equals(BetterEnd.MOD_ID))
				.collect(Collectors.toSet());
	}
	
	private void registerWoodenMaterialLootTables(WoodenMaterial material)
	{
		registerDropSelfLootTable(material.log.get());
		registerDropSelfLootTable(material.bark.get());
		registerDropSelfLootTable(material.log_stripped.get());
		registerDropSelfLootTable(material.bark_stripped.get());
		registerDropSelfLootTable(material.planks.get());
		registerDropSelfLootTable(material.stairs.get());
		registerLootTable(material.slab.get(), BlockLootTables::droppingSlab);
		registerDropSelfLootTable(material.fence.get());
		registerDropSelfLootTable(material.gate.get());
		registerDropSelfLootTable(material.button.get());
		registerDropSelfLootTable(material.pressurePlate.get());
		registerDropSelfLootTable(material.trapdoor.get());
		registerLootTable(material.door.get(), BlockLootTables::registerDoor);
	}
	
	private void registerStoneMaterialLootTables(StoneMaterial material)
	{
		registerDropSelfLootTable(material.stone.get());
		registerDropSelfLootTable(material.polished.get());
		registerDropSelfLootTable(material.tiles.get());
		registerDropSelfLootTable(material.pillar.get());
		registerDropSelfLootTable(material.stairs.get());
		registerLootTable(material.slab.get(), BlockLootTables::droppingSlab);
		registerDropSelfLootTable(material.wall.get());
		registerDropSelfLootTable(material.button.get());
		registerDropSelfLootTable(material.pressure_plate.get());
		registerDropSelfLootTable(material.bricks.get());
		registerDropSelfLootTable(material.brick_stairs.get());
		registerLootTable(material.brick_slab.get(), BlockLootTables::droppingSlab);
		registerDropSelfLootTable(material.brick_wall.get());
	}
	
	// Need to improve
	private static LootTable.Builder endLilyDrop() 
	{
		LootEntry.Builder<?> leaf_drop = ItemLootEntry.builder(ModItems.END_LILY_LEAF.get()).acceptCondition(RandomChance.builder(0.525F));
		LootEntry.Builder<?> seed_drop = ItemLootEntry.builder(ModBlocks.END_LILY_SEED.get()).acceptCondition(RandomChance.builder(0.525F));
		return LootTable.builder().addLootPool(LootPool.builder().addEntry(leaf_drop).acceptCondition(BlockStateProperty.builder(ModBlocks.END_LILY.get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withProp(EndLilyBlock.SHAPE, TripleShape.TOP)))).addLootPool(LootPool.builder().addEntry(seed_drop).acceptCondition(BlockStateProperty.builder(ModBlocks.END_LILY.get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withProp(EndLilyBlock.SHAPE, TripleShape.BOTTOM))));
	}
}
