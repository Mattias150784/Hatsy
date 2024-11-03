package net.mattias.hatsy.core.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TailorMachine extends Block {

    public TailorMachine(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return makeShape();
    }

    @Override
    public VoxelShape getInteractionShape(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return Shapes.box(-0.5, 0, 0, 1.5, 1.5, 1); // Larger bounding box for mining
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return makeShape();
    }

    private VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        // Create shapes to cover the entire area needed
        shape = Shapes.join(shape, Shapes.box(-0.5, 0, 0, 1.5, 0.875, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.5, 0.875, 0, 1.5, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 1, 0.375, 1.3125, 1.125, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(1.125, 1.125, 0.375, 1.3125, 1.6875, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 1.5625, 0.375, 1.125, 1.6875, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 1.4375, 0.375, 0.8125, 1.6875, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 1.3125, 0.5, 0.75, 1.4375, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 1.1875, 0.5625, 0.6875, 1.3125, 0.625), BooleanOp.OR);
        return shape;
    }

    // Disable ambient occlusion to reduce dark shadows
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return false;
    }
}
