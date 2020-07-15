package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import voronoiaoc.byg.common.world.worldtype.noise.fastnoise.FastNoise;
import voronoiaoc.byg.core.byglists.BYGBlockList;
import voronoiaoc.byg.core.byglists.BYGSBList;

import java.util.Random;
import java.util.function.Function;

public class StoneForestSB extends SurfaceBuilder<SurfaceBuilderConfig> {
    public static final BlockState SAND = Blocks.SAND.getDefaultState();

    public StoneForestSB(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> config) {
        super(config);
    }

    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        BlockPos.Mutable block = new BlockPos.Mutable();
        FastNoise noiseGen = new FastNoise();
        noiseGen.SetSeed((int) seed);
        noiseGen.SetFractalType(FastNoise.FractalType.RigidMulti);
        noiseGen.SetNoiseType(FastNoise.NoiseType.SimplexFractal);
        noiseGen.SetGradientPerturbAmp(1);
        noiseGen.SetFractalOctaves(1);
        noiseGen.SetFractalGain(0.3f);
        noiseGen.SetFrequency(0.02f);
        int xPos = x & 15;
        int zPos = z & 15;
        float sampleNoise = noiseGen.GetNoise(x, z);
        if(sampleNoise < 0.45) {
            for (int yPos = startHeight + 55; yPos >= seaLevel; --yPos) {
                block.setPos(xPos, yPos, zPos);
                if (yPos == startHeight + 55)
                    chunkIn.setBlockState(block, BYGBlockList.OVERGROWN_STONE.getDefaultState(), false);
                else
                    chunkIn.setBlockState(block, STONE, false);
            }
        }
        else if (sampleNoise < 0.5) {
            for (int yPos = startHeight + 44; yPos >= seaLevel; --yPos) {
                block.setPos(xPos, yPos, zPos);
                if (yPos == startHeight + 44)
                    chunkIn.setBlockState(block, BYGBlockList.OVERGROWN_STONE.getDefaultState(), false);
                else
                    chunkIn.setBlockState(block, STONE, false);
            }
        }
        else
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.GRASSSTONEMOUNTAIN_CF);
    }
}