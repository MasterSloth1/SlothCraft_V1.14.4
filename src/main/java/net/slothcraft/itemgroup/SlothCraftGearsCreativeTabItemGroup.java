
package net.slothcraft.itemgroup;

import net.slothcraft.item.AmethystGearItemItem;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftGearsCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftGearsCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabslothcraftgearscreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmethystGearItemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
