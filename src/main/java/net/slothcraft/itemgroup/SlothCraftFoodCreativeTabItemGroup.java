
package net.slothcraft.itemgroup;

import net.slothcraft.item.BaconFoodItem;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftFoodCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftFoodCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsloth_craft_food_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BaconFoodItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
