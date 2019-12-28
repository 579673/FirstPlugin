package no.datsuag.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import no.datsuag.items.CustomItems;

public class TestListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("Welcome " + event.getPlayer().getName() + " to the server!");
		Player player = event.getPlayer();
		PlayerInventory inventory = player.getInventory();
		inventory.addItem(CustomItems.ITEM_BOX);
	}
	
	@EventHandler
	public void onInventoryRightClick(InventoryClickEvent event) {
		if (event.isRightClick()) {
			if (event.getCurrentItem().equals(CustomItems.ITEM_BOX)) {
				event.setCurrentItem(new ItemStack(Material.EMERALD));
			}
		}
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		if (block.getType() == Material.DIRT) {
			block.getWorld().dropItemNaturally(block.getLocation(), CustomItems.ITEM_BOX);
		}
	}
	
}
