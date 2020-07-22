
package net.slothcraft.itemgroup;

import net.slothcraft.item.ShinyDiamondItem;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftOtherCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftOtherCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 176);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsloth_craft_other_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShinyDiamondItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
