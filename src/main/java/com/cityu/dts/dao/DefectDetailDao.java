package com.cityu.dts.dao;

import com.cityu.dts.model.DtsHistoryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DefectDetailDao {

    List<DtsHistoryInfo> queryDtsDetailListByDtsId(@Param("dtsId") int dtsId);

    int insertDtsDetail(DtsHistoryInfo detail);

    int updateDtsDetail(DtsHistoryInfo detail);

    int deleteDtsDetailById(@Param("id") int id);

}
