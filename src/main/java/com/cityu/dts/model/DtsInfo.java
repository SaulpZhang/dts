package com.cityu.dts.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DtsInfo {
    private int id;
    private String title;
    private int dtsType;
    private String curState;
    private String curUser;
    private int projectId;
    private List<DtsHistoryInfo> historyList;
}
