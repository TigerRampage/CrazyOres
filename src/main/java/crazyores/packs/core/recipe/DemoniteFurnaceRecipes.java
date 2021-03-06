package crazyores.packs.core.recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.registry.GameRegistry;
import crazyores.manager.util.CrazyOresLogger;
import crazyores.packs.core.block.CoreBlocks;
import crazyores.packs.core.item.CoreItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DemoniteFurnaceRecipes {

	private static final DemoniteFurnaceRecipes instance = new DemoniteFurnaceRecipes();
	private List<ItemStack[]> recipes;
	private Map experienceList;
	
	private static final int STACK_SIZE = 4;
	
	private DemoniteFurnaceRecipes() {
		recipes = new ArrayList<ItemStack[]>();
		experienceList = new HashMap();
		
		addRecipe(new ItemStack(Blocks.iron_ore), new ItemStack(Items.iron_ingot, STACK_SIZE), 0.4f);
		addRecipe(new ItemStack(Blocks.gold_ore), new ItemStack(Items.gold_ingot, STACK_SIZE), 0.5f);
		addRecipe(new ItemStack(Blocks.diamond_ore), new ItemStack(Items.diamond, STACK_SIZE), 0.8f);
		addRecipe(new ItemStack(Blocks.coal_ore), new ItemStack(Items.coal, STACK_SIZE), 0.2f);
		addRecipe(new ItemStack(Blocks.redstone_ore), new ItemStack(Items.redstone, STACK_SIZE), 0.3f);
		addRecipe(new ItemStack(Blocks.lapis_ore), new ItemStack(Items.dye, STACK_SIZE, 4), 0.3f);
		addRecipe(new ItemStack(Blocks.emerald_ore), new ItemStack(Items.emerald, STACK_SIZE), 0.6f);
		addRecipe(new ItemStack(Blocks.quartz_ore), new ItemStack(Items.quartz, STACK_SIZE), 0.7f);
		
		addRecipe(new ItemStack(CoreBlocks.meteoriteOre), new ItemStack(CoreItems.meteoriteCoal, STACK_SIZE), 0.6f);
		addRecipe(new ItemStack(CoreBlocks.copperOre), new ItemStack(CoreItems.copperIngot, STACK_SIZE), 0.4f);
		addRecipe(new ItemStack(CoreBlocks.adamiteOre), new ItemStack(CoreItems.adamiteShard, STACK_SIZE), 0.7f);
		addRecipe(new ItemStack(CoreBlocks.sapphireOre), new ItemStack(CoreItems.sapphireGem, STACK_SIZE), 0.5f);
		addRecipe(new ItemStack(CoreBlocks.rubyOre), new ItemStack(CoreItems.rubyGem, STACK_SIZE), 0.5f);
		addRecipe(new ItemStack(CoreBlocks.foolsRubyOre), new ItemStack(CoreItems.foolsRubyMush, STACK_SIZE), 0.2f);
		addRecipe(new ItemStack(CoreBlocks.zectiumOre), new ItemStack(CoreItems.zectiumIngot, STACK_SIZE), 1.0f);
		addRecipe(new ItemStack(CoreBlocks.osmoniumOre), new ItemStack(CoreItems.osmoniumIngot, STACK_SIZE), 1.1f);
		addRecipe(new ItemStack(CoreBlocks.starconiumOre), new ItemStack(CoreItems.starconiumGem, STACK_SIZE), 1.4f);
		addRecipe(new ItemStack(CoreBlocks.experiumOre), new ItemStack(CoreItems.experiumOrb, STACK_SIZE), 2.2f);
		
		addRecipe(new ItemStack(CoreBlocks.darkstoneOre), new ItemStack(CoreItems.darkstoneIngot, STACK_SIZE), 0.4f);
		addRecipe(new ItemStack(CoreBlocks.demoniteOre), new ItemStack(CoreItems.demoniteOrb, STACK_SIZE), 0.6f);
		addRecipe(new ItemStack(CoreBlocks.invisiumOre), new ItemStack(CoreItems.invisiumIngot, STACK_SIZE), 0.7f);
		addRecipe(new ItemStack(CoreBlocks.enderOre), new ItemStack(CoreItems.enderGem, STACK_SIZE), 1.8f);
		
		addRecipe(new ItemStack(Blocks.netherrack), new ItemStack(Items.netherbrick, STACK_SIZE), 0.1f);
		addRecipe(new ItemStack(Blocks.sand), new ItemStack(Blocks.glass, STACK_SIZE), 0.4f);
		addRecipe(new ItemStack(CoreBlocks.reinforcedGlass), new ItemStack(CoreBlocks.smoothReinforcedGlass, STACK_SIZE), 0.2f);
		
		addRecipe(new ItemStack(CoreItems.rawSharkMeat), new ItemStack(CoreItems.cookedSharkMeat, STACK_SIZE - 1), 0.5f);
		addRecipe(new ItemStack(Items.potato), new ItemStack(Items.baked_potato, STACK_SIZE - 1), 0.2f);
		addRecipe(new ItemStack(Items.beef), new ItemStack(Items.cooked_beef, STACK_SIZE - 1), 0.3f);
		addRecipe(new ItemStack(Items.porkchop), new ItemStack(Items.cooked_porkchop, STACK_SIZE - 1), 0.3f);
		addRecipe(new ItemStack(Items.chicken), new ItemStack(Items.cooked_chicken, STACK_SIZE - 1), 0.3f);
		addRecipe(new ItemStack(Items.fish), new ItemStack(Items.cooked_fished, STACK_SIZE - 1), 0.3f);
		addRecipe(new ItemStack(Items.fish, 1, 1), new ItemStack(Items.cooked_fished, STACK_SIZE - 1, 1), 0.3f);
		
		addRecipe(new ItemStack(CoreItems.meteoriteGem), new ItemStack(Items.flint), new ItemStack(CoreItems.flamingArrowHead, 1), 0.5f);
		addRecipe(new ItemStack(CoreItems.zectiumIngot), new ItemStack(Items.flint), new ItemStack(CoreItems.explosiveArrowHead, 1), 0.9f);
		
		addRecipe(new ItemStack(Blocks.glass), new ItemStack(CoreItems.zectiumIngot), new ItemStack(CoreBlocks.reinforcedGlass, STACK_SIZE - 2), 0.5f);
		
		//TODO:ADD MORE RECIPES!!
	}
	
	private void addRecipe(ItemStack stack1, ItemStack result, float experience) {
		addRecipe(new ItemStack[] {stack1, stack1, result}, experience);
	}
	
	private void addRecipe(ItemStack stack1, ItemStack stack2, ItemStack result, float experience) {
		addRecipe(new ItemStack[] {stack1, stack2, result}, experience);
		addRecipe(new ItemStack[] {stack2, stack1, result}, experience);
	}
	
	private void addRecipe(ItemStack[] recipe, float experience) {
		
		if (recipe == null || recipe.length != 3) {
			CrazyOresLogger.write(Level.WARN, "Invalid recipe length.");
			return;
		}
		
		for (ItemStack o : recipe) {
			if (o == null || !(o instanceof ItemStack)) {
				CrazyOresLogger.write(Level.WARN, "INVALID RECIPE!!");
				return;
			}
		}
		recipes.add(recipe);
		experienceList.put(recipe[2], experience);
	}
	
	public List<ItemStack[]> getRecipesList() {
		return recipes;
	}
	
	public boolean canBeSmelted(ItemStack stack) {
		
		for (ItemStack[] recipe : recipes) {
			for (int i = 0; i < recipe.length - 1; i++) {
				if (stack.isItemEqual(recipe[i])) return true;
			}
		}
		return false;
	}
	
	public ItemStack getSmeltingResult(ItemStack stack1, ItemStack stack2) {
		
		if (stack1 == null || stack2 == null) {
			return null;
		}
		
		for (ItemStack[] recipe : recipes) {
			if (check(recipe, stack1, stack2)) {
				return (ItemStack) recipe[2];
			}
		}
		return null;
	}
	
	private boolean check(ItemStack[] recipe, ItemStack stack1, ItemStack stack2) {
		
		if (recipe[0].isItemEqual(stack1) && recipe[1].isItemEqual(stack2) ||
			recipe[0].isItemEqual(stack2) && recipe[1].isItemEqual(stack1)) {
			return true;
		}
		return false;
    }
	
	public float getExperience(ItemStack stack) {
		
		for (ItemStack[] recipe : recipes) {
			if (stack.isItemEqual(recipe[2])) return (Float)experienceList.get(recipe[2]);
		}
		return 0;
	}
	
	public static DemoniteFurnaceRecipes instance() {
		return instance;
	}
}
