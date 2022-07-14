package com.koukay.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.koukay.shardingjdbc.entity.Course;
import com.koukay.shardingjdbc.mapper.CourseMapper;
import com.koukay.shardingjdbc.model.ResponseModel;
import com.koukay.shardingjdbc.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程相关业务处理类
 */
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public ResponseModel insertCourse(int howMany) {
        List<Course> courseList = new ArrayList<>();
        if (howMany==0){
            for (int i = 1; i <10; i++) {
                Course course = new Course();
                course.setCname("java" + i);
                course.setUserId(100L);
                course.setCstatus("Normal" + i);
                courseList.add(course);
                courseMapper.insert(course);
            }
        } else {
            for (int i = 1; i <howMany; i++) {
                Course course = new Course();
                course.setCname("java" + i);
                int random = (int) (Math.random() * 10);
                course.setUserId(100L + random);
                course.setCstatus("Normal" + i);
                courseList.add(course);
                courseMapper.insert(course);
            }
        }

        return new ResponseModel("新增成功", 200, courseList);
    }

    @Override
    public ResponseModel selectOne(Long cid) {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("cid",cid);
        Course course = courseMapper.selectOne(wrapper);
        return new ResponseModel("查询成功", 200, course);
    }

    @Override
    public ResponseModel addCourse(Course course) {
        courseMapper.insert(course);
        Course courseResult = courseMapper.selectById(course.getCid());
        return new ResponseModel("查询成功", 200, courseResult);
    }
}
