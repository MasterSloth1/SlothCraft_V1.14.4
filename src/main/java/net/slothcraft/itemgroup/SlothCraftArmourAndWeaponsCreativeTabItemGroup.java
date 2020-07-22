
package net.slothcraft.itemgroup;

import net.slothcraft.item.KnifeItemItem;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftArmourAndWeaponsCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftArmourAndWeaponsCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 191);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsloth_craft_armour_and_tools_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KnifeItemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
