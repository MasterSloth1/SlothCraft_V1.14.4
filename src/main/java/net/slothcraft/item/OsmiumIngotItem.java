
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftOresCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class OsmiumIngotItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:osmium_ingot")
	public static final Item block = null;
	public OsmiumIngotItem(SlothcraftModElements instance) {
		super(instance, 428);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftOresCreativeTabItemGroup.tab).maxStackSize(64));
			setRegistryName("osmium_ingot");
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
	}
}