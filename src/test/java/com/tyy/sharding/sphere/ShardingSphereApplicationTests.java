package com.tyy.sharding.sphere;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tyy.sharding.sphere.entity.Course;
import com.tyy.sharding.sphere.entity.Dict;
import com.tyy.sharding.sphere.entity.User;
import com.tyy.sharding.sphere.mapper.CourseMapper;
import com.tyy.sharding.sphere.mapper.DictMapper;
import com.tyy.sharding.sphere.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingSphereApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    //添加课程
//    @Test
//    public void addCourse() {
//        Course course = new Course();
//        //cid由我们设置的策略，雪花算法进行生成
//        course.setCname("Java");
//        course.setUserId(100L);
//        course.setStatus("Normal");
//        courseMapper.insert(course);
//    }
//
//    @Test
//    public void findCourse() {
//        QueryWrapper<Course> wrapper = new QueryWrapper<>();
//        wrapper.eq("cid", 1494851660235788289L);
//        courseMapper.selectOne(wrapper);
//    }

    @Test
    public void addCourse() {
        Course course = new Course();
        //cid由我们设置的策略，雪花算法进行生成
        course.setCname("python");
        //分库根据user_id
        course.setUserId(100L);
        course.setStatus("Normal");
        courseMapper.insert(course);

        course.setCname("c++");
        course.setUserId(111L);
        courseMapper.insert(course);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("Jack");
        user.setStatus("Normal");
        userMapper.insert(user);
    }

    @Test
    public void findUser() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id", 536472243283165185L);
        userMapper.selectOne(wrapper);
    }


    @Autowired
    private DictMapper dictMapper;

    @Test
    public void addDict() {
        Dict dict = new Dict();
        dict.setStatus("Normal");
        dict.setValue("1");
        dictMapper.insert(dict);
    }

    @Test
    public void deleteDict() {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("dict_id", 701736081212571649L);
        dictMapper.delete(wrapper);
    }
}
