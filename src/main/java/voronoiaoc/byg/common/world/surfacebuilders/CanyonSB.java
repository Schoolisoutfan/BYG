package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.Tags;
import voronoiaoc.byg.common.world.worldtype.noise.fastnoise.FastNoise;
import voronoiaoc.byg.core.byglists.BYGSBList;

import java.util.Random;
import java.util.function.Function;

public class CanyonSB extends SurfaceBuilder<SurfaceBuilderConfig> {
    public CanyonSB(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> config) {
        super(config);
    }
    protected long seed;
    protected FastNoise noiseGen = null;
    protected FastNoise noiseGen2 = null;
    protected FastNoise noiseGen3 = null;

    public BlockState layerBlock = Blocks.TERRACOTTA.getDefaultState();

    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int groundHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        setSeed(seed);
        BlockPos.Mutable block = new BlockPos.Mutable();
        int xPos = x & 15;
        int zPos = z & 15;

        double noiseSample = noiseGen.GetNoise(x, z) * 10;
        double noiseSample2 = (noiseGen2.GetNoise(x, z) * 15) + (noiseGen3.GetNoise(x,z) * 9) * noiseGen3.GetNoise(x, z);

        //0.03 is effectively one block w/ the ridged noise sample.
        if (noiseSample > 9.0) {
            for (int yPos = groundHeight; yPos >= seaLevel - noiseSample2; --yPos) {
                block.setPos(xPos, yPos, zPos);
                if (noiseSample < 9.06) {
                    if (yPos < groundHeight - 10)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.12) {
                    if (yPos < groundHeight - 13)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.18) {
                    if (yPos < groundHeight - 16)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.24) {
                    if (yPos < groundHeight - 19)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.45) {
                    if (yPos < groundHeight - 22)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.51) {
                    if (yPos < groundHeight - 32)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.57) {
                    if (yPos < groundHeight - 35)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.63) {
                    if (yPos < groundHeight - 38)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else if (noiseSample < 9.69) {
                    if (yPos < groundHeight - 41)
                        chunkIn.setBlockState(block, Blocks.STONE.getDefaultState(), false);
                    else
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                }
                else {
                    if (yPos > seaLevel) {
                        chunkIn.setBlockState(block, Blocks.AIR.getDefaultState(), false);
                    }
                    else
                        chunkIn.setBlockState(block, Blocks.WATER.getDefaultState(), false);
                }
            }
        }
        if (noiseSample > 8.8F && noiseSample <= 9.0F)
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, groundHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.RED_ROCK_CF);

        if (noiseSample < 8.8F) {
            if (noise < 1)
                SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, groundHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.REDSAND_CF);
            else
                SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, groundHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, randomSurfaceConfig(random));
        }

        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (int yPos = groundHeight - 3; yPos >= seaLevel - 15; yPos--) {
            setStrataLayerBlock(yPos);
            mutable.setPos(xPos, yPos, zPos);

            if (chunkIn.getBlockState(mutable).isIn(Tags.Blocks.STONE))
                chunkIn.setBlockState(mutable, layerBlock, false);
        }
    }


    public void setSeed(long seed) {
        if (noiseGen == null) {
            noiseGen = new FastNoise((int) seed);
            noiseGen.SetFractalType(FastNoise.FractalType.RigidMulti);
            noiseGen.SetNoiseType(FastNoise.NoiseType.SimplexFractal);
            noiseGen.SetGradientPerturbAmp(1);
            noiseGen.SetFractalOctaves(1);
            noiseGen.SetFractalGain(0.3f);
            noiseGen.SetFrequency(0.0009F);
        }
        if (noiseGen2 == null) {
            noiseGen2 = new FastNoise((int) seed + 20);
            noiseGen2.SetNoiseType(FastNoise.NoiseType.Simplex);
            noiseGen2.SetFractalOctaves(2);
            noiseGen2.SetFractalGain(0.3f);
            noiseGen2.SetFrequency(0.008F);
        }
        if (noiseGen3 == null) {
            noiseGen3 = new FastNoise((int) seed + 277);
            noiseGen3.SetNoiseType(FastNoise.NoiseType.Simplex);
            noiseGen3.SetFractalOctaves(2);
            noiseGen3.SetFractalGain(0.3f);
            noiseGen3.SetFrequency(0.004F);
        }
    }

    public static SurfaceBuilderConfig randomSurfaceConfig(Random random) {
        int randomizer = random.nextInt(3);
        if (randomizer == 1) {
            return SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG;
        } else
            return BYGSBList.BYGSBConfigList.COARSE;
    }

    public void setStrataLayerBlock(int yPos) {
        if (yPos % 12 == 0)
            layerBlock = Blocks.BROWN_TERRACOTTA.getDefaultState();
        else if (yPos % 13 == 0)
            layerBlock = Blocks.ORANGE_TERRACOTTA.getDefaultState();
        else if (yPos % 14 == 0)
            layerBlock = Blocks.YELLOW_TERRACOTTA.getDefaultState();
        else if (yPos % 15 == 0)
            layerBlock = Blocks.TERRACOTTA.getDefaultState();
        else if (yPos % 16 == 0)
            layerBlock = Blocks.TERRACOTTA.getDefaultState();
    }
}