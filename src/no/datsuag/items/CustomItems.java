package no.datsuag.items;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItems {
	public final static ItemStack ITEM_BOX = generateItemBox();
	
	public static ItemStack generateItemBox() {
		ItemStack itemBox = new ItemStack(Material.CHEST);
		ItemMeta meta = itemBox.getItemMeta();
		meta.setDisplayName("Item Box");
		meta.setLocalizedName("This is localized name");
		meta.setLore(List.of("Mystery box.",  "Combine with 4 other boxes to upgrade."));
		itemBox.setItemMeta(meta);
		return itemBox;
	}
	
}