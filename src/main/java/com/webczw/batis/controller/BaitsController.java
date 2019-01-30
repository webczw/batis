package com.webczw.batis.controller;

import com.webczw.batis.domain.DeptVO;
import com.webczw.batis.service.DeptService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wilber
 */
@RestController
@RequestMapping(value = "/rest")
public class BaitsController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value="获取部门详细信息", notes="根据url的deptNO来获取部门详细信息")
    @ApiImplicitParam(name = "deptNO", value = "部门ID", required = true, dataType = "Long" ,paramType = "path")
    @RequestMapping(value = "/find/by/{deptNO}", method = RequestMethod.GET)
    public DeptVO findByDeptNO(@PathVariable("deptNO") Long deptNO) throws Exception {
        DeptVO deptVO = deptService.findByDeptNO(deptNO);
        return deptVO;
    }
}
