package net.logiczock.onetoonenethertravel;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
//@EventBusSubscriber(modid = OneToOneNetherTravel.MODID, bus = EventBusSubscriber.Bus.MOD)
//public class Config
//{
//    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
//
//    private static final ModConfigSpec.DoubleValue NETHER_COORD_SCALE = BUILDER
//            .comment("Coordinate scale between The Nether and Overworld. Vanilla value is 8.0.")
//            .defineInRange("nether_coord_scale", 1.0,0.03125,32);
//
//    static final ModConfigSpec SPEC = BUILDER.build();
//
//    public static double netherCoordScale;
//
//    private static boolean validateItemName(final Object obj)
//    {
//        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
//    }

//    @SubscribeEvent
//    static void onLoad(final ModConfigEvent event)
//    {
//        netherCoordScale = NETHER_COORD_SCALE.get();
//    }
//}
