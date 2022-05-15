package net.toastiman.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.toastiman.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab TOASTICRAFT_TAB = new CreativeModeTab("toasticrafttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.QUARRIED_STONE.get());
        }
    };
}