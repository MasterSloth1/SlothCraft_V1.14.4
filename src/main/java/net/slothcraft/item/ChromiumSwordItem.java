
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftArmourAndWeaponsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@SlothcraftModElements.ModElement.Tag
public class ChromiumSwordItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:chromium_sword")
	public static final Item block = null;
	public ChromiumSwordItem(SlothcraftModElements instance) {
		super(instance, 266);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 569;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(SlothCraftArmourAndWeaponsCreativeTabItemGroup.tab)) {
		}.setRegistryName("chromium_sword"));
	}
}