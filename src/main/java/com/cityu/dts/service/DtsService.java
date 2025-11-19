package com.cityu.dts.service;

import com.cityu.dts.dao.DefectDao;
import com.cityu.dts.model.DtsInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class DtsService {
    @Autowired
    private DefectDao defectDao;

    public List<DtsInfo> queryDefects(DtsInfo dtsInfo) {
        List<DtsInfo> dtsInfos = defectDao.queryDtsList();
        return dtsInfos.stream().filter(item -> dtsInfo.getProjectId() == item.getProjectId()).filter(item -> StringUtils.equals(item.getCurUser(), dtsInfo.getCurUser())).collect(Collectors.toList());
    }

    public String createDefect(DtsInfo dtsInfo) {
        defectDao.insertDts(dtsInfo);
        return "success";
    }

    public String deleteDefect(DtsInfo dtsInfo) {
        defectDao.deleteDtsById(dtsInfo.getId());
        return "success";
    }

    public String updateDefect(DtsInfo dtsInfo) {
        defectDao.updateDts(dtsInfo);
        return "success";
    }
}
