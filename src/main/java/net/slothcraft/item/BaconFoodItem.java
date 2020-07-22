
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftFoodCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SlothcraftModElements.ModElement.Tag
public class BaconFoodItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:bacon_food")
	public static final Item block = null;
	public BaconFoodItem(SlothcraftModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SlothCraftFoodCreativeTabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(10).saturation(42f).setAlwaysEdible().meat().build()));
			setRegistryName("bacon_food");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
