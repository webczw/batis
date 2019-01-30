package com.webczw.batis.service;

import com.github.pagehelper.PageInfo;
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

    /**
     * 查询部门集合
     * @param pageNum 页码
     * @param pageSize 每页大小
     * @return
     * @throws Exception
     */
    PageInfo<DeptVO> findList(int pageNum, int pageSize)throws Exception;
}
