
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftOtherCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class VioletHazeSeedItemItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:violet_haze_seed_item")
	public static final Item block = null;
	public VioletHazeSeedItemItem(SlothcraftModElements instance) {
		super(instance, 178);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftOtherCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("violet_haze_seed_item");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
