package net.remag.remagsveinminer.Item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.remag.remagsveinminer.RemagsVeinMiner;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item REMAG_CIPE = registerItem("remag_cipe", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RemagsVeinMiner.MOD_ID,"remag_cipe")))));
    public static final Item REMAG = registerItem("remag", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RemagsVeinMiner.MOD_ID,"remag")))));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(RemagsVeinMiner.MOD_ID, name), item);
    }
    public static void registerModItems(){
        RemagsVeinMiner.LOGGER.info("Registering Mod items for " + RemagsVeinMiner.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(REMAG_CIPE);
            entries.add(REMAG);
        } );
    }
}
