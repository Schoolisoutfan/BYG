package voronoiaoc.byg.common.world.worldtype.layers.biomemix;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import voronoiaoc.byg.common.world.worldtype.layers.InitLayer;
import voronoiaoc.byg.common.world.worldtype.math.BiomeGroupManager;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class MixContinentLayer extends InitLayer {

    List<Biome> biomes = new ArrayList<>();

    public MixContinentLayer(BiomeGroupManager manager) {
        super(manager);
    }

    @Override
    public int apply(INoiseRandom rand, int genX, int genZ) {
        return Registry.BIOME.getId(biomes.get(rand.random(biomes.size())));
    }
}
