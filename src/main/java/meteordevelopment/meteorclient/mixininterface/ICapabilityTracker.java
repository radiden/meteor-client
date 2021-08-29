/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.mixininterface;

public interface ICapabilityTracker {
    boolean get();

    void set(boolean state);
}
