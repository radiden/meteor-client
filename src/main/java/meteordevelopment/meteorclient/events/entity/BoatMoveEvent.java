/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.events.entity;

import net.minecraft.entity.vehicle.BoatEntity;

public class BoatMoveEvent {
    private static final BoatMoveEvent INSTANCE = new BoatMoveEvent();

    public BoatEntity boat;

    public static BoatMoveEvent get(BoatEntity entity) {
        INSTANCE.boat = entity;
        return INSTANCE;
    }
}
