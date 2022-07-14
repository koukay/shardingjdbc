package com.koukay.shardingjdbc.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.koukay.shardingjdbc.entity.Udict;
import com.koukay.shardingjdbc.mapper.UdictMapper;
import com.koukay.shardingjdbc.model.ResponseModel;
import com.koukay.shardingjdbc.service.UdictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UdictServiceImpl implements UdictService {
    @Autowired
    private UdictMapper udictMapper;
    @Override
    public ResponseModel addUdict(Udict udict) {
        udictMapper.insert(udict);
        Udict udict1 = udictMapper.selectById(udict.getDictId());
        return new ResponseModel("新增成功", 200, udict1);
    }

    @Override
    public ResponseModel deleteUdict(Long dict_id) {
        QueryWrapper<Udict> wrapper = new QueryWrapper<>();
        wrapper.eq("dict_id", dict_id);
        udictMapper.delete(wrapper);
        return new ResponseModel("删除成功", 200, dict_id);
    }
}
