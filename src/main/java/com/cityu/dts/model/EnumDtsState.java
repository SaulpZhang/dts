package com.cityu.dts.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum EnumDtsState {
    DEFACT("Defact"), CREATED("Created"), IN_PROGRESS("In Progress"), CLOSED("Closed");

    private final String state;

    public static EnumDtsState getEnumByState(String state) {
        return Arrays.stream(EnumDtsState.values()).filter(item -> StringUtils.equals(state, item.getState())).findFirst().orElse(DEFACT);
    }
}


