package com.cityu.dts.dao;

import com.cityu.dts.model.DtsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefectDao {

    List<DtsInfo> queryDtsList();

    int insertDts(DtsInfo dts);

    int updateDts(DtsInfo dts);

    int deleteDtsById(int id);

}
