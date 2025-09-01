package net.mcreator.royalrealms.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class FluoriteNecklaceBaubleIsEquippedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WITHER) && !(entity instanceof Player _plrCldCheck2 && _plrCldCheck2.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0) {
				if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 1) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (50 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 2) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (40 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 3) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (30 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 4) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (20 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 5) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (10 * 20));
				}
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (60 * 20));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
		} else if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(MobEffects.POISON) && !(entity instanceof Player _plrCldCheck30 && _plrCldCheck30.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0) {
				if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 1) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (50 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 2) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (40 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 3) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (30 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 4) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (20 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 5) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (10 * 20));
				}
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (60 * 20));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		} else if (entity instanceof LivingEntity _livEnt56 && _livEnt56.hasEffect(MobEffects.HUNGER) && !(entity instanceof Player _plrCldCheck58 && _plrCldCheck58.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0) {
				if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 1) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (50 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 2) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (40 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 3) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (30 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 4) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (20 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 5) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (10 * 20));
				}
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (60 * 20));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
		} else if (entity instanceof LivingEntity _livEnt84 && _livEnt84.hasEffect(MobEffects.WEAKNESS) && !(entity instanceof Player _plrCldCheck86 && _plrCldCheck86.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) != 0) {
				if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 1) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (50 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 2) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (40 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 3) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (30 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 4) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (20 * 20));
				} else if (itemstack.getEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY) == 5) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (10 * 20));
				}
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), (int) (60 * 20));
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
		}
	}
}
