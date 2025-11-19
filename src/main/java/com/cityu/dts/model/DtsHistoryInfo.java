package com.cityu.dts.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DtsHistoryInfo {
    private int id;
    private int dtsId;
    private String state;
    private String userName;
    private String description;
    private String createdTime;
    private String updatedTime;
}
