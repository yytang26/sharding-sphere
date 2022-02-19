package com.tyy.sharding.sphere.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author:tyy
 * @date:2022/2/19
 */
@Data
@TableName("t_user")
public class User {
    private Long userId;
    private String username;
    private String status;
}