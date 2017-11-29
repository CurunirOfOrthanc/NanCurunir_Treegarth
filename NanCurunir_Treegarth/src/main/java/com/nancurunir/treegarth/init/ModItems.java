package com.nancurunir.treegarth.init;

import com.nancurunir.treegarth.Reference;
import com.nancurunir.treegarth.items.ItemBasic;
import com.nancurunir.treegarth.items.CustomFood;
import com.nancurunir.treegarth.items.EffectFoodAlwaysEdible;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	static Item largePizzaDough;
	static Item rawLargeCheesePizza;
	static Item cookedLargeCheesePizza;
	
	static Item cheeseWedge;
	static Item magicCheese;
	static Item cheesePizzaSlice;
	
	public static void init() {
		largePizzaDough = new ItemBasic("largePizzaDough").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(32);
		rawLargeCheesePizza = new ItemBasic("rawLargeCheesePizza").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(8);
		cookedLargeCheesePizza = new ItemBasic("cookedLargeCheesePizza").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(8);
		
		
		cheesePizzaSlice = new CustomFood("cheesePizzaSlice", 5, 0.3f, false).setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
		cheeseWedge = new CustomFood("cheeseWedge", 5, 0.3f, false).setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
		magicCheese = new EffectFoodAlwaysEdible("magicCheese", 5, 0.3f, false).setCreativeTab(CreativeTabs.FOOD).setMaxStackSize(32);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(largePizzaDough, rawLargeCheesePizza, cookedLargeCheesePizza, cheeseWedge, magicCheese, cheesePizzaSlice);
	}
	
	@SubscribeEvent
	public static void registerRenderers(ModelRegistryEvent event) {
		registerRender(largePizzaDough);
		registerRender(cheeseWedge);
		registerRender(magicCheese);
		registerRender(rawLargeCheesePizza);
		registerRender(cookedLargeCheesePizza);
		registerRender(cheesePizzaSlice);
	}
	

	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}

}
