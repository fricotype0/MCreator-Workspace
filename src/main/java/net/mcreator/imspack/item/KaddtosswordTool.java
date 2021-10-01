
package net.mcreator.imspack.item;

import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.item.TooltipContext;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class KaddtosswordTool {
	public static final ToolMaterial KADDTOSSWORD_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 5000;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 4F;
		}

		@Override
		public float getAttackDamage() {
			return 18F;
		}

		@Override
		public int getMiningLevel() {
			return 1;
		}

		@Override
		public int getEnchantability() {
			return 2;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.DIAMOND_BLOCK);
		}
	};
	public static final Item INSTANCE = new SwordItem(KADDTOSSWORD_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(CreativeTabItemGroup.get()).fireproof())) {
		@Override
		@Environment(EnvType.CLIENT)
		public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
			tooltip.add(new LiteralText("the might of the kaddto"));
		}

		@Environment(EnvType.CLIENT)
		@Override
		public boolean hasGlint(ItemStack stack) {
			return true;
		}
	};
}
