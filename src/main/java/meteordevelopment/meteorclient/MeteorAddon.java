/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient;

public abstract class MeteorAddon {
    public abstract void onInitialize();

    public void onRegisterCategories() {}
}
