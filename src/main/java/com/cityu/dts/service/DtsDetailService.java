package com.cityu.dts.service;

import com.cityu.dts.dao.DefectDetailDao;
import com.cityu.dts.model.DtsHistoryInfo;
import com.cityu.dts.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DtsDetailService {
    @Autowired
    private DefectDetailDao defectDetailDao;

    public String createDetail(DtsHistoryInfo dtsHistoryInfo) {
        defectDetailDao.insertDtsDetail(dtsHistoryInfo);
        return "success";
    }

    public String updateDetail(DtsHistoryInfo dtsHistoryInfo) {
        defectDetailDao.updateDtsDetail(dtsHistoryInfo);
        return "success";
    }

    public String deleteDetail(DtsHistoryInfo dtsHistoryInfo) {
        defectDetailDao.deleteDtsDetailById(dtsHistoryInfo.getId());
        return "success";
    }

    public String queryDetail(DtsHistoryInfo dtsHistoryInfo) {
        List<DtsHistoryInfo> dtsHistoryInfos = defectDetailDao.queryDtsDetailListByDtsId(dtsHistoryInfo.getDtsId());
        return JsonUtils.toJson(dtsHistoryInfos);
    }
}
