/*
 * This file is part of the Dog Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2021 Dog Development.
 */

package meteordevelopment.meteorclient.utils.tooltip;

import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.item.TooltipData;

public interface MeteorTooltipData extends TooltipData {
    TooltipComponent getComponent();
}
