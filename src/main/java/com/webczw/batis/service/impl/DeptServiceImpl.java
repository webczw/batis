package com.webczw.batis.service.impl;

import com.webczw.batis.dao.DeptDao;
import com.webczw.batis.domain.DeptVO;
import com.webczw.batis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wilber
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public DeptVO findByDeptNO(Long deptNO) throws Exception {
        return deptDao.findById(deptNO);
    }
}
