package com.webczw.batis.dao;

import com.webczw.batis.domain.DeptVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Wilber
 */
public interface DeptDao {
    /**
     * 查询部门列表
     * @param deptNO 部门ID
     * @return
     */
    DeptVO findById(@Param("deptNO") Long deptNO);
}
