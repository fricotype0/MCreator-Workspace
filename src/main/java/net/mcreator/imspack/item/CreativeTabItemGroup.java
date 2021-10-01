
package net.mcreator.imspack.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class CreativeTabItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("ims_pack", "creative_tab")).icon(() -> {
		return new ItemStack(Blocks.CAMPFIRE);
	}).build();
}
