
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftArmourAndWeaponsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@SlothcraftModElements.ModElement.Tag
public class JadeHoeItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:jade_hoe")
	public static final Item block = null;
	public JadeHoeItem(SlothcraftModElements instance) {
		super(instance, 340);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return 2;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(SlothCraftArmourAndWeaponsCreativeTabItemGroup.tab)) {
		}.setRegistryName("jade_hoe"));
	}
}
