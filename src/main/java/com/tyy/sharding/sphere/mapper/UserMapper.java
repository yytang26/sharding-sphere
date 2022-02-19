package com.tyy.sharding.sphere.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyy.sharding.sphere.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author:tyy
 * @date:2022/2/19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}