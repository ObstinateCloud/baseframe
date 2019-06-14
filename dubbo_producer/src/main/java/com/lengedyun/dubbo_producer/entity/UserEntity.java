package com.lengedyun.dubbo_producer.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zjy
 * @title: UserEntity
 * @projectName springboot_multimodule
 * @description: TODO
 * @date 2019/6/11 16:35
 */
@Data
@ToString
public class UserEntity implements Serializable {

    private Integer id;

    private String name;
}
