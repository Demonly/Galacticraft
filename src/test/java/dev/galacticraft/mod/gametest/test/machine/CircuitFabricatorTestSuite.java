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

package dev.galacticraft.mod.gametest.test.machine;

import dev.galacticraft.machinelib.api.gametest.RecipeGameTest;
import dev.galacticraft.machinelib.api.gametest.annotation.container.DefaultedMetadata;
import dev.galacticraft.machinelib.api.storage.MachineItemStorage;
import dev.galacticraft.mod.content.GCMachineTypes;
import dev.galacticraft.mod.content.block.entity.machine.CircuitFabricatorBlockEntity;
import dev.galacticraft.mod.content.item.GCItems;
import dev.galacticraft.mod.gametest.test.GalacticraftGameTest;
import dev.galacticraft.mod.recipe.FabricationRecipe;
import net.minecraft.gametest.framework.GameTestGenerator;
import net.minecraft.gametest.framework.TestFunction;
import net.minecraft.world.Container;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author <a href="https://github.com/TeamGalacticraft">TeamGalacticraft</a>
 */
@DefaultedMetadata(structure = GalacticraftGameTest.SINGLE_BLOCK)
public final class CircuitFabricatorTestSuite extends RecipeGameTest<Container, FabricationRecipe, CircuitFabricatorBlockEntity> {
    public CircuitFabricatorTestSuite() {
        super(GCMachineTypes.CIRCUIT_FABRICATOR, CircuitFabricatorBlockEntity.INPUT_SLOT, CircuitFabricatorBlockEntity.OUTPUT_SLOT);
    }

    @Override
    @GameTestGenerator
    public @NotNull List<TestFunction> generateTests() {
        List<TestFunction> functions = super.generateTests();
        functions.add(this.createChargeFromEnergyItemTest(CircuitFabricatorBlockEntity.CHARGE_SLOT, GCItems.INFINITE_BATTERY));
        return functions;
    }

    @Override
    protected void fulfillRunRequirements(@NotNull CircuitFabricatorBlockEntity machine) {
        machine.energyStorage().setEnergy(Long.MAX_VALUE / 2);
        machine.itemStorage().getSlot(CircuitFabricatorBlockEntity.DIAMOND_SLOT).set(Items.DIAMOND, 1);
        machine.itemStorage().getSlot(CircuitFabricatorBlockEntity.REDSTONE_SLOT).set(Items.REDSTONE, 1);
        machine.itemStorage().getSlot(CircuitFabricatorBlockEntity.SILICON_SLOT_1).set(GCItems.RAW_SILICON, 1);
        machine.itemStorage().getSlot(CircuitFabricatorBlockEntity.SILICON_SLOT_2).set(GCItems.RAW_SILICON, 1);
    }

    @Override
    protected int getRecipeRuntime() {
        return 300;
    }

    @Override
    protected void createValidRecipe(@NotNull MachineItemStorage storage) {
        storage.getSlot(CircuitFabricatorBlockEntity.INPUT_SLOT).set(Items.REDSTONE_TORCH, 1);
    }
}
