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

package dev.galacticraft.mod.data;

import dev.galacticraft.mod.content.GCBlocks;
import dev.galacticraft.mod.content.block.special.rocketlaunchpad.RocketLaunchPadBlock;
import dev.galacticraft.mod.content.item.GCItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class GCBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected GCBlockLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    public LootTable.Builder siliconOreDrops(Block ore) {
        return createSilkTouchDispatchTable(ore, this.applyExplosionDecay(ore, LootItem.lootTableItem(GCItems.RAW_SILICON)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(4.0F, 6.0F)))
                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
        ));
    }

    @Override
    public void generate() {
        this.dropSelf(GCBlocks.GLOWSTONE_TORCH);
        this.dropSelf(GCBlocks.UNLIT_TORCH);

        this.dropSelf(GCBlocks.GLOWSTONE_LANTERN);
        this.dropSelf(GCBlocks.UNLIT_LANTERN);

        this.dropSelf(GCBlocks.ALUMINUM_DECORATION);
        this.dropSelf(GCBlocks.ALUMINUM_DECORATION_SLAB);
        this.dropSelf(GCBlocks.ALUMINUM_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.ALUMINUM_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_ALUMINUM_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_ALUMINUM_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_ALUMINUM_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_ALUMINUM_DECORATION_WALL);

        this.dropSelf(GCBlocks.BRONZE_DECORATION);
        this.dropSelf(GCBlocks.BRONZE_DECORATION_SLAB);
        this.dropSelf(GCBlocks.BRONZE_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.BRONZE_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_BRONZE_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_BRONZE_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_BRONZE_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_BRONZE_DECORATION_WALL);

        this.dropSelf(GCBlocks.COPPER_DECORATION);
        this.dropSelf(GCBlocks.COPPER_DECORATION_SLAB);
        this.dropSelf(GCBlocks.COPPER_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.COPPER_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_COPPER_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_COPPER_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_COPPER_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_COPPER_DECORATION_WALL);

        this.dropSelf(GCBlocks.IRON_DECORATION);
        this.dropSelf(GCBlocks.IRON_DECORATION_SLAB);
        this.dropSelf(GCBlocks.IRON_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.IRON_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_IRON_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_IRON_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_IRON_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_IRON_DECORATION_WALL);

        this.dropSelf(GCBlocks.METEORIC_IRON_DECORATION);
        this.dropSelf(GCBlocks.METEORIC_IRON_DECORATION_SLAB);
        this.dropSelf(GCBlocks.METEORIC_IRON_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.METEORIC_IRON_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_METEORIC_IRON_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_METEORIC_IRON_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_METEORIC_IRON_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_METEORIC_IRON_DECORATION_WALL);

        this.dropSelf(GCBlocks.STEEL_DECORATION);
        this.dropSelf(GCBlocks.STEEL_DECORATION_SLAB);
        this.dropSelf(GCBlocks.STEEL_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.STEEL_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_STEEL_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_STEEL_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_STEEL_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_STEEL_DECORATION_WALL);

        this.dropSelf(GCBlocks.TIN_DECORATION);
        this.dropSelf(GCBlocks.TIN_DECORATION_SLAB);
        this.dropSelf(GCBlocks.TIN_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.TIN_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_TIN_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_TIN_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_TIN_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_TIN_DECORATION_WALL);

        this.dropSelf(GCBlocks.TITANIUM_DECORATION);
        this.dropSelf(GCBlocks.TITANIUM_DECORATION_SLAB);
        this.dropSelf(GCBlocks.TITANIUM_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.TITANIUM_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_TITANIUM_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_TITANIUM_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_TITANIUM_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_TITANIUM_DECORATION_WALL);

        this.dropSelf(GCBlocks.DARK_DECORATION);
        this.dropSelf(GCBlocks.DARK_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DARK_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DARK_DECORATION_WALL);
        this.dropSelf(GCBlocks.DETAILED_DARK_DECORATION);
        this.dropSelf(GCBlocks.DETAILED_DARK_DECORATION_SLAB);
        this.dropSelf(GCBlocks.DETAILED_DARK_DECORATION_STAIRS);
        this.dropSelf(GCBlocks.DETAILED_DARK_DECORATION_WALL);

        this.dropSelf(GCBlocks.MOON_TURF);
        this.dropSelf(GCBlocks.MOON_DIRT);
        this.dropOther(GCBlocks.MOON_DIRT_PATH, GCBlocks.MOON_DIRT);
        this.dropSelf(GCBlocks.MOON_SURFACE_ROCK);

        this.add(GCBlocks.MOON_ROCK, this.createSingleItemTableWithSilkTouch(GCBlocks.MOON_ROCK, GCBlocks.COBBLED_MOON_ROCK));
        this.dropSelf(GCBlocks.MOON_ROCK_SLAB);
        this.dropSelf(GCBlocks.MOON_ROCK_STAIRS);
        this.dropSelf(GCBlocks.MOON_ROCK_WALL);

        this.dropSelf(GCBlocks.COBBLED_MOON_ROCK);
        this.dropSelf(GCBlocks.COBBLED_MOON_ROCK_SLAB);
        this.dropSelf(GCBlocks.COBBLED_MOON_ROCK_STAIRS);
        this.dropSelf(GCBlocks.COBBLED_MOON_ROCK_WALL);

        this.add(GCBlocks.LUNASLATE, this.createSingleItemTableWithSilkTouch(GCBlocks.LUNASLATE, GCBlocks.COBBLED_LUNASLATE));
        this.dropSelf(GCBlocks.LUNASLATE_SLAB);
        this.dropSelf(GCBlocks.LUNASLATE_STAIRS);
        this.dropSelf(GCBlocks.LUNASLATE_WALL);

        this.dropSelf(GCBlocks.COBBLED_LUNASLATE);
        this.dropSelf(GCBlocks.COBBLED_LUNASLATE_SLAB);
        this.dropSelf(GCBlocks.COBBLED_LUNASLATE_STAIRS);
        this.dropSelf(GCBlocks.COBBLED_LUNASLATE_WALL);

        this.dropSelf(GCBlocks.MOON_BASALT);
        this.dropSelf(GCBlocks.MOON_BASALT_SLAB);
        this.dropSelf(GCBlocks.MOON_BASALT_STAIRS);
        this.dropSelf(GCBlocks.MOON_BASALT_WALL);

        this.dropSelf(GCBlocks.MOON_BASALT_BRICK);
        this.dropSelf(GCBlocks.MOON_BASALT_BRICK_SLAB);
        this.dropSelf(GCBlocks.MOON_BASALT_BRICK_STAIRS);
        this.dropSelf(GCBlocks.MOON_BASALT_BRICK_WALL);

        this.dropSelf(GCBlocks.CRACKED_MOON_BASALT_BRICK);
        this.dropSelf(GCBlocks.CRACKED_MOON_BASALT_BRICK_SLAB);
        this.dropSelf(GCBlocks.CRACKED_MOON_BASALT_BRICK_STAIRS);
        this.dropSelf(GCBlocks.CRACKED_MOON_BASALT_BRICK_WALL);

        this.dropSelf(GCBlocks.MARS_SURFACE_ROCK);
        this.dropSelf(GCBlocks.MARS_SUB_SURFACE_ROCK);

        this.add(GCBlocks.MARS_STONE, this.createSingleItemTableWithSilkTouch(GCBlocks.MARS_STONE, GCBlocks.MARS_COBBLESTONE));
        this.dropSelf(GCBlocks.MARS_STONE_SLAB);
        this.dropSelf(GCBlocks.MARS_STONE_STAIRS);
        this.dropSelf(GCBlocks.MARS_STONE_WALL);

        this.dropSelf(GCBlocks.MARS_COBBLESTONE);
        this.dropSelf(GCBlocks.MARS_COBBLESTONE_SLAB);
        this.dropSelf(GCBlocks.MARS_COBBLESTONE_STAIRS);
        this.dropSelf(GCBlocks.MARS_COBBLESTONE_WALL);

        this.dropSelf(GCBlocks.ASTEROID_ROCK);
        this.dropSelf(GCBlocks.ASTEROID_ROCK_1);
        this.dropSelf(GCBlocks.ASTEROID_ROCK_2);

        this.dropSelf(GCBlocks.SOFT_VENUS_ROCK);
        this.dropSelf(GCBlocks.HARD_VENUS_ROCK);
        this.dropSelf(GCBlocks.SCORCHED_VENUS_ROCK);
        this.add(GCBlocks.VOLCANIC_ROCK, createSilkTouchOnlyTable(GCBlocks.VOLCANIC_ROCK));
        this.dropSelf(GCBlocks.PUMICE);
        this.add(GCBlocks.VAPOR_SPOUT, this.createSingleItemTableWithSilkTouch(GCBlocks.VAPOR_SPOUT, GCBlocks.SOFT_VENUS_ROCK));

        this.dropSelf(GCBlocks.WALKWAY);
        this.dropSelf(GCBlocks.FLUID_PIPE_WALKWAY);
        this.dropSelf(GCBlocks.WIRE_WALKWAY);
        this.dropSelf(GCBlocks.TIN_LADDER);
        this.dropSelf(GCBlocks.GRATING);

        this.dropSelf(GCBlocks.ALUMINUM_WIRE);
        this.dropSelf(GCBlocks.SEALABLE_ALUMINUM_WIRE);
        this.dropSelf(GCBlocks.HEAVY_SEALABLE_ALUMINUM_WIRE);
        this.dropSelf(GCBlocks.GLASS_FLUID_PIPE);

        this.dropSelf(GCBlocks.SQUARE_LIGHT_PANEL);
        this.dropSelf(GCBlocks.SPOTLIGHT_LIGHT_PANEL);
        this.dropSelf(GCBlocks.LINEAR_LIGHT_PANEL);
        this.dropSelf(GCBlocks.DASHED_LIGHT_PANEL);
        this.dropSelf(GCBlocks.DIAGONAL_LIGHT_PANEL);

        this.dropSelf(GCBlocks.VACUUM_GLASS);
        this.dropSelf(GCBlocks.CLEAR_VACUUM_GLASS);
        this.dropSelf(GCBlocks.STRONG_VACUUM_GLASS);

        this.add(GCBlocks.SILICON_ORE, this.siliconOreDrops(GCBlocks.SILICON_ORE));
        this.add(GCBlocks.DEEPSLATE_SILICON_ORE, this.siliconOreDrops(GCBlocks.DEEPSLATE_SILICON_ORE));
        this.add(GCBlocks.MOON_COPPER_ORE, this.createCopperOreDrops(GCBlocks.MOON_COPPER_ORE));
        this.add(GCBlocks.LUNASLATE_COPPER_ORE, this.createCopperOreDrops(GCBlocks.MOON_COPPER_ORE));

        this.add(GCBlocks.TIN_ORE, this.createOreDrop(GCBlocks.TIN_ORE, GCItems.RAW_TIN));
        this.add(GCBlocks.DEEPSLATE_TIN_ORE, this.createOreDrop(GCBlocks.DEEPSLATE_TIN_ORE, GCItems.RAW_TIN));
        this.add(GCBlocks.MOON_TIN_ORE, this.createOreDrop(GCBlocks.MOON_TIN_ORE, GCItems.RAW_TIN));
        this.add(GCBlocks.LUNASLATE_TIN_ORE, this.createOreDrop(GCBlocks.LUNASLATE_TIN_ORE, GCItems.RAW_TIN));

        this.add(GCBlocks.ALUMINUM_ORE, this.createOreDrop(GCBlocks.ALUMINUM_ORE, GCItems.RAW_ALUMINUM));
        this.add(GCBlocks.DEEPSLATE_ALUMINUM_ORE, this.createOreDrop(GCBlocks.ALUMINUM_ORE, GCItems.RAW_ALUMINUM));

        this.add(GCBlocks.DESH_ORE, this.createOreDrop(GCBlocks.DESH_ORE, GCItems.RAW_DESH));

        this.add(GCBlocks.ILMENITE_ORE, this.createOreDrop(GCBlocks.ILMENITE_ORE, GCItems.RAW_TITANIUM));

        this.add(GCBlocks.GALENA_ORE, this.createOreDrop(GCBlocks.GALENA_ORE, GCItems.RAW_LEAD));

        this.add(GCBlocks.MOON_CHEESE_BLOCK, noDrop());
        this.add(GCBlocks.CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.CANDLE));
        this.add(GCBlocks.WHITE_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.WHITE_CANDLE));
        this.add(GCBlocks.ORANGE_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.ORANGE_CANDLE));
        this.add(GCBlocks.MAGENTA_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.MAGENTA_CANDLE));
        this.add(GCBlocks.LIGHT_BLUE_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        this.add(GCBlocks.YELLOW_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.YELLOW_CANDLE));
        this.add(GCBlocks.LIME_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.LIME_CANDLE));
        this.add(GCBlocks.PINK_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.PINK_CANDLE));
        this.add(GCBlocks.GRAY_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.GRAY_CANDLE));
        this.add(GCBlocks.LIGHT_GRAY_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        this.add(GCBlocks.CYAN_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.CYAN_CANDLE));
        this.add(GCBlocks.PURPLE_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.PURPLE_CANDLE));
        this.add(GCBlocks.BLUE_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.BLUE_CANDLE));
        this.add(GCBlocks.BROWN_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.BROWN_CANDLE));
        this.add(GCBlocks.GREEN_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.GREEN_CANDLE));
        this.add(GCBlocks.RED_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.RED_CANDLE));
        this.add(GCBlocks.BLACK_CANDLE_MOON_CHEESE_BLOCK, createCandleCakeDrops(Blocks.BLACK_CANDLE));

        this.dropSelf(GCBlocks.SILICON_BLOCK);
        this.dropSelf(GCBlocks.METEORIC_IRON_BLOCK);
        this.dropSelf(GCBlocks.DESH_BLOCK);
        this.dropSelf(GCBlocks.TITANIUM_BLOCK);
        this.dropSelf(GCBlocks.LEAD_BLOCK);
        this.dropSelf(GCBlocks.LUNAR_SAPPHIRE_BLOCK);

        this.add(GCBlocks.FALLEN_METEOR, block -> BlockLootSubProvider.createSilkTouchDispatchTable(block, this.applyExplosionDecay(block, LootItem.lootTableItem(GCItems.RAW_METEORIC_IRON)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 2.0f))))));

        this.dropSelf(GCBlocks.LUNAR_CARTOGRAPHY_TABLE);

        this.add(GCBlocks.CAVERNOUS_VINES, BlockLootSubProvider::createShearsOnlyDrop);
        this.add(GCBlocks.MOON_BERRY_BUSH, block -> this.applyExplosionDecay(block, LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3)))
                                .add(LootItem.lootTableItem(GCItems.MOON_BERRIES))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE)))
                        .withPool(LootPool.lootPool()
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2)))
                                .add(LootItem.lootTableItem(GCItems.MOON_BERRIES))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                        )
                )
        );

        this.add(GCBlocks.ROCKET_LAUNCH_PAD, this::createRocketLaunchPadTable);
        this.dropSelf(GCBlocks.AIR_LOCK_CONTROLLER);
        this.dropSelf(GCBlocks.AIR_LOCK_FRAME);
        this.dropSelf(GCBlocks.CRYOGENIC_CHAMBER);
        this.dropSelf(GCBlocks.CIRCUIT_FABRICATOR);
        this.dropSelf(GCBlocks.COMPRESSOR);
        this.dropSelf(GCBlocks.ELECTRIC_COMPRESSOR);
        this.dropSelf(GCBlocks.COAL_GENERATOR);
        this.dropSelf(GCBlocks.BASIC_SOLAR_PANEL);
        this.dropSelf(GCBlocks.ADVANCED_SOLAR_PANEL);
        this.dropSelf(GCBlocks.ENERGY_STORAGE_MODULE);
        this.dropSelf(GCBlocks.ELECTRIC_FURNACE);
        this.dropSelf(GCBlocks.ELECTRIC_ARC_FURNACE);
        this.dropSelf(GCBlocks.REFINERY);
        this.dropSelf(GCBlocks.OXYGEN_COLLECTOR);
        this.dropSelf(GCBlocks.OXYGEN_SEALER);
        this.dropSelf(GCBlocks.OXYGEN_BUBBLE_DISTRIBUTOR);
        this.dropSelf(GCBlocks.OXYGEN_DECOMPRESSOR);
        this.dropSelf(GCBlocks.OXYGEN_COMPRESSOR);
        this.dropSelf(GCBlocks.OXYGEN_STORAGE_MODULE);
        this.dropSelf(GCBlocks.FUEL_LOADER);

        this.dropSelf(GCBlocks.PLAYER_TRANSPORT_TUBE);
        this.dropSelf(GCBlocks.ROCKET_WORKBENCH);

        this.add(GCBlocks.AIR_LOCK_SEAL, noDrop());

        dropSelf(GCBlocks.PARACHEST);
    }

    private LootTable.Builder createRocketLaunchPadTable(Block block) {
        return LootTable.lootTable().withPool(this.applyExplosionCondition(block, LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .add(LootItem.lootTableItem(block)
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RocketLaunchPadBlock.PART, RocketLaunchPadBlock.Part.NONE))))))
                .withPool(this.applyExplosionCondition(block, LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(9.0F))
                        .add(LootItem.lootTableItem(block)
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RocketLaunchPadBlock.PART, RocketLaunchPadBlock.Part.CENTER))))));
    }
}
