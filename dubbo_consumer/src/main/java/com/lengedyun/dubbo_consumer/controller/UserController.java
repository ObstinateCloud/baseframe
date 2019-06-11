package com.lengedyun.dubbo_consumer.controller;

import com.lengedyun.dubbo_consumer.service.UserConsumer;
import com.lengedyun.dubbo_producer.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjy
 * @title: UserController
 * @projectName springboot_multimodule
 * @description: TODO
 * @date 2019/6/11 16:57
 */
@RestController
@RequestMapping("userController")
public class UserController {

    @Autowired
    private UserConsumer userConsumer;

    @RequestMapping("/getUser")
    public UserEntity getUser(){
        return userConsumer.getUser();
    }
}
