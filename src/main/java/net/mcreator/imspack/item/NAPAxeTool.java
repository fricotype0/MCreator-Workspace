
package net.mcreator.imspack.item;

import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;
import net.minecraft.client.item.TooltipContext;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class NAPAxeTool {
	public static final ToolMaterial NAPAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 100;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 9.5F;
		}

		@Override
		public float getAttackDamage() {
			return 13F;
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 18;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.DIAMOND_AXE, Items.NETHERITE_AXE);
		}
	};
	public static final Item INSTANCE = new AxeItem(NAPAXE_TOOL_MATERIAL, 0, (float) -3.5,
			(new FabricItemSettings().group(CreativeTabItemGroup.get()).fireproof())) {
		@Override
		@Environment(EnvType.CLIENT)
		public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
			tooltip.add(new LiteralText("For chopping... stuff"));
		}
	};
}
