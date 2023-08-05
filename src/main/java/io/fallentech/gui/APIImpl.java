package io.fallentech.gui;

import cn.nukkit.Player;

public class APIImpl implements API {
    @Override
    public void doSomething(Player player, int amount) {
        player.sendMessage("You have " + amount + " of something!");
    }
}
