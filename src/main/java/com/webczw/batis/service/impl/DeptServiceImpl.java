package com.webczw.batis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageInfo<DeptVO> findList(int pageNum, int pageSize) throws Exception {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<DeptVO> userDomains = deptDao.findList();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
