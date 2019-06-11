package com.lengedyun.dubbo_producer.service.impl;

import com.lengedyun.dubbo_producer.entity.UserEntity;
import com.lengedyun.dubbo_producer.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: UserServiceImpl
 * @projectName springboot_multimodule
 * @description: TODO
 * @date 2019/6/11 16:36
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity getUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("zjy");
        return userEntity;
    }
}
