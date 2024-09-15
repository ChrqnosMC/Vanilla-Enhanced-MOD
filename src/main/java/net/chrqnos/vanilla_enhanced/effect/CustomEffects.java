package net.chrqnos.vanilla_enhanced.effect;

import net.chrqnos.vanilla_enhanced.VanillaEnhanced;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class CustomEffects {
    public static RegistryEntry.Reference<StatusEffect> DREAMING = registerEffect("dreaming", new DreamingEffect(StatusEffectCategory.BENEFICIAL, 15978425));
    public static RegistryEntry.Reference<StatusEffect> BASTION_OMEN = registerEffect("bastion_omen", new BastionOmenEffect(StatusEffectCategory.NEUTRAL, 16750848));
    public static RegistryEntry.Reference<StatusEffect> CITY_OMEN = registerEffect("city_omen", new CityOmenEffect(StatusEffectCategory.NEUTRAL, 13565951));

    public static RegistryEntry.Reference<StatusEffect> registerEffect(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(VanillaEnhanced.MOD_ID, id), statusEffect);
    }

    public static void registerStatusEffects() {

    }
}