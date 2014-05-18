package crazyores_core.client.model;

import crazyores_core.common.entity.EntityGolems;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFoolsRubyGolem extends ModelBase
{
	//fields
	ModelRenderer legRightBottom;
	ModelRenderer legLeftBottom;
	ModelRenderer legRightTop;
	ModelRenderer legLeftTop;
	ModelRenderer bodyLower;
	ModelRenderer bodyMiddle;
	ModelRenderer bodyTop;
	public ModelRenderer armRight;
	ModelRenderer armLeft;
	ModelRenderer golemHead;

	public ModelFoolsRubyGolem()
	{
		textureWidth = 128;
		textureHeight = 128;

		legRightBottom = new ModelRenderer(this, 15, 70);
		legRightBottom.addBox(-2F, 5.6F, -0.6F, 3, 14, 3);
		legRightBottom.setRotationPoint(-6F, 5F, 0.4F);
		legRightBottom.setTextureSize(64, 32);
		legRightBottom.mirror = true;
		setRotation(legRightBottom, 0F, 0.2974289F, -0.1487144F);
		legLeftBottom = new ModelRenderer(this, 0, 73);
		legLeftBottom.addBox(1.5F, 6.2F, 0F, 3, 11, 3);
		legLeftBottom.setRotationPoint(1F, 6.9F, -0.6F);
		legLeftBottom.setTextureSize(64, 32);
		legLeftBottom.mirror = true;
		setRotation(legLeftBottom, 0F, 0.2974289F, 0F);
		legRightTop = new ModelRenderer(this, 15, 59);
		legRightTop.addBox(0F, 0F, 0F, 3, 6, 3);
		legRightTop.setRotationPoint(-6F, 5F, -0.4F);
		legRightTop.setTextureSize(64, 32);
		legRightTop.mirror = true;
		setRotation(legRightTop, 0F, 0.2617994F, 0.2094395F);
		legLeftTop = new ModelRenderer(this, 0, 59);
		legLeftTop.addBox(0F, 0F, 0F, 3, 7, 3);
		legLeftTop.setRotationPoint(1F, 6.9F, -0.2F);
		legLeftTop.setTextureSize(64, 32);
		legLeftTop.mirror = true;
		setRotation(legLeftTop, 0F, 0.3634209F, -0.2230717F);
		bodyLower = new ModelRenderer(this, 0, 50);
		bodyLower.addBox(0F, 0F, 0F, 11, 3, 4);
		bodyLower.setRotationPoint(-5F, 2F, -1.5F);
		bodyLower.setTextureSize(64, 32);
		bodyLower.mirror = true;
		setRotation(bodyLower, -0.0371786F, 0F, 0.3346075F);
		bodyMiddle = new ModelRenderer(this, 0, 32);
		bodyMiddle.addBox(0F, 0F, 0F, 8, 13, 3);
		bodyMiddle.setRotationPoint(-4F, -7.5F, -2F);
		bodyMiddle.setTextureSize(64, 32);
		bodyMiddle.mirror = true;
		setRotation(bodyMiddle, 0.0698132F, 0F, 0F);
		bodyTop = new ModelRenderer(this, 0, 19);
		bodyTop.addBox(0F, 0F, 0F, 14, 6, 5);
		bodyTop.setRotationPoint(-8F, -12F, -2.5F);
		bodyTop.setTextureSize(64, 32);
		bodyTop.mirror = true;
		setRotation(bodyTop, 0.1487144F, 0.1858931F, -0.0743572F);
		armRight = new ModelRenderer(this, 55, 0);
		armRight.addBox(0F, 0F, 0F, 2, 12, 3);
		armRight.setRotationPoint(-8F, -10F, -1F);
		armRight.setTextureSize(64, 32);
		armRight.mirror = true;
		setRotation(armRight, 0F, 0F, 0F);
		armLeft = new ModelRenderer(this, 40, 0);
		armLeft.addBox(0F, 0F, 0F, 2, 21, 3);
		armLeft.setRotationPoint(6F, -10F, -3F);
		armLeft.setTextureSize(64, 32);
		armLeft.mirror = true;
		setRotation(armLeft, 0F, 0F, 0F);
		golemHead = (new ModelRenderer(this)).setTextureSize(128, 128);
		golemHead.setTextureOffset(0, 0).addBox(-4F, -10F, -4F, 8, 10, 8);
		golemHead.setTextureOffset(24, 0).addBox(-1F, -3F, -6F, 2, 4, 2);
		golemHead.setRotationPoint(0F, -12F, -0.5F);
		golemHead.setTextureSize(128, 128);
		golemHead.mirror = true;
		setRotation(golemHead, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		legRightBottom.render(f5);
		legLeftBottom.render(f5);
		legRightTop.render(f5);
		legLeftTop.render(f5);
		bodyLower.render(f5);
		bodyMiddle.render(f5);
		bodyTop.render(f5);
		armRight.render(f5);
		armLeft.render(f5);
		golemHead.render(f5);
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
		this.legLeftTop.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legLeftBottom.rotateAngleX = -1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legRightTop.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legRightBottom.rotateAngleX = 1.5F * this.func_78172_a(f, 13.0F) * f1;
		this.legLeftTop.rotateAngleY = 0.3634209F;
		this.legLeftBottom.rotateAngleY = 0.2974289F;
		this.legRightTop.rotateAngleY = 0.2617994F;
		this.legRightBottom.rotateAngleY = 0.2974289F;

		this.legLeftTop.rotateAngleZ = -0.2230717F;
		this.legRightTop.rotateAngleZ = 0.2094395F;
		this.legRightBottom.rotateAngleZ = -0.1487144F;
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
			this.armRight.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F);
			this.armLeft.rotateAngleX = -2.0F + 0.5F * this.func_78172_a((float)i - par4, 10.0F);
		}
		else
		{
			this.armRight.rotateAngleX = (-0.2F + 1.5F * this.func_78172_a(par2, 13.0F)) * par3;
			this.armLeft.rotateAngleX = (-0.2F - 0.5F * this.func_78172_a(par2, 13.0F)) * par3;

		}
	}
}
