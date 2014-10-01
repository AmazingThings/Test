package com.amazingthings.test;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestItem extends Item {

	public TestItem() {
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("testitem");
		this.setTextureName("atmod:test");
	}
}
