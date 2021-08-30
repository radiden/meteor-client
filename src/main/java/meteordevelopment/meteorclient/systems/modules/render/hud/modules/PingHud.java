/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.systems.modules.render.hud.modules;

import meteordevelopment.meteorclient.systems.modules.render.hud.HUD;
import net.minecraft.client.network.PlayerListEntry;

public class PingHud extends DoubleTextHudElement {
    public PingHud(HUD hud) {
        super(hud, "ping", "Displays your ping.", "Ping: ");
    }

    @Override
    protected String getRight() {
        if (isInEditor()) return "0";

        PlayerListEntry playerListEntry = mc.getNetworkHandler().getPlayerListEntry(mc.player.getUuid());

        if (playerListEntry != null) return Integer.toString(playerListEntry.getLatency());
        return "0";
    }
}
