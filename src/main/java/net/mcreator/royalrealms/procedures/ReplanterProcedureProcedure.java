package net.mcreator.royalrealms.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.royalrealms.init.RoyalrealmsModEnchantments;
import net.mcreator.royalrealms.RoyalrealmsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReplanterProcedureProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((EnchantmentHelper.getItemEnchantmentLevel(RoyalrealmsModEnchantments.REPLANTER.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) == true
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:hoes"))) && blockstate.is(BlockTags.create(new ResourceLocation("minecraft:crops")))) {
			if (blockstate.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:wheat"))) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.WHEAT_SEEDS)) : false) {
					RoyalrealmsMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock " + (new java.text.DecimalFormat("##").format(x) + " ") + (new java.text.DecimalFormat("##").format(y) + " ") + (new java.text.DecimalFormat("##").format(z) + " ") + "minecraft:wheat[age=1]"));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.WHEAT_SEEDS);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					});
				}
			} else if (blockstate.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:potatoes"))) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.POTATO)) : false) {
					RoyalrealmsMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock " + (new java.text.DecimalFormat("##").format(x) + " ") + (new java.text.DecimalFormat("##").format(y) + " ") + (new java.text.DecimalFormat("##").format(z) + " ") + "minecraft:potatoes[age=1]"));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.POTATO);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					});
				}
			} else if (blockstate.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:carrots"))) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.CARROT)) : false) {
					RoyalrealmsMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock " + (new java.text.DecimalFormat("##").format(x) + " ") + (new java.text.DecimalFormat("##").format(y) + " ") + (new java.text.DecimalFormat("##").format(z) + " ") + "minecraft:potatoes[age=1]"));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.CARROT);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					});
				}
			} else if (blockstate.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:beetroots"))) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BEETROOT_SEEDS)) : false) {
					RoyalrealmsMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("setblock " + (new java.text.DecimalFormat("##").format(x) + " ") + (new java.text.DecimalFormat("##").format(y) + " ") + (new java.text.DecimalFormat("##").format(z) + " ") + "minecraft:potatoes[age=1]"));
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(Items.BEETROOT_SEEDS);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					});
				}
			}
		}
	}
}
