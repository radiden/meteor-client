/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.systems.modules.render.hud.modules;

import meteordevelopment.meteorclient.systems.modules.render.hud.HUD;
import meteordevelopment.meteorclient.utils.Utils;

public class SpeedHud extends DoubleTextHudElement {
    public SpeedHud(HUD hud) {
        super(hud, "speed", "Displays your horizontal speed.", "Speed: ");
    }

    @Override
    protected String getRight() {
        if (isInEditor()) return "0,0";
        return String.format("%.1f", Utils.getPlayerSpeed());
    }
}
