package net.mcreator.royalrealms.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.royalrealms.world.inventory.LoreGuiMenu;
import net.mcreator.royalrealms.network.LoreGuiButtonMessage;
import net.mcreator.royalrealms.RoyalrealmsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LoreGuiScreen extends AbstractContainerScreen<LoreGuiMenu> {
	private final static HashMap<String, Object> guistate = LoreGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox Lore;
	EditBox CustomName;
	EditBox Lore2;
	EditBox Lore3;
	Checkbox SignUsername;
	Checkbox TimeDataReal;
	Checkbox TimeDataMC;
	Button button_engrave;

	public LoreGuiScreen(LoreGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("royalrealms:textures/screens/lore_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		Lore.render(guiGraphics, mouseX, mouseY, partialTicks);
		CustomName.render(guiGraphics, mouseX, mouseY, partialTicks);
		Lore2.render(guiGraphics, mouseX, mouseY, partialTicks);
		Lore3.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (Lore.isFocused())
			return Lore.keyPressed(key, b, c);
		if (CustomName.isFocused())
			return CustomName.keyPressed(key, b, c);
		if (Lore2.isFocused())
			return Lore2.keyPressed(key, b, c);
		if (Lore3.isFocused())
			return Lore3.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		Lore.tick();
		CustomName.tick();
		Lore2.tick();
		Lore3.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String LoreValue = Lore.getValue();
		String CustomNameValue = CustomName.getValue();
		String Lore2Value = Lore2.getValue();
		String Lore3Value = Lore3.getValue();
		super.resize(minecraft, width, height);
		Lore.setValue(LoreValue);
		CustomName.setValue(CustomNameValue);
		Lore2.setValue(Lore2Value);
		Lore3.setValue(Lore3Value);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		Lore = new EditBox(this.font, this.leftPos + 5, this.topPos + 5, 118, 18, Component.translatable("gui.royalrealms.lore_gui.Lore")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore").getString());
				else
					setSuggestion(null);
			}
		};
		Lore.setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore").getString());
		Lore.setMaxLength(32767);
		guistate.put("text:Lore", Lore);
		this.addWidget(this.Lore);
		CustomName = new EditBox(this.font, this.leftPos + 185, this.topPos + 90, 118, 18, Component.translatable("gui.royalrealms.lore_gui.CustomName")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.CustomName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.CustomName").getString());
				else
					setSuggestion(null);
			}
		};
		CustomName.setSuggestion(Component.translatable("gui.royalrealms.lore_gui.CustomName").getString());
		CustomName.setMaxLength(32767);
		guistate.put("text:CustomName", CustomName);
		this.addWidget(this.CustomName);
		Lore2 = new EditBox(this.font, this.leftPos + 5, this.topPos + 27, 118, 18, Component.translatable("gui.royalrealms.lore_gui.Lore2")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore2").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore2").getString());
				else
					setSuggestion(null);
			}
		};
		Lore2.setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore2").getString());
		Lore2.setMaxLength(32767);
		guistate.put("text:Lore2", Lore2);
		this.addWidget(this.Lore2);
		Lore3 = new EditBox(this.font, this.leftPos + 5, this.topPos + 50, 118, 18, Component.translatable("gui.royalrealms.lore_gui.Lore3")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore3").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore3").getString());
				else
					setSuggestion(null);
			}
		};
		Lore3.setSuggestion(Component.translatable("gui.royalrealms.lore_gui.Lore3").getString());
		Lore3.setMaxLength(32767);
		guistate.put("text:Lore3", Lore3);
		this.addWidget(this.Lore3);
		button_engrave = Button.builder(Component.translatable("gui.royalrealms.lore_gui.button_engrave"), e -> {
			if (true) {
				RoyalrealmsMod.PACKET_HANDLER.sendToServer(new LoreGuiButtonMessage(0, x, y, z));
				LoreGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 111, this.topPos + 142, 61, 20).build();
		guistate.put("button:button_engrave", button_engrave);
		this.addRenderableWidget(button_engrave);
		SignUsername = new Checkbox(this.leftPos + -41, this.topPos + 80, 20, 20, Component.translatable("gui.royalrealms.lore_gui.SignUsername"), false);
		guistate.put("checkbox:SignUsername", SignUsername);
		this.addRenderableWidget(SignUsername);
		TimeDataReal = new Checkbox(this.leftPos + -41, this.topPos + 116, 20, 20, Component.translatable("gui.royalrealms.lore_gui.TimeDataReal"), false);
		guistate.put("checkbox:TimeDataReal", TimeDataReal);
		this.addRenderableWidget(TimeDataReal);
		TimeDataMC = new Checkbox(this.leftPos + -23, this.topPos + 161, 20, 20, Component.translatable("gui.royalrealms.lore_gui.TimeDataMC"), false);
		guistate.put("checkbox:TimeDataMC", TimeDataMC);
		this.addRenderableWidget(TimeDataMC);
	}
}
