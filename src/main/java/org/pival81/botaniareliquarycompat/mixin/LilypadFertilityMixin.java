package org.pival81.botaniareliquarycompat.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import vazkii.botania.api.item.IHornHarvestable;
import xreliquary.blocks.FertileLilyPadBlock;

@Mixin(FertileLilyPadBlock.class)
public class LilypadFertilityMixin implements IHornHarvestable {
    @Override
    public boolean canHornHarvest(World world, BlockPos blockPos, ItemStack itemStack, EnumHornType enumHornType) {
        return false;
    }

    @Override
    public boolean hasSpecialHornHarvest(World world, BlockPos blockPos, ItemStack itemStack, EnumHornType enumHornType) {
        return false;
    }

    @Override
    public void harvestByHorn(World world, BlockPos blockPos, ItemStack itemStack, EnumHornType enumHornType) {
    }

}