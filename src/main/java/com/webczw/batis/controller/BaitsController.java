package com.webczw.batis.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest", produces = {MediaType.ALL_VALUE})
public class BaitsController {

    @ApiOperation(value="获取用户详细信息", notes="根据url的名称来获取用户详细信息")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String" ,paramType = "path")
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        System.out.println("name:" + name);
        return name;
    }
}
