package me.rtx4090.playerscale.command;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ScaleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player sender = (Player) commandSender;
        float scale;
        try {
            scale = Float.parseFloat(strings[0]);
        } catch (NumberFormatException e) {
            sender.sendMessage("Invalid scale value.");
            return false;
        }

        AttributeInstance playerAttribute = sender.getAttribute(Attribute.GENERIC_SCALE);
        if (playerAttribute != null) {
            playerAttribute.setBaseValue(scale);
            sender.sendMessage("Your scale has been set to " + scale);
            return true;
        } else {
            sender.sendMessage("Failed to set scale.");
            return false;
        }

    }
}
