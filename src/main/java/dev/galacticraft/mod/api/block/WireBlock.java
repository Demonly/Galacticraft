/*
 * Copyright (c) 2019-2024 Team Galacticraft
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.galacticraft.mod.api.block;

import dev.galacticraft.mod.Constant;
import dev.galacticraft.mod.Galacticraft;
import dev.galacticraft.mod.api.wire.Wire;
import dev.galacticraft.mod.content.block.entity.networked.WireBlockEntity;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;
import team.reborn.energy.api.EnergyStorage;

/**
 * @author <a href="https://github.com/TeamGalacticraft">TeamGalacticraft</a>
 */
public abstract class WireBlock extends Block implements EntityBlock {
    public WireBlock(Properties settings) {
        super(settings.pushReaction(PushReaction.BLOCK));
    }

    @Override
    @Deprecated
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!world.isClientSide() && Galacticraft.CONFIG_MANAGER.get().isDebugLogEnabled() && FabricLoader.getInstance().isDevelopmentEnvironment()) {
            BlockEntity entity = world.getBlockEntity(pos);
            if (entity instanceof Wire wire) {
                Constant.LOGGER.info("Network: {}", wire.getNetwork());
            }
        }
        return super.use(state, world, pos, player, hand, hit);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborChanged(state, world, pos, block, fromPos, notify);
        if (!world.isClientSide()) {
            final BlockEntity blockEntity = world.getBlockEntity(pos);
            Wire wire = (Wire) blockEntity;
            assert wire != null;
            final BlockEntity blockEntityAdj = world.getBlockEntity(fromPos);
            BlockPos delta = fromPos.subtract(pos);
            if (wire.canConnect(Direction.fromDelta(delta.getX(), delta.getY(), delta.getZ()))) {
                if (blockEntityAdj instanceof Wire wire1) {
                    if (wire1.canConnect(Direction.fromDelta(delta.getX(), delta.getY(), delta.getZ()).getOpposite())) {
                        wire.getOrCreateNetwork().addWire(fromPos, wire1);
                    }
                } else {

                    if (EnergyStorage.SIDED.find(world, fromPos, Direction.fromDelta(delta.getX(), delta.getY(), delta.getZ()).getOpposite()) != null) {
                        wire.getOrCreateNetwork().updateConnection(pos, fromPos);
                    } else if (wire.getNetwork() != null) {
                        wire.getNetwork().updateConnection(pos, fromPos);
                    }
                }
            }
        }
    }

    @Nullable
    @Override
    public abstract WireBlockEntity newBlockEntity(BlockPos pos, BlockState state);
}
