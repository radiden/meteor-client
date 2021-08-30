/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.gui.widgets;

public class WVerticalSeparator extends WWidget {
    @Override
    protected void onCalculateSize() {
        width = theme.scale(3);
        height = 1;
    }
}
