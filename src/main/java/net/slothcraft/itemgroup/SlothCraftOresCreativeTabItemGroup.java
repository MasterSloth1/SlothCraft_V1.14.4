
package net.slothcraft.itemgroup;

import net.slothcraft.block.AmethystOreBlock;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftOresCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftOresCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 254);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsloth_craft_ores_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmethystOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
