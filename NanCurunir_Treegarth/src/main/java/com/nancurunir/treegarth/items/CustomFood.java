package com.nancurunir.treegarth.items;

import net.minecraft.item.ItemFood;

public class CustomFood extends ItemFood {
	
	public CustomFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	

}
