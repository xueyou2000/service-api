package com.xueyou.study.serviceApi.service;

import com.xueyou.study.serviceApi.models.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 创建 by xueyo on 2019/8/14
 */
@Api(value = "用户信息", tags = "user")
@RequestMapping("/user")
public interface UserService {

    @ApiOperation(value = "测试1", notes = "param传入name", httpMethod = "GET", produces = "application/json")
    @GetMapping(value = "/hello1")
    String hello(@RequestParam("name") String name);

    @ApiOperation(value = "测试2", notes = "head传入name,age", httpMethod = "HEAD")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true),
            @ApiImplicitParam(name = "age", value = "年龄", required = true)
    })
    @GetMapping(value = "/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @ApiOperation(value = "测试3", notes = "body传入user实体", httpMethod = "POST", produces = "application/json")
    @PostMapping(value = "/hello3")
    String hello(@RequestBody User user);

    @ApiOperation(value = "loadBalanced", notes = "测试负载均衡", httpMethod = "GET", produces = "application/json")
    @GetMapping(value = "/load-balanced")
    String loadBalanced();

}
