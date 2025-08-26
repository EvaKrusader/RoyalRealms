package net.mcreator.royalrealms.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.royalrealms.init.RoyalrealmsModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WindBlastProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double thunderChance = 0;
		double windChance = 0;
		windChance = Mth.nextInt(RandomSource.create(), 1, 10);
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RoyalrealmsModEnchantments.WIND_BLAST.get()) == 1) {
			if (windChance < 4) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (!world.isClientSide()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				}
			}
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RoyalrealmsModEnchantments.WIND_BLAST.get()) == 2) {
			if (windChance < 5) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (!world.isClientSide()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				}
			}
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RoyalrealmsModEnchantments.WIND_BLAST.get()) == 3) {
			if (windChance < 6) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (!world.isClientSide()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				}
			}
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RoyalrealmsModEnchantments.WIND_BLAST.get()) == 4) {
			if (windChance < 7) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (!world.isClientSide()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				}
			}
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(RoyalrealmsModEnchantments.WIND_BLAST.get()) == 5) {
			if (windChance < 8) {
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (!world.isClientSide()) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2, (entity.getDeltaMovement().z())));
				}
			}
		}
	}
}
