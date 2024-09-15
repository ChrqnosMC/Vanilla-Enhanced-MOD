package net.chrqnos.vanilla_enhanced.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.logging.Level;

@Mixin(FarmlandBlock.class)
public class FarmlandBlockMixin {
    @ModifyExpressionValue(method = "setToDirt", at = @At(value = "INVOKE", target = ""))
    private static void setToDirt(Entity entity, BlockState blockState, Level level, BlockPos blockPos, CallbackInfo ci) {
        if (entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity)entity;
            if (EnchantmentHelper.getEnchantments(level.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolderOrThrow(Enchantments.FEATHER_FALLING), livingEntity) > 0) {
                ci.cancel();
            }
        }
    }
}