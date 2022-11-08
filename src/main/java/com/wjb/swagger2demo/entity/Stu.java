package com.wjb.swagger2demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("Stu实体")
public class Stu {

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("年龄")
    private int age;
}
