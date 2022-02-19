package com.tyy.sharding.sphere.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author:tyy
 * @date:2022/2/19
 */
@Data
@TableName("t_dict")
public class Dict {
    private Long dictId;
    private String status;
    private String value;
}