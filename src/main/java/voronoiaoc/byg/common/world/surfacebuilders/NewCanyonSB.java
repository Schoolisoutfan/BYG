package voronoiaoc.byg.common.world.surfacebuilders;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import voronoiaoc.byg.BYG;
import voronoiaoc.byg.common.world.worldtype.noise.fastnoise.FastNoise;
import voronoiaoc.byg.core.byglists.BYGSBList;

import java.util.Random;
import java.util.function.Function;

public class NewCanyonSB extends SurfaceBuilder<SurfaceBuilderConfig> {
    public NewCanyonSB(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> config) {
        super(config);
    }
    protected long seed;
    protected FastNoise noiseGen = null;

    public BlockState layerBlock = Blocks.TERRACOTTA.getDefaultState();

    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int groundHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        setSeed(seed);
        int xPos = x & 15;
        int zPos = z & 15;
        BlockPos.Mutable mutable = new BlockPos.Mutable(xPos, 0, z);

        double noiseSample = noiseGen.GetNoise(x, z) * 10;
        mutable.move(Direction.UP, groundHeight);

        int centerY = chunkIn.getTopBlockY(Heightmap.Type.OCEAN_FLOOR_WG, x, z);
        int someNumber = 0;
        int startHeight = groundHeight;

        for (int xCoord = -1; xCoord <= 1; xCoord++) {
            for (int zCoord = -1; zCoord <= 1; zCoord++) {
                int offSetY = chunkIn.getTopBlockY(Heightmap.Type.OCEAN_FLOOR_WG, x + xCoord, z + zCoord);
                if (centerY < offSetY)
                    someNumber+= offSetY - centerY;

            }
        }
        BYG.LOGGER.info(someNumber);
        if (someNumber > 12)
            startHeight = 5;

        for (int yPos = groundHeight; yPos >= startHeight; --yPos) {
            chunkIn.setBlockState(mutable, Blocks.AIR.getDefaultState(), false);

            mutable.move(Direction.DOWN);
        }

        SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, groundHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, BYGSBList.BYGSBConfigList.GRASSDOVERMOUNTAIN_CF);

    }

    public void setSeed(long seed) {
        if (noiseGen == null) {
            noiseGen = new FastNoise((int) seed);
            noiseGen.SetFractalType(FastNoise.FractalType.RigidMulti);
            noiseGen.SetNoiseType(FastNoise.NoiseType.SimplexFractal);
            noiseGen.SetGradientPerturbAmp(1);
            noiseGen.SetFractalOctaves(1);
            noiseGen.SetFractalGain(0.3f);
            noiseGen.SetFrequency(0.00375F);
        }
    }

    public static SurfaceBuilderConfig randomSurfaceConfig(Random random) {
        int randomizer = random.nextInt(7);
        if (randomizer == 1) {
            return BYGSBList.BYGSBConfigList.BLUE_ICE_CF;
        } else if(randomizer == 2 || randomizer == 3)
            return BYGSBList.BYGSBConfigList.PACKED_ICE_CF;

        else
            return BYGSBList.BYGSBConfigList.SNOW_CF;
    }

    public void setStrataLayerBlock(int yPos) {
        if (yPos % 5 == 0)
            layerBlock = Blocks.SNOW_BLOCK.getDefaultState();
        else if(yPos % 2 == 0)
            layerBlock = Blocks.PACKED_ICE.getDefaultState();
        else if (yPos % 7 == 0)
            layerBlock = Blocks.BLUE_ICE.getDefaultState();


    }
}