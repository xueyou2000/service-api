package com.xueyou.study.serviceApi.service;

import com.xueyou.study.serviceApi.models.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 创建 by xueyo on 2019/8/14
 */
@RequestMapping("/user")
public interface UserService {

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
