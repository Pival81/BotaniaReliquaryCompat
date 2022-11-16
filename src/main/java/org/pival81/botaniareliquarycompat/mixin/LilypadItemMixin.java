package org.pival81.botaniareliquarycompat.mixin;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xreliquary.items.block.ItemFertileLilyPad;

@Mixin(ItemFertileLilyPad.class)
public class LilypadItemMixin extends Item {

    @Override
    public boolean hasEffect(ItemStack itemStack) {
        return true;
    }

    @Inject(at = @At("HEAD"), method = "onItemRightClick(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;")
    public void onItemRightClick(World world, EntityPlayer player, EnumHand hand, CallbackInfoReturnable<ActionResult<ItemStack>> cir) {
        player.sendStatusMessage(new TextComponentString("Test test is this working?"), true);
    }
}
