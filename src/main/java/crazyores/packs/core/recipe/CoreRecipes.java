package crazyores.packs.core.recipe;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import crazyores.packs.core.item.CoreItems;

public class CoreRecipes {

	public static void initCraftingRecipes() {
		initPickaxeRecipes();
		initAxeRecipes();
		initShovelRecipes();
		initSwordRecipes();
		initHoeRecipes();
		initHelmetRecipes();
		initChestplateRecipes();
		initLeggingsRecipes();
		initBootsRecipes();
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumShard, 1), new Object[] {"###", "#C#", "###", '#', "gemStarconium", 'C', "crystalWhiteLuminite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumSledgehammer, 1), new Object[] {"###", "###", " S ", '#', "shardStarconium", 'S', Items.stick}));
	}
	
	private static void initPickaxeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoritePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamitePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphirePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapazitePickaxe, 1), new Object[] {"###", " S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderPickaxe, 1), new Object[] {"###", " S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initAxeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderAxe, 1), true, new Object[] {"## ", "#S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initShovelRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperShovel, 1), new Object[] {"#", "S", "S", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteShovel, 1), new Object[] {"#", "S", "S", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteShovel, 1), new Object[] {"#", "S", "S", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireShovel, 1), new Object[] {"#", "S", "S", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyShovel, 1), new Object[] {"#", "S", "S", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotZectium", 'S', Items.stick}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteShovel, 1), new Object[] {"#", "S", "S", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumShovel, 1), new Object[] {"#", "S", "S", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumShovel, 1), new Object[] {"#", "S", "S", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderShovel, 1), new Object[] {"#", "S", "S", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initSwordRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperSword, 1), new Object[] {"#", "#", "S", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteSword, 1), new Object[] {"#", "#", "S", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteSword, 1), new Object[] {"#", "#", "S", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireSword, 1), new Object[] {"#", "#", "S", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubySword, 1), new Object[] {"#", "#", "S", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumSword, 1), new Object[] {"#", "#", "S", '#', "ingotZectium", 'S', Items.stick}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteSword, 1), new Object[] {"#", "#", "S", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumSword, 1), new Object[] {"#", "#", "S", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumSword, 1), new Object[] {"#", "#", "S", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumSword, 1), new Object[] {"#", "#", "S", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderSword, 1), new Object[] {"#", "#", "S", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initHoeRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotCopper", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemMeteorite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "shardAdamite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemSapphire", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemRuby", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotZectium", 'S', Items.stick}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "obeliskTapazite", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotOsmonium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemStarconium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "ingotInvisium", 'S', Items.stick}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderHoe, 1), true, new Object[] {"## ", " S ", " S ", '#', "gemEnder", 'S', Items.stick}));
	}
	
	private static void initHelmetRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperHelmet, 1), new Object[] {"###", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteHelmet, 1), new Object[] {"###", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteHelmet, 1), new Object[] {"###", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireHelmet, 1), new Object[] {"###", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyHelmet, 1), new Object[] {"###", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumHelmet, 1), new Object[] {"###", "# #", '#', "ingotZectium"}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteHelmet, 1), new Object[] {"###", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumHelmet, 1), new Object[] {"###", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumHelmet, 1), new Object[] {"###", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumHelmet, 1), new Object[] {"###", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderHelmet, 1), new Object[] {"###", "# #", '#', "gemEnder"}));
	}
	
	private static void initChestplateRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteChestplate, 1), new Object[] {"# #", "###", "###", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotZectium"}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteChestplate, 1), new Object[] {"# #", "###", "###", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumChestplate, 1), new Object[] {"# #", "###", "###", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderChestplate, 1), new Object[] {"# #", "###", "###", '#', "gemEnder"}));
	}
	
	private static void initLeggingsRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotZectium"}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteLeggings, 1), new Object[] {"###", "# #", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumLeggings, 1), new Object[] {"###", "# #", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderLeggings, 1), new Object[] {"###", "# #", "# #", '#', "gemEnder"}));
	}
	
	private static void initBootsRecipes() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.copperBoots, 1), new Object[] {"# #", "# #", '#', "ingotCopper"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.meteoriteBoots, 1), new Object[] {"# #", "# #", '#', "gemMeteorite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.adamiteBoots, 1), new Object[] {"# #", "# #", '#', "shardAdamite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.sapphireBoots, 1), new Object[] {"# #", "# #", '#', "gemSapphire"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.rubyBoots, 1), new Object[] {"# #", "# #", '#', "gemRuby"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.zectiumBoots, 1), new Object[] {"# #", "# #", '#', "ingotZectium"}));
//		TODO: Add Tapazite recipes GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.tapaziteBoots, 1), new Object[] {"# #", "# #", '#', "obeliskTapazite"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.osmoniumBoots, 1), new Object[] {"# #", "# #", '#', "ingotOsmonium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.starconiumBoots, 1), new Object[] {"# #", "# #", '#', "gemStarconium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.invisiumBoots, 1), new Object[] {"# #", "# #", '#', "ingotInvisium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(CoreItems.enderBoots, 1), new Object[] {"# #", "# #", '#', "gemEnder"}));
	}
}