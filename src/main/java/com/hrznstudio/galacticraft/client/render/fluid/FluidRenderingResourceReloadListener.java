package com.hrznstudio.galacticraft.client.render.fluid;

import com.hrznstudio.galacticraft.Constants;
import net.fabricmc.fabric.api.resource.ResourceReloadListenerKeys;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.Collection;

public class FluidRenderingResourceReloadListener implements SimpleSynchronousResourceReloadListener {

    @Override
    public Identifier getFabricId() {
        return new Identifier(Constants.MOD_ID, "fluid_reload_listener");
    }

    @Override
    public Collection<Identifier> getFabricDependencies() {
        return Arrays.asList(ResourceReloadListenerKeys.MODELS, ResourceReloadListenerKeys.TEXTURES);
    }

    @Override
    public void apply(ResourceManager var1) {
//        FluidRenderHandler oilRenderHandler = new FluidRenderHandler() {
//            @Override
//            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state) {
//                return new Sprite[]{MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX).apply(new Identifier(Constants.MOD_ID, "block/crude_oil_still")), MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX).apply(new Identifier(Constants.MOD_ID, "block/crude_oil_flowing"))};
//            }
//
//            @Override
//            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state) {
//                return -1;
//            }
//        };
//
//        FluidRenderHandler fuelRenderHandler = new FluidRenderHandler() {
//            @Override
//            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state) {
//                return new Sprite[]{MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX).apply(new Identifier(Constants.MOD_ID, "block/fuel_still")), MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX).apply(new Identifier(Constants.MOD_ID, "block/fuel_flowing"))};
//            }
//
//            @Override
//            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state) {
//                return -1;
//            }
//        };
//
//        FluidRenderHandlerRegistry.INSTANCE.register(GalacticraftFluids.CRUDE_OIL, oilRenderHandler);
//        FluidRenderHandlerRegistry.INSTANCE.register(GalacticraftFluids.FLOWING_CRUDE_OIL, oilRenderHandler);
//        FluidRenderHandlerRegistry.INSTANCE.register(GalacticraftFluids.FUEL, fuelRenderHandler);
//        FluidRenderHandlerRegistry.INSTANCE.register(GalacticraftFluids.FLOWING_FUEL, fuelRenderHandler);
    }
}
