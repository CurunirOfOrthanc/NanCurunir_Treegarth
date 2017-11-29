package com.nancurunir.treegarth.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.rawLargeCheesePizza, new ItemStack(ModItems.cheesePizzaSlice, 12), 1.5f);
		
	}
	
	

}
