package com.cityu.dts.controller;

import com.cityu.dts.model.DtsInfo;
import com.cityu.dts.service.DtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dts")
public class Dts {
    @Autowired
    private DtsService dtsService;

    @PostMapping("/queryDefects")
    public List<DtsInfo> queryDefects(@RequestBody DtsInfo dtsInfo) {
        return dtsService.queryDefects(dtsInfo);
    }

    @PostMapping("/createDefect")
    public String createDefect(@RequestBody DtsInfo dtsInfo) {
        return dtsService.createDefect(dtsInfo);
    }

    @PostMapping("/deleteDefect")
    public String deleteDefect(@RequestBody DtsInfo dtsInfo) {
        return dtsService.deleteDefect(dtsInfo);
    }

    @PostMapping("/updateDefect")
    public String updateDefect(@RequestBody DtsInfo dtsInfo) {
        return dtsService.updateDefect(dtsInfo);
    }
}
