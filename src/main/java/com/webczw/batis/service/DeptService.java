package com.webczw.batis.service;

import com.webczw.batis.domain.DeptVO;

import java.util.List;

/**
 * @author Wilber
 */
public interface DeptService {
    /**
     * 查询部门列表
     * @param deptNO 部门ID
     * @return
     * @throws Exception
     */
    DeptVO findByDeptNO(Long deptNO) throws Exception;
}
