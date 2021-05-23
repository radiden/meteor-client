/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Meteor Development.
 */

package minegame159.meteorclient.systems.hud.elements;

import minegame159.meteorclient.systems.config.Config;
import minegame159.meteorclient.systems.hud.DoubleTextHudElement;
import minegame159.meteorclient.systems.hud.ElementRegister;

@ElementRegister(name = "watermark")
public class WatermarkHud extends DoubleTextHudElement {
    public WatermarkHud() {
        super("watermark", "Displays a Meteor Client watermark.", "Meteor Client ");
    }

    @Override
    protected String getRight() {
        if (Config.get().devBuild.isEmpty()) {
            return Config.get().version.getOriginalString();
        }

        return Config.get().version.getOriginalString() + " " + Config.get().devBuild;
    }
}