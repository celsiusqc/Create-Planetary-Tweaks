package net.celsiusqc.cp_tweaks.item;

import net.celsiusqc.cp_tweaks.CreatePlanetaryTweaks;
import net.celsiusqc.cp_tweaks.base.ToolTiers;
import net.celsiusqc.cp_tweaks.item.Tooltips.*;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ZincTools {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreatePlanetaryTweaks.MOD_ID);


    public static final RegistryObject<SwordItem> ZINC_SWORD = ITEMS.register("zinc_sword",
            () -> new ZincSwordTooltip(ToolTiers.ZINC, new Item.Properties()));
    //Attack DMG Bonus from Base  - Attack Speed float -- Adds to the base of 1attack dmg, 4 attack speed
    public static final RegistryObject<AxeItem> ZINC_AXE = ITEMS.register("zinc_axe",
            () -> new ZincAxeTooltip(ToolTiers.ZINC, new Item.Properties()));
    public static final RegistryObject<PickaxeItem> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe",
            () -> new ZincPickaxeTooltip(ToolTiers.ZINC, new Item.Properties()));
    public static final RegistryObject<ShovelItem> ZINC_SHOVEL = ITEMS.register("zinc_shovel",
            () -> new ZincShovelTooltip(ToolTiers.ZINC, new Item.Properties()));
    public static final RegistryObject<HoeItem> ZINC_HOE = ITEMS.register("zinc_hoe",
            () -> new ZincHoeTooltip(ToolTiers.ZINC, new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
