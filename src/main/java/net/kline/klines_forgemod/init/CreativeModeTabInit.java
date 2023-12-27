package net.kline.klines_forgemod.init;

import net.kline.klines_forgemod.MyMod;
import net.kline.klines_forgemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KLINES_FORGEMOD_CREATIVE_TAB = CREATIVE_MODE_TAB.register("klines_forgemod_creativemode_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.LUDEM_DUST.get()))
                    .title(Component.translatable("creativetab.klines_forgemod_creativemode_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ItemInit.LUDEM_DUST.get());

                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.LUDEM_FURNACE.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
