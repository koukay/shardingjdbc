package com.koukay.shardingjdbc.controller;

import com.koukay.shardingjdbc.entity.Udict;
import com.koukay.shardingjdbc.model.ResponseModel;
import com.koukay.shardingjdbc.service.CourseService;
import com.koukay.shardingjdbc.service.UdictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shardingJDBC")
@Slf4j
public class ShardingJDBCController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private UdictService udictService;

    /**
     * 分表插入数据
     *
     * @return
     */
    @GetMapping("/addCourse")
    public ResponseModel addCourse() {
        return courseService.insertCourse(0);
    }

    @GetMapping("/addCourseManual")
    public ResponseModel addCourseManual(int howMany) {
        return courseService.insertCourse(howMany);
    }

    @GetMapping("/queryCourse")
    public ResponseModel queryCourse(Long cid) {
        return courseService.selectOne(cid);
    }

    @GetMapping("/deleteUdict")
    public ResponseModel deleteUdict(Long cid) {
        return udictService.deleteUdict(cid);
    }

    @PostMapping("/addUdict")
    public ResponseModel addUdict(@RequestBody Udict udict) {
        return udictService.addUdict(udict);
    }

}
