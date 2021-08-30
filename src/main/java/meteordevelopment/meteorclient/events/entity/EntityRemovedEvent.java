/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.events.entity;

import net.minecraft.entity.Entity;

public class EntityRemovedEvent {
    private static final EntityRemovedEvent INSTANCE = new EntityRemovedEvent();

    public Entity entity;

    public static EntityRemovedEvent get(Entity entity) {
        INSTANCE.entity = entity;
        return INSTANCE;
    }
}
