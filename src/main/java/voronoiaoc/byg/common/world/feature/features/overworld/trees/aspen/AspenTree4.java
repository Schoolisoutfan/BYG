package voronoiaoc.byg.common.world.feature.features.overworld.trees.aspen;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;
import voronoiaoc.byg.core.byglists.BYGBlockList;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class AspenTree4 extends BYGAbstractTreeFeature<NoFeatureConfig> {


    public AspenTree4(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn) {
        super(configIn);
    }

    /**
     * TODO: Redo.
     */
    public boolean place(Set<BlockPos> treeBlockSet, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling) {
        int randTreeHeight = 23 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.offset(Direction.DOWN), Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, isSapling)) {
                return false;
            } else {
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 4, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 8, 0), boundsIn);

                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 0, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 0, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 0, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 1, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 1, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 1, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 2, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 2, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 2, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 9, 0), boundsIn);

                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 3, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 3, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 3, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 4, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 4, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 4, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 4, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 5, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 5, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 5, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 6, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 6, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 6, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 7, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 7, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 7, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 8, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 8, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 8, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 8, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 9, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 9, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 9, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 9, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 10, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 10, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 10, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 10, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 11, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 11, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 11, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 11, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 12, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 12, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 12, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 12, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 13, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 13, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 13, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 13, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 14, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 14, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 14, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 14, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 15, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 15, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 15, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 15, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 16, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 16, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 16, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 16, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 17, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 17, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 17, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 17, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 18, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 18, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 18, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 18, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 19, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 19, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 19, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 19, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 20, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 20, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 20, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 20, 1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 21, -1), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(-1, 21, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(1, 21, 0), boundsIn);
                this.treeLog(treeBlockSet, worldIn, mainmutable.add(0, 21, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 9, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 9, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 10, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(-1, 10, 1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 11, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(1, 11, -1), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 12, -2), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(2, 12, 0), boundsIn);
                this.treeBranch(treeBlockSet, worldIn, mainmutable.add(0, 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 6, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 9, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-4, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 9, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 9, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 10, 4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 11, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 11, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 12, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 12, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-3, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(4, 12, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 12, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 12, 3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, -5), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 13, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, -4), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 13, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(3, 13, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 13, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 13, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 14, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-2, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 14, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 14, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 15, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 15, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 15, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(1, 16, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 16, -1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 16, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 16, 2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 17, -3), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 17, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(2, 17, 0), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 17, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 18, -2), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(-1, 18, 1), boundsIn);
                this.leafs(treeBlockSet, worldIn, mainmutable.add(0, 19, -2), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isQualifiedForLog(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, BYGBlockList.PINE_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (isAir(reader, pos)) {
            this.setFinalBlockState(blockPos, reader, pos, BYGBlockList.PINE_LEAVES.getDefaultState(), boundingBox);
        }
    }



}