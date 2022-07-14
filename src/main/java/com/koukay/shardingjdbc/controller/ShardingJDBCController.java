package com.koukay.shardingjdbc.controller;

import com.koukay.shardingjdbc.entity.Course;
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
     *  application-shard.yml 水平分表测试案例
     * @return
     */
    @GetMapping("/addCourse")
    public ResponseModel addCourse() {
        return courseService.insertCourse(0);
    }

    /**
     * application-shards.yml 水平分库分表测试案例
     * @param howMany 新增多少个记录
     * @return
     */
    @GetMapping("/addCourseManual")
    public ResponseModel addCourseManual(int howMany) {
        return courseService.insertCourse(howMany);
    }

    /**
     * application-shard.yml  水平分表测试案例
     * application-shards.yml 水平分库分表测试案例
     * @param cid
     * @return
     */
    @GetMapping("/queryCourse")
    public ResponseModel queryCourse(Long cid) {
        return courseService.selectOne(cid);
    }

    /**
     *application-shards.yml  操作公共表
     * @param cid
     * @return
     */
    @GetMapping("/deleteUdict")
    public ResponseModel deleteUdict(Long cid) {
        return udictService.deleteUdict(cid);
    }

    /**
     * application-shards.yml  操作公共表
     * 存储固定数据的表，表数据很少发生变化，查询时候经常进行关联
     * 在每个数据库中创建出相同结构公共表
     * @param udict
     * @return
     * 数据插入时会在每个库的每张表中插入，删除时也会删除所有数据
     */
    @PostMapping("/addUdict")
    public ResponseModel addUdict(@RequestBody Udict udict) {
        return udictService.addUdict(udict);
    }

    @PostMapping("/addCourse")
    public ResponseModel addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
}
