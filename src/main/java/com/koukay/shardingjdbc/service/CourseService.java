package com.koukay.shardingjdbc.service;


import com.koukay.shardingjdbc.model.ResponseModel;

/**
 * 课程相关接口类
 */
public interface CourseService {


    ResponseModel insertCourse(int howMany);

    ResponseModel selectOne(Long wrapper);
}
