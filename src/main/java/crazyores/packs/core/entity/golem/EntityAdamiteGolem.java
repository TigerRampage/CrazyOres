package crazyores.packs.core.entity.golem;

import crazyores.packs.core.entity.ai.CoreEntityAIAttackOnCollide;
import crazyores.packs.core.entity.ai.CoreEntityAIDefendVillage;
import crazyores.packs.core.entity.ai.CoreEntityAILookAtVillager;
import crazyores.packs.core.entity.ai.GolemTargets;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAdamiteGolem extends EntityGolems {

	public EntityAdamiteGolem(World world) {
		super(world, 1.4f, 3.1f, EnumGolemType.ADAMITE);
	}
	
	public EntityAdamiteGolem(World world, float scale) {
		super(world, 1.4f, 3.1f, scale, EnumGolemType.ADAMITE);
	}
	
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(130.0d);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25d);
    }

	@Override
	protected void setAbilities() {
		this.getNavigator().setAvoidsWater(false);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(1, new CoreEntityAIAttackOnCollide(this, 1.0d, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9d, 32.0f));
        this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6d, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0d));
        this.tasks.addTask(5, new CoreEntityAILookAtVillager(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new CoreEntityAIDefendVillage(this));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, new GolemTargets(EnumGolemType.ADAMITE).mobSelector));
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		
		if (inWater) {
			if (this.ticksExisted % 10 == 0) {
				this.heal(1);
			}
			
			if (this != null && !this.worldObj.isRemote) {
				if (this.getActivePotionEffect(Potion.moveSpeed) == null || this.getActivePotionEffect(Potion.moveSpeed).getDuration() < 2) {
					this.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 2, 2));
				}
			}
		}
	}
}
