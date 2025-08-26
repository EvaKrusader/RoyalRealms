package net.mcreator.royalrealms.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.royalrealms.init.RoyalrealmsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ExperienceAmuletDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(RoyalrealmsModItems.EXPERIENCE_AMULET.get(), lv).isPresent() : false && (entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 5) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			} else if (event != null && event.hasResult()) {
				event.setResult(Event.Result.DENY);
			}
			if (entity instanceof LivingEntity lv) {
				CuriosApi.getCuriosHelper().findCurios(lv, RoyalrealmsModItems.EXPERIENCE_AMULET.get()).forEach(item -> {
					ItemStack itemstackiterator = item.stack();
					itemstackiterator.getOrCreateTag().putDouble("unbreakingChance", (itemstackiterator.getEnchantmentLevel(Enchantments.UNBREAKING) * 0.25));
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstackiterator) != 0) {
						if (Math.random() >= itemstackiterator.getOrCreateTag().getDouble("unbreakingChance")) {
							itemstackiterator.shrink(1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:crystal_break")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:crystal_break")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) Math.floor(((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 2));
							if (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5 > ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5) {
								if (entity instanceof Player _player)
									_player.giveExperienceLevels(-((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5)));
							} else {
								if (entity instanceof Player _player)
									_player.giveExperienceLevels(-((int) (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5)));
							}
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) Math.floor(((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 2));
							if (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5 > ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5) {
								if (entity instanceof Player _player)
									_player.giveExperienceLevels(-((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5)));
							} else {
								if (entity instanceof Player _player)
									_player.giveExperienceLevels(-((int) (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5)));
							}
						}
					} else {
						itemstackiterator.shrink(1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:crystal_break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("royalrealms:crystal_break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) Math.floor(((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 2));
						if (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5 > ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5) {
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) * 5)));
						} else {
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) (Math.floor((entity instanceof Player _plr ? _plr.experienceLevel : 0) / 5) * 5)));
						}
					}
				});
			}
		}
	}
}
