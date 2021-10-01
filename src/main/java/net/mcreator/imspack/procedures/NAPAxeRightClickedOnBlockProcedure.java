package net.mcreator.imspack.procedures;

import java.util.Map;
import java.util.HashMap;

public class NAPAxeRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure NAPAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure NAPAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure NAPAxeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure NAPAxeRightClickedOnBlock!");
			return;
		}

		double x = (double) dependencies.get("x");
		double y = (double) dependencies.get("y");
		double z = (double) dependencies.get("z");
		World world = (World) dependencies.get("world");

		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SCAFFOLDING.getDefaultState(), 3);
	}

}
