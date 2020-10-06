package corgiaoc.byg.core.registries;

import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import corgiaoc.byg.BYG;
import corgiaoc.byg.core.byglists.BYGFeatureList;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGRegistries {

    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        BYG.LOGGER.debug("BYG: Registering Features...");
        BYGFeatureList.RegisterFeatures.registerBYGFeatures();
        BYG.LOGGER.info("BYG: Features Registered!");
        BYGBiomeRegistry.registerBYGBiomes();
    }
}