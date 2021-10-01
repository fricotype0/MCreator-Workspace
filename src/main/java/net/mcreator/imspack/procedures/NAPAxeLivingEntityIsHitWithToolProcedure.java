package net.mcreator.imspack.procedures;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

public class NAPAxeLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure NAPAxeLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.damage(DamageSource.GENERIC, (float) 17F);
	}
}
