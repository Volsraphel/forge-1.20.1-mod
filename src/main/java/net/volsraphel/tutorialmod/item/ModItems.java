package net.volsraphel.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.volsraphel.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> KUROIWA = ITEMS.register("kuroiwa",
            () -> new Item(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> MINE = ITEMS.register("mine",
            () -> new Item(new Item.Properties().stacksTo(32)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
