package crazyores_core.client.model;

import crazyores_core.common.entity.EntityGolems;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCrystalGolem extends ModelBase
{
	//fields
	ModelRenderer golemChest;
	ModelRenderer golemHead;
	ModelRenderer golemMiddle;
	ModelRenderer legRightTop;
	ModelRenderer legLeftTop;
	ModelRenderer legRightMiddle;
	ModelRenderer legLeftMiddle;
	ModelRenderer legRightBottom;
	ModelRenderer legLeftBottom;
	ModelRenderer armRightTop;
	ModelRenderer armLeftTop;
	ModelRenderer armRightMiddle;
	ModelRenderer armLeftMiddle;
	public ModelRenderer armRightBottom;
	ModelRenderer armLeftBottom;
	ModelRenderer golemBottom;

	public ModelCrystalGolem()
	{
		textureWidth = 256;
		textureHeight = 256;

		golemChest = new ModelRenderer(this, 0, 25);
		golemChest.addBox(-4F, 0F, -2F, 28, 18, 13);
		golemChest.setRotationPoint(-10F, -25F, -7F);
		golemChest.setTextureSize(256, 256);
		golemChest.mirror = true;
		setRotation(golemChest, 0.3346075F, 0F, 0F);
		golemHead = (new ModelRenderer(this)).setTextureSize(256, 256);
		golemHead.setTextureOffset(0, 0).addBox(-5F, -10F, -5F, 11, 13, 11);
		golemHead.setTextureOffset(34, 0).addBox(-1F, -1F, -7F, 3, 5, 2);
		golemHead.setRotationPoint(-0.5F, -29F, -3F);
		golemHead.setTextureSize(256, 256);
		golemHead.mirror = true;
		setRotation(golemHead, 0F, 0F, 0F);
		golemBottom = new ModelRenderer(this, 0, 81);
		golemBottom.addBox(0F, 0F, 0F, 14, 10, 10);
		golemBottom.setRotationPoint(-7F, -3F, -3F);
		golemBottom.setTextureSize(256, 256);
		golemBottom.mirror = true;
		setRotation(golemBottom, -0.0371786F, 0F, 0F);
		legRightTop = new ModelRenderer(this, 101, 78);
		legRightTop.addBox(-2F, 0F, -1F, 7, 12, 6);
		legRightTop.setRotationPoint(-7.5F, 3F, 0.5F);
		legRightTop.setTextureSize(256, 256);
		legRightTop.mirror = true;
		setRotation(legRightTop, -0.2974216F, 0.1487164F, 0F);
		legLeftTop = new ModelRenderer(this, 74, 78);
		legLeftTop.addBox(-4F, 0F, -1F, 7, 12, 6);
		legLeftTop.setRotationPoint(7.5F, 3F, 0.5F);
		legLeftTop.setTextureSize(256, 256);
		legLeftTop.mirror = true;
		setRotation(legLeftTop, -0.2974216F, -0.1487195F, 0F);
		legRightMiddle = new ModelRenderer(this, 101, 97);
		legRightMiddle.addBox(-1.8F, 8F, -5.5F, 6, 6, 6);
		legRightMiddle.setRotationPoint(-7.5F, 3F, 0.5F);
		legRightMiddle.setTextureSize(256, 256);
		legRightMiddle.mirror = true;
		setRotation(legRightMiddle, 0F, 0F, 0F);
		legLeftMiddle = new ModelRenderer(this, 76, 97);
		legLeftMiddle.addBox(-3.2F, 8F, -5.5F, 6, 6, 6);
		legLeftMiddle.setRotationPoint(7.5F, 3F, 0.5F);
		legLeftMiddle.setTextureSize(256, 256);
		legLeftMiddle.mirror = true;
		setRotation(legLeftMiddle, 0F, 0F, 0F);
		legRightBottom = new ModelRenderer(this, 97, 110);
		legRightBottom.addBox(-3.4F, 13F, -5.3F, 9, 8, 8);
		legRightBottom.setRotationPoint(-7.5F, 3F, 0.5F);
		legRightBottom.setTextureSize(256, 256);
		legRightBottom.mirror = true;
		setRotation(legRightBottom, 0F, 0F, 0F);
		legLeftBottom = new ModelRenderer(this, 62, 110);
		legLeftBottom.addBox(-4.6F, 13F, -5.3F, 9, 8, 8);
		legLeftBottom.setRotationPoint(7.5F, 3F, 0.5F);
		legLeftBottom.setTextureSize(256, 256);
		legLeftBottom.mirror = true;
		setRotation(legLeftBottom, 0F, 0F, 0F);

		armRightTop = new ModelRenderer(this, 108, 4);
		armRightTop.addBox(0F, 0F, 0F, 5, 19, 7);
		armRightTop.setRotationPoint(-18.5F, -22.3F, -4F);
		armRightTop.setTextureSize(256, 256);
		armRightTop.mirror = true;
		setRotation(armRightTop, 0.1115358F, 0.0743572F, 0.0371786F);
		armLeftTop = new ModelRenderer(this, 83, 4);
		armLeftTop.addBox(0F, 0F, 0F, 5, 19, 7);
		armLeftTop.setRotationPoint(13.5F, -22.3F, -4F);
		armLeftTop.setTextureSize(256, 256);
		armLeftTop.mirror = true;
		setRotation(armLeftTop, 0.111544F, -0.074351F, -0.0371755F);
		armRightMiddle = new ModelRenderer(this, 108, 31);
		armRightMiddle.addBox(0.5F, 12.3F, 8F, 4, 9, 7);
		armRightMiddle.setRotationPoint(-18.5F, -22.3F, -4F);
		armRightMiddle.setTextureSize(256, 256);
		armRightMiddle.mirror = true;
		setRotation(armRightMiddle, -0.4461411F, 0.074351F, 0.0371755F);
		armLeftMiddle = new ModelRenderer(this, 85, 31);
		armLeftMiddle.addBox(0.5F, 12.3F, 8F, 4, 9, 7);
		armLeftMiddle.setRotationPoint(13.5F, -22.3F, -4F);
		armLeftMiddle.setTextureSize(256, 256);
		armLeftMiddle.mirror = true;
		setRotation(armLeftMiddle, -0.4461411F, -0.074351F, -0.0371755F);
		armRightBottom = new ModelRenderer(this, 108, 48);
		armRightBottom.addBox(-0.8F, 16F, 11.3F, 5, 13, 7);
		armRightBottom.setRotationPoint(-18.5F, -22.3F, -4F);
		armRightBottom.setTextureSize(256, 256);
		armRightBottom.mirror = true;
		setRotation(armRightBottom, -0.4461411F, 0F, 0F);
		armRightBottom.mirror = false;
		armLeftBottom = new ModelRenderer(this, 83, 48);
		armLeftBottom.addBox(0.8F, 16F, 11.5F, 5, 13, 7);
		armLeftBottom.setRotationPoint(13.5F, -22.3F, -4F);
		armLeftBottom.setTextureSize(256, 256);
		armLeftBottom.mirror = true;
		setRotation(armLeftBottom, -0.4461411F, 0F, 0F);
		//		armRightTop = new ModelRenderer(this, 108, 4);
		//		armRightTop.addBox(0F, 0F, 0F, 5, 19, 7);
		//		armRightTop.setRotationPoint(-18.5F, -22.3F, -4F);
		//		armRightTop.setTextureSize(256, 256);
		//		armRightTop.mirror = true;
		//		setRotation(armRightTop, 0.1115358F, 0.0743572F, 0.0371786F);
		//		armLeftTop = new ModelRenderer(this, 83, 4);
		//		armLeftTop.addBox(0F, 0F, 0F, 5, 19, 7);
		//		armLeftTop.setRotationPoint(13.5F, -22.3F, -4F);
		//		armLeftTop.setTextureSize(256, 256);
		//		armLeftTop.mirror = true;
		//		setRotation(armLeftTop, 0.111544F, -0.074351F, -0.0371755F);
		//		armRightMiddle = new ModelRenderer(this, 108, 31);
		//		armRightMiddle.addBox(0F, 12.3F, 8F, 4, 9, 7);
		//		armRightMiddle.setRotationPoint(-18.5F, -22.3F, -4F);
		//		armRightMiddle.setTextureSize(256, 256);
		//		armRightMiddle.mirror = true;
		//		setRotation(armRightMiddle, -0.4461411F, 0F, 0F);
		//		armLeftMiddle = new ModelRenderer(this, 85, 31);
		//		armLeftMiddle.addBox(1F, 12.3F, 8.333333F, 4, 9, 7);
		//		armLeftMiddle.setRotationPoint(13.5F, -22.3F, -4F);
		//		armLeftMiddle.setTextureSize(256, 256);
		//		armLeftMiddle.mirror = true;
		//		setRotation(armLeftMiddle, -0.4461411F, 0F, 0F);;
		//		armRightBottom = new ModelRenderer(this, 108, 48);
		//		armRightBottom.addBox(-0.6F, 15F, 14.3F, 5, 13, 7);
		//		armRightBottom.setRotationPoint(-18.5F, -22.3F, -4F);
		//		armRightBottom.setTextureSize(256, 256);
		//		armRightBottom.mirror = true;
		//		setRotation(armRightBottom, -0.7679449F, 0F, 0F);
		//		armLeftBottom = new ModelRenderer(this, 83, 48);
		//		armLeftBottom.addBox(0.6F, 15F, 14.6F, 5, 13, 7);
		//		armLeftBottom.setRotationPoint(13.5F, -22.3F, -4F);
		//		armLeftBottom.setTextureSize(256, 256);
		//		armLeftBottom.mirror = true;
		//		setRotation(armLeftBottom, -0.7679449F, 0F, 0F);
		golemMiddle = new ModelRenderer(this, 0, 57);
		golemMiddle.addBox(0F, 0F, 0F, 20, 11, 12);
		golemMiddle.setRotationPoint(-10F, -12F, -4F);
		golemMiddle.setTextureSize(256, 256);
		golemMiddle.mirror = true;
		setRotation(golemMiddle, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		golemChest.render(f5);
		golemHead.render(f5);
		golemMiddle.render(f5);
		legRightTop.render(f5);
		legLeftTop.render(f5);
		legRightMiddle.render(f5);
		legLeftMiddle.render(f5);
		legRightBottom.render(f5);
		legLeftBottom.render(f5);
		armRightTop.render(f5);
		armLeftTop.render(f5);
		armRightMiddle.render(f5);
		armLeftMiddle.render(f5);
		armRightBottom.render(f5);
		armLeftBottom.render(f5);
		golemBottom.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.golemHead.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.golemHead.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.legLeftTop.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1 + -0.2974216F;
		this.legLeftMiddle.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legLeftBottom.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legRightTop.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1 + -0.2974216F;
		this.legRightMiddle.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legRightBottom.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legLeftTop.rotateAngleY = -0.1487195F;
		this.legLeftMiddle.rotateAngleY = 0F;
		this.legLeftBottom.rotateAngleY = 0.0F;
		this.legRightTop.rotateAngleY = 0.1487164F;
		this.legRightMiddle.rotateAngleY = 0F;
		this.legRightBottom.rotateAngleY = 0.0F;
	}

	public float func_78172_a(float par1, float par2)
	{
		return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
	}

	/**
	 * Used for easily adding entity-dependent animations. The second and third float params here are the same second
	 * and third as in the setRotationAngles method.
	 */
	public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4)
	{
		EntityGolems entitygolems = (EntityGolems)par1EntityLivingBase;
		int i = entitygolems.getAttackTimer();

		if (i > 0)
		{
			this.armRightTop.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + 6.391F;
			this.armRightMiddle.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + -25.562F;
			this.armRightBottom.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + -44.562F;
			this.armLeftTop.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + 6.391F;
			this.armLeftMiddle.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + -25.562F;
			this.armLeftBottom.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F) + -44.562F;
		}
		else
		{
			this.armRightTop.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + 6.391F;
			this.armRightMiddle.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + -25.562F;
			this.armRightBottom.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + -44.562F;
			this.armLeftTop.rotateAngleX = (-0.2F - 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + 6.391F;
			this.armLeftMiddle.rotateAngleX = (-0.2F - 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + -25.562F;
			this.armLeftBottom.rotateAngleX = (-0.2F - 1.5F * this.func_78172_a(par2, 13.0F)) * par3 + -44.562F;
		}
	}
}

