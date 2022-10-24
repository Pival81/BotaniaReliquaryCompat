package org.pival81.botaniareliquarycompat.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import xreliquary.items.block.ItemFertileLilyPad;

@Mixin(ItemFertileLilyPad.class)
public class LilypadItemMixin {

    public boolean hasEffect(ItemStack stack){
        return true;
    }
}
