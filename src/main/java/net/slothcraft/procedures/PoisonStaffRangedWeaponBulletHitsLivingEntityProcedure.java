package net.slothcraft.procedures;

import net.slothcraft.SlothcraftModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@SlothcraftModElements.ModElement.Tag
public class PoisonStaffRangedWeaponBulletHitsLivingEntityProcedure extends SlothcraftModElements.ModElement {
	public PoisonStaffRangedWeaponBulletHitsLivingEntityProcedure(SlothcraftModElements instance) {
		super(instance, 197);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PoisonStaffRangedWeaponBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 20, (int) 2, (false), (false)));
	}
}
