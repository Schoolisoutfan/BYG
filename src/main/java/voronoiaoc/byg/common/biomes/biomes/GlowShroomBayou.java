package voronoiaoc.byg.common.biomes.biomes;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.Features;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import voronoiaoc.byg.common.biomes.BiomeHelper;
import voronoiaoc.byg.common.biomes.BiomeTools;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGFeatures;
import voronoiaoc.byg.common.world.feature.biomefeatures.BYGTreeFeatures;
import voronoiaoc.byg.core.byglists.BYGSBList;

public class GlowShroomBayou extends Biome implements BiomeTools {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = BiomeHelper.newConfiguredSurfaceBuilder("glowshroom_bayou", new ConfiguredSurfaceBuilder<>(BYGSBList.GLOWSHROOM_BAYOU_SB, SurfaceBuilder.CONFIG_GRASS));
    static final Precipitation PRECIPATATION = Precipitation.RAIN;
    static final BiomeCategory CATEGORY = BiomeCategory.SWAMP;
    static final float DEPTH = -0.2F;
    static final float SCALE = 0.01F;
    static final float TEMPERATURE = 0.8F;
    static final float DOWNFALL = 0.8F;
    static final int WATER_COLOR = 4815438;
    static final int WATER_FOG_COLOR = 6717479;
    static final int GRASS_COLOR = 7375928;
    static final int FOLIAGE_COLOR = 6337104;
    static final String PARENT = null;
    static final ClimateSettings WEATHER = new ClimateSettings(PRECIPATATION, TEMPERATURE, TemperatureModifier.NONE, DOWNFALL);
    static final MobSpawnSettings.Builder SPAWN_SETTINGS = new MobSpawnSettings.Builder();
    static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

    public GlowShroomBayou() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeSpecialEffects.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).grassColorOverride(GRASS_COLOR).foliageColorOverride(FOLIAGE_COLOR).skyColor(BiomeHelper.calcSkyColor(0.8F)).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());

    }

    @Override
    public int getGrassColor(double x, double z) {
        double d0 = BIOME_INFO_NOISE.getValue(x * 0.0225D, z * 0.0225D, false);
        return d0 < -0.1D ? 7375928 : 6981433;
    }

    @Override
    public int getFoliageColor() {
        return 6337104;
    }

    @Override
    public Biome getRiver() {
        return this;
    }


    static {
        BYGTreeFeatures.addGlowshroomBayouVegetation(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultCarvers(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultMonsterRoom(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultOres(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addSwampClayDisk(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addSwampExtraVegetation(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addDefaultSprings(GENERATION_SETTINGS);
        GENERATION_SETTINGS.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_NORMAL);
        BYGFeatures.addBYGSwampVegetation(GENERATION_SETTINGS);
        BYGFeatures.addMarshGrass(GENERATION_SETTINGS);
        BYGFeatures.addGlowcane(GENERATION_SETTINGS);
        BYGFeatures.addCattails(GENERATION_SETTINGS);
        BYGFeatures.addMudDisks(GENERATION_SETTINGS);
        BiomeDefaultFeatures.addSurfaceFreezing(GENERATION_SETTINGS);
        BYGFeatures.addPeachleatherflower(GENERATION_SETTINGS);
        BYGFeatures.addVioletleatherflower(GENERATION_SETTINGS);
        BYGFeatures.addRedorchid(GENERATION_SETTINGS);
        BYGFeatures.addPurpleOrchid(GENERATION_SETTINGS);
        BYGFeatures.addPinkOrchid(GENERATION_SETTINGS);
        BYGFeatures.addGlowshrooms(GENERATION_SETTINGS);
        BYGTreeFeatures.addHugeGlowshrooms(GENERATION_SETTINGS);

    }
}
