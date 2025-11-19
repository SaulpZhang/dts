package com.cityu.dts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum EnumDtsType {
    DEFACT(0), BUG(1), FEATURE(2), IMPROVEMENT(3);

    private final int type;

    public static EnumDtsType getEnumByType(int type) {
        return Arrays.stream(EnumDtsType.values()).filter(item -> item.getType() == type).findFirst().orElse(DEFACT);
    }
}
