package com.xueyou.study.serviceApi.models.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 创建 by xueyo on 2019/8/14
 */
@ApiModel(value = "User", description = "用户信息")
@Data
public class User {

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String name;
    /**
     * 用户年龄
     */
    @ApiModelProperty(value = "用户年龄")
    private Integer age;

}

