package com.koukay.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;



@Data
@TableName(value = "t_udict")
public class Udict {

    @TableId(type = IdType.AUTO, value = "dict_id")
    private Long dictId;
    private String ustatus;
    private String uvalue;
}
