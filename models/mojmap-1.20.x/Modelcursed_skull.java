// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcursed_skull<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cursed_skull"), "main");
	private final ModelPart skull;
	private final ModelPart skull2;
	private final ModelPart cloud;
	private final ModelPart bone;
	private final ModelPart bone2;

	public Modelcursed_skull(ModelPart root) {
		this.skull = root.getChild("skull");
		this.skull2 = this.skull.getChild("skull2");
		this.cloud = root.getChild("cloud");
		this.bone = this.cloud.getChild("bone");
		this.bone2 = this.bone.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition skull = partdefinition.addOrReplaceChild("skull", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition skull2 = skull.addOrReplaceChild("skull2", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				-5.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-3.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition cloud = partdefinition.addOrReplaceChild("cloud", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = cloud.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.308F, -0.2165F, 0.5236F, 0.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F,
				-22.308F, -16.2165F, 32.0F, 26.0F, 32.0F, new CubeDeformation(-13.0F)),
				PartPose.offset(0.0F, 9.308F, 0.2165F));

		return LayerDefinition.create(meshdefinition, 96, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		skull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cloud.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.cloud.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cloud.xRot = headPitch / (180F / (float) Math.PI);
		this.bone2.yRot = ageInTicks / 20.f;
		this.skull.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.skull.xRot = headPitch / (180F / (float) Math.PI);
	}
}