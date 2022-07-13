package com.koukay.shardingjdbc.service;


import com.koukay.shardingjdbc.entity.Udict;
import com.koukay.shardingjdbc.model.ResponseModel;

/**
 * 课程相关接口类
 */
public interface UdictService {


    ResponseModel addUdict(Udict udict);

    ResponseModel deleteUdict(Long cid);
}
