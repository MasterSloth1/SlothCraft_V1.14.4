
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftArmourAndWeaponsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@SlothcraftModElements.ModElement.Tag
public class ZincSwordItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:zinc_sword")
	public static final Item block = null;
	public ZincSwordItem(SlothcraftModElements instance) {
		super(instance, 625);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 400;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(SlothCraftArmourAndWeaponsCreativeTabItemGroup.tab)) {
		}.setRegistryName("zinc_sword"));
	}
}
