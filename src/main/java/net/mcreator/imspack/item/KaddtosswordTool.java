
package net.mcreator.imspack.item;

import com.google.common.collect.*;

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
