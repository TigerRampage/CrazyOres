package crazyores_core.client.render;

import crazyores_core.common.entity.EntityGolems;
import crazyores_core.common.entity.EntityNames;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public class RenderStarconiumGolem extends RenderGolems
{
	private static ResourceLocation golemLocation = new ResourceLocation(EntityNames.STARCONIUM_GOLEM_PATH);
	
	public RenderStarconiumGolem(ModelBase golem, String n)
	{
		super(golem, n);
	}
	
	protected ResourceLocation getEntityTexture(EntityGolems par1EntityGolems)
	{
		return golemLocation;
	}
}
