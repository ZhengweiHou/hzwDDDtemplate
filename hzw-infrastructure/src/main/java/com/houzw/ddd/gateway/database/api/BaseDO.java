package com.houzw.ddd.gateway.database.api;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @ClassName BaseDO
 * @Description BaseDO
 * @Author houzw
 * @Date 2022/3/14
 **/
@Getter
@Setter
@Accessors(chain = true)
/**
 * fluent getter和setter方法的方法名都是基础属性名，且setter方法返回当前对象。
 * chain  setter方法返回当前对象。
 * prefix 用于生成getter和setter方法的字段名会忽视指定前缀（遵守驼峰命名）
 */

public abstract class BaseDO {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private String fcu;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime fcd;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String lcu;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lcd;

    @Version
    private Long version=0l;


}