package com.data_stream.banprevention.banprevention.mixin;

import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public abstract class MinecraftClientMixin {

	/**
	 * @author StyStatic
	 * @reason Trick the game into thinking the game is not banned.
	 */
	@Overwrite
	@Nullable
	public boolean isMultiplayerBanned() {
		return false;
	}
}
