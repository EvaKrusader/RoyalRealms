package net.mcreator.royalrealms.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.royalrealms.world.inventory.DevGUIMenu;
import net.mcreator.royalrealms.network.DevGUIButtonMessage;
import net.mcreator.royalrealms.RoyalrealmsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DevGUIScreen extends AbstractContainerScreen<DevGUIMenu> {
	private final static HashMap<String, Object> guistate = DevGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_survival;
	Button button_creative;
	Button button_spectator;

	public DevGUIScreen(DevGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("royalrealms:textures/screens/dev_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_survival = Button.builder(Component.translatable("gui.royalrealms.dev_gui.button_survival"), e -> {
			if (true) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new DevGUIButtonMessage(0, x, y, z));
				DevGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 5, 67, 20).build();
		guistate.put("button:button_survival", button_survival);
		this.addRenderableWidget(button_survival);
		button_creative = Button.builder(Component.translatable("gui.royalrealms.dev_gui.button_creative"), e -> {
			if (true) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new DevGUIButtonMessage(1, x, y, z));
				DevGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 28, 67, 20).build();
		guistate.put("button:button_creative", button_creative);
		this.addRenderableWidget(button_creative);
		button_spectator = Button.builder(Component.translatable("gui.royalrealms.dev_gui.button_spectator"), e -> {
			if (true) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new DevGUIButtonMessage(2, x, y, z));
				DevGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 50, 72, 20).build();
		guistate.put("button:button_spectator", button_spectator);
		this.addRenderableWidget(button_spectator);
	}
}
