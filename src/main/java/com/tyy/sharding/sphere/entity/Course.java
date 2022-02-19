package com.tyy.sharding.sphere.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author:tyy
 * @date:2022/2/19
 */
@Data
public class Course {

    @TableId
    private Long cid;
    private String cname;
    private Long userId;
    private String status;

}
