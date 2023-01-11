// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** AutoRebuild setting for the derived image. */
public final class AutoRebuildSetting extends ExpandableStringEnum<AutoRebuildSetting> {
    /** Static value Disabled for AutoRebuildSetting. */
    public static final AutoRebuildSetting DISABLED = fromString("Disabled");

    /** Static value OnBaseImageUpdate for AutoRebuildSetting. */
    public static final AutoRebuildSetting ON_BASE_IMAGE_UPDATE = fromString("OnBaseImageUpdate");

    /**
     * Creates a new instance of AutoRebuildSetting value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutoRebuildSetting() {
    }

    /**
     * Creates or finds a AutoRebuildSetting from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutoRebuildSetting.
     */
    @JsonCreator
    public static AutoRebuildSetting fromString(String name) {
        return fromString(name, AutoRebuildSetting.class);
    }

    /**
     * Gets known AutoRebuildSetting values.
     *
     * @return known AutoRebuildSetting values.
     */
    public static Collection<AutoRebuildSetting> values() {
        return values(AutoRebuildSetting.class);
    }
}
