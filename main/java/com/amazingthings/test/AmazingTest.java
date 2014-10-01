package com.amazingthings.test;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = AmazingTest.MODID, version = AmazingTest.VERSION)
public class AmazingTest {
	
    public static final String MODID = "atmod";
    public static final String VERSION = "1.0";
    
    public static Item testItem;

    /**
     * @author Kristav 
     * @author Amazing Things
     */
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
	
        testItem = new TestItem();
        GameRegistry.registerItem(testItem, "testitem");
      
    }
}
