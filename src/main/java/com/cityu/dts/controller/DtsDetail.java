package com.cityu.dts.controller;

import com.cityu.dts.model.DtsHistoryInfo;
import com.cityu.dts.model.DtsInfo;
import com.cityu.dts.service.DtsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dtsdetail")
public class DtsDetail {
    @Autowired
    private DtsDetailService dtsDetailService;

    @PostMapping("/createDetail")
    public String createDetail(@RequestBody DtsHistoryInfo dtsHistoryInfo) {
        return dtsDetailService.createDetail(dtsHistoryInfo);
    }

    @PostMapping("/updateDetail")
    public String updateDetail(@RequestBody DtsHistoryInfo dtsHistoryInfo) {
        return dtsDetailService.updateDetail(dtsHistoryInfo);
    }

    @PostMapping("/deleteDetail")
    public String deleteDetail(@RequestBody DtsHistoryInfo dtsHistoryInfo) {
        return dtsDetailService.deleteDetail(dtsHistoryInfo);
    }

    @PostMapping("/queryDetail")
    public String queryDetail(@RequestBody DtsHistoryInfo dtsHistoryInfo) {
        return dtsDetailService.queryDetail(dtsHistoryInfo);
    }

}


