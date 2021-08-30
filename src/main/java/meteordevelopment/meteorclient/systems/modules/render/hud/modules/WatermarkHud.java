/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.systems.modules.render.hud.modules;

import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.systems.modules.render.hud.HUD;

public class WatermarkHud extends DoubleTextHudElement {
    public WatermarkHud(HUD hud) {
        super(hud, "watermark", "Displays a Dog Client watermark.", "Dog Client ");
    }

    @Override
    protected String getRight() {
        if (Config.get().devBuild.isEmpty()) {
            return Config.get().version.toString();
        }

        return Config.get().version + " " + Config.get().devBuild;
    }
}
