package voronoiaoc.byg.common.world.feature.features.nether.whalinggarth;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.function.Function;

public class WhalingGrass extends Feature<NoFeatureConfig> {
    public WhalingGrass(Function<Dynamic<?>, ? extends NoFeatureConfig> config) {
        super(config);
    }

    public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        if (!worldIn.isAirBlock(pos)) {
            return false;
        } else if ((worldIn.getBlockState(pos.down()).getBlock() == BYGBlockList.OVERGROWN_NETHERRACK) || (worldIn.getBlockState(pos.down()).getBlock() == Blocks.SOUL_SAND)) {
            worldIn.setBlockState(pos, BYGBlockList.WHALING_GRASS.getDefaultState(), 2);
            return true;
        }
        return true;
    }
}