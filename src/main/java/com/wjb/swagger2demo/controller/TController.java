package com.wjb.swagger2demo.controller;

import com.wjb.swagger2demo.entity.Stu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("swagger2测试controller")
@RestController
@RequestMapping("test")
public class TController {

    @GetMapping("getStuInfo")
    @ApiOperation("获取学生信息")
    public Stu getStu() {
        Stu stu = Stu.builder()
                .name("wjb")
                .age(18)
                .build();
        return stu;
    }
}
