package net.slothcraft.procedures;

import net.slothcraft.SlothcraftModElements;

import net.minecraft.entity.Entity;

@SlothcraftModElements.ModElement.Tag
public class FireStaffRangedWeaponBulletHitsLivingEntityProcedure extends SlothcraftModElements.ModElement {
	public FireStaffRangedWeaponBulletHitsLivingEntityProcedure(SlothcraftModElements instance) {
		super(instance, 193);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireStaffRangedWeaponBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
	}
}
