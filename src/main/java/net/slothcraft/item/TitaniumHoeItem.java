
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftArmourAndWeaponsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@SlothcraftModElements.ModElement.Tag
public class TitaniumHoeItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:titanium_hoe")
	public static final Item block = null;
	public TitaniumHoeItem(SlothcraftModElements instance) {
		super(instance, 579);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 614;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 27;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(SlothCraftArmourAndWeaponsCreativeTabItemGroup.tab)) {
		}.setRegistryName("titanium_hoe"));
	}
}
