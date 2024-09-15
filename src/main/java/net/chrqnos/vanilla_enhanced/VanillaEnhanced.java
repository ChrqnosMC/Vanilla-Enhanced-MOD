package net.chrqnos.vanilla_enhanced;

import net.chrqnos.vanilla_enhanced.effect.CustomEffects;
import net.fabricmc.api.ModInitializer;

public class VanillaEnhanced implements ModInitializer {
	public static final String MOD_ID = "vanilla_enhanced";

	@Override
	public void onInitialize() {
		CustomEffects.registerStatusEffects();
	}
}