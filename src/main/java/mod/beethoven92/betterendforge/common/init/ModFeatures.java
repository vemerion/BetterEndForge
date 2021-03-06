package mod.beethoven92.betterendforge.common.init;

import mod.beethoven92.betterendforge.BetterEnd;
import mod.beethoven92.betterendforge.common.world.feature.BlueVineFeature;
import mod.beethoven92.betterendforge.common.world.feature.BushFeature;
import mod.beethoven92.betterendforge.common.world.feature.CavePlantFeature;
import mod.beethoven92.betterendforge.common.world.feature.DoublePlantFeature;
import mod.beethoven92.betterendforge.common.world.feature.DragonTreeFeature;
import mod.beethoven92.betterendforge.common.world.feature.EndLakeFeature;
import mod.beethoven92.betterendforge.common.world.feature.EndLilyFeature;
import mod.beethoven92.betterendforge.common.world.feature.EndLotusFeature;
import mod.beethoven92.betterendforge.common.world.feature.EndLotusLeafFeature;
import mod.beethoven92.betterendforge.common.world.feature.LacugroveFeature;
import mod.beethoven92.betterendforge.common.world.feature.MossyGlowshroomFeature;
import mod.beethoven92.betterendforge.common.world.feature.OreLayerFeature;
import mod.beethoven92.betterendforge.common.world.feature.PythadendronFeature;
import mod.beethoven92.betterendforge.common.world.feature.RoundCaveFeature;
import mod.beethoven92.betterendforge.common.world.feature.SinglePlantFeature;
import mod.beethoven92.betterendforge.common.world.feature.UnderwaterPlantFeature;
import mod.beethoven92.betterendforge.common.world.feature.VineFeature;
import mod.beethoven92.betterendforge.common.world.feature.WallPlantFeature;
import mod.beethoven92.betterendforge.common.world.feature.WallPlantOnLogFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.RegistryEvent.Register;

public class ModFeatures
{
	// WATER PLANTS
	public static final Feature<NoFeatureConfig> END_LOTUS = new EndLotusFeature(7);
	public static final Feature<NoFeatureConfig> END_LOTUS_LEAF = new EndLotusLeafFeature(20);	
	public static final Feature<NoFeatureConfig> BUBBLE_CORAL = new UnderwaterPlantFeature(ModBlocks.BUBBLE_CORAL.get(), 6);
	public static final Feature<NoFeatureConfig> BUBBLE_CORAL_RARE = new UnderwaterPlantFeature(ModBlocks.BUBBLE_CORAL.get(), 3);
	public static final Feature<NoFeatureConfig> END_LILY = new EndLilyFeature(6);
	public static final Feature<NoFeatureConfig> END_LILY_RARE = new EndLilyFeature(3);
	
	// BUSHES
	public static final Feature<NoFeatureConfig> PYTHADENDRON_BUSH = new BushFeature(ModBlocks.PYTHADENDRON_LEAVES.get(), ModBlocks.PYTHADENDRON.bark.get());
	public static final Feature<NoFeatureConfig> DRAGON_TREE_BUSH = new BushFeature(ModBlocks.DRAGON_TREE_LEAVES.get(), ModBlocks.DRAGON_TREE.bark.get());
	
	// PLANTS
	public static final Feature<NoFeatureConfig> UMBRELLA_MOSS = new DoublePlantFeature(ModBlocks.UMBRELLA_MOSS.get(), ModBlocks.UMBRELLA_MOSS_TALL.get(), 5);
	public static final Feature<NoFeatureConfig> CREEPING_MOSS = new SinglePlantFeature(ModBlocks.CREEPING_MOSS.get(), 5);
	public static final Feature<NoFeatureConfig> CHORUS_GRASS = new SinglePlantFeature(ModBlocks.CHORUS_GRASS.get(), 4);
	public static final Feature<NoFeatureConfig> CAVE_GRASS = new CavePlantFeature(ModBlocks.CAVE_GRASS.get(), 7);
	public static final Feature<NoFeatureConfig> CRYSTAL_GRASS = new SinglePlantFeature(ModBlocks.CRYSTAL_GRASS.get(), 8, false);
	public static final Feature<NoFeatureConfig> SHADOW_PLANT = new SinglePlantFeature(ModBlocks.SHADOW_PLANT.get(), 6);
	public static final Feature<NoFeatureConfig> BLUE_VINE = new BlueVineFeature(5);
	public static final Feature<NoFeatureConfig> MURKWEED = new SinglePlantFeature(ModBlocks.MURKWEED.get(), 3);
	public static final Feature<NoFeatureConfig> NEEDLEGRASS = new SinglePlantFeature(ModBlocks.NEEDLEGRASS.get(), 3);
	public static final Feature<NoFeatureConfig> SHADOW_BERRY = new SinglePlantFeature(ModBlocks.SHADOW_BERRY.get(), 2);
	
	// WALL PLANTS
	public static final Feature<NoFeatureConfig> PURPLE_POLYPORE = new WallPlantOnLogFeature(ModBlocks.PURPLE_POLYPORE.get(), 3);
	public static final Feature<NoFeatureConfig> PURPLE_POLYPORE_DENSE = new WallPlantOnLogFeature(ModBlocks.PURPLE_POLYPORE.get(), 5);
	public static final Feature<NoFeatureConfig> TAIL_MOSS = new WallPlantFeature(ModBlocks.TAIL_MOSS.get(), 3);
	public static final Feature<NoFeatureConfig> TAIL_MOSS_WOOD = new WallPlantOnLogFeature(ModBlocks.TAIL_MOSS.get(), 4);
	public static final Feature<NoFeatureConfig> CYAN_MOSS = new WallPlantFeature(ModBlocks.CYAN_MOSS.get(), 3);
	public static final Feature<NoFeatureConfig> CYAN_MOSS_WOOD = new WallPlantOnLogFeature(ModBlocks.CYAN_MOSS.get(), 4);
	
	// VINES
	public static final Feature<NoFeatureConfig> DENSE_VINE = new VineFeature(ModBlocks.DENSE_VINE.get(), 24);
	public static final Feature<NoFeatureConfig> TWISTED_VINE = new VineFeature(ModBlocks.TWISTED_VINE.get(), 24);
	
	// TERRAIN
	public static final Feature<NoFeatureConfig> ROUND_CAVE = new RoundCaveFeature();
	public static final Feature<NoFeatureConfig> ROUND_CAVE_RARE = new RoundCaveFeature();
	public static final Feature<NoFeatureConfig> END_LAKE = new EndLakeFeature();
	public static final Feature<NoFeatureConfig> END_LAKE_RARE = new EndLakeFeature();
	
	// TREES
	public static final Feature<NoFeatureConfig> MOSSY_GLOWSHROOM = new MossyGlowshroomFeature();
	public static final Feature<NoFeatureConfig> LACUGROVE = new LacugroveFeature();
	public static final Feature<NoFeatureConfig> PYTHADENDRON = new PythadendronFeature();
	public static final Feature<NoFeatureConfig> DRAGON_TREE = new DragonTreeFeature();
	
	// ORES
	public static final Feature<OreFeatureConfig> ENDER_ORE = new OreFeature(OreFeatureConfig.CODEC);
	public static final Feature<NoFeatureConfig> FLAVOLITE_LAYER = new OreLayerFeature(ModBlocks.FLAVOLITE.stone.get().getDefaultState(), 12, 4, 96);
	public static final Feature<NoFeatureConfig> VIOLECITE_LAYER = new OreLayerFeature(ModBlocks.VIOLECITE.stone.get().getDefaultState(), 15, 4, 96);
	
	public static void registerFeatures(Register<Feature<?>> event)
    {
		// WATER PLANTS
    	BetterEnd.register(event.getRegistry(), END_LOTUS, "end_lotus");
    	BetterEnd.register(event.getRegistry(), END_LOTUS_LEAF, "end_lotus_leaf");    	
    	BetterEnd.register(event.getRegistry(), BUBBLE_CORAL, "bubble_coral");
    	BetterEnd.register(event.getRegistry(), BUBBLE_CORAL_RARE, "bubble_coral_rare");  
    	BetterEnd.register(event.getRegistry(), END_LILY, "end_lily");
    	BetterEnd.register(event.getRegistry(), END_LILY_RARE, "end_lily_rare");  
    	//BUSHES
    	BetterEnd.register(event.getRegistry(), PYTHADENDRON_BUSH, "pythadendron_bush"); 
    	BetterEnd.register(event.getRegistry(), DRAGON_TREE_BUSH, "dragon_tree_bush"); 
    	// PLANTS
    	BetterEnd.register(event.getRegistry(), UMBRELLA_MOSS, "umbrella_moss");
    	BetterEnd.register(event.getRegistry(), CREEPING_MOSS, "creeping_moss");   	
    	BetterEnd.register(event.getRegistry(), CHORUS_GRASS, "chorus_grass");
    	BetterEnd.register(event.getRegistry(), CAVE_GRASS, "cave_grass");
    	BetterEnd.register(event.getRegistry(), CRYSTAL_GRASS, "crystal_grass");
    	BetterEnd.register(event.getRegistry(), SHADOW_PLANT, "shadow_plant");  	
    	BetterEnd.register(event.getRegistry(), BLUE_VINE, "blue_vine"); 
    	BetterEnd.register(event.getRegistry(), MURKWEED, "murkweed");  	
    	BetterEnd.register(event.getRegistry(), NEEDLEGRASS, "needlegrass"); 
    	BetterEnd.register(event.getRegistry(), SHADOW_BERRY, "shadow_berry"); 
    	// WALL_PLANTS
    	BetterEnd.register(event.getRegistry(), PURPLE_POLYPORE, "purple_polypore");
    	BetterEnd.register(event.getRegistry(), PURPLE_POLYPORE_DENSE, "purple_polypore_dense");
    	BetterEnd.register(event.getRegistry(), TAIL_MOSS, "tail_moss");
    	BetterEnd.register(event.getRegistry(), TAIL_MOSS_WOOD, "tail_moss_wood");  	
    	BetterEnd.register(event.getRegistry(), CYAN_MOSS, "cyan_moss"); 
    	BetterEnd.register(event.getRegistry(), CYAN_MOSS_WOOD, "cyan_moss_wood"); 
    	// VINES
    	BetterEnd.register(event.getRegistry(), DENSE_VINE, "dense_vine"); 
    	BetterEnd.register(event.getRegistry(), TWISTED_VINE, "twisted_vine"); 
    	// TERRAIN
    	BetterEnd.register(event.getRegistry(), ROUND_CAVE, "round_cave");
    	BetterEnd.register(event.getRegistry(), ROUND_CAVE_RARE, "round_cave_rare");
    	BetterEnd.register(event.getRegistry(), END_LAKE, "end_lake");   
    	BetterEnd.register(event.getRegistry(), END_LAKE_RARE, "end_lake_rare"); 
    	// TREES
    	BetterEnd.register(event.getRegistry(), MOSSY_GLOWSHROOM, "mossy_glowshroom");
    	BetterEnd.register(event.getRegistry(), LACUGROVE, "lacugrove");   
    	BetterEnd.register(event.getRegistry(), PYTHADENDRON, "pythadendron"); 
    	BetterEnd.register(event.getRegistry(), DRAGON_TREE, "dragon_tree");
    	// ORES
    	BetterEnd.register(event.getRegistry(), ENDER_ORE, "ender_ore");
    	BetterEnd.register(event.getRegistry(), FLAVOLITE_LAYER, "flavolite_layer");
    	BetterEnd.register(event.getRegistry(), VIOLECITE_LAYER, "violecite_layer");
    }
}
