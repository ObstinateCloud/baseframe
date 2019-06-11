package com.lengedyun.dubbo_consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lengedyun.dubbo_producer.entity.UserEntity;
import com.lengedyun.dubbo_producer.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author zjy
 * @title: UserConsumer
 * @projectName springboot_multimodule
 * @description: TODO
 * @date 2019/6/11 16:48
 */
@Component
public class UserConsumer {

    @Reference
    private UserService userService;

    public UserEntity getUser(){
        return userService.getUser();
    }
}
