package com.houzw.ddd.gateway.database.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.google.gson.Gson;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * @ClassName BaseDOMetaObjectHandler
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/22
 **/
public class BaseDOMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("fcu", "test", metaObject);
        this.setFieldValByName("fcd", LocalDateTime.now(), metaObject);
        this.setFieldValByName("lcu", "test", metaObject);
        this.setFieldValByName("lcd", LocalDateTime.now(), metaObject);
        this.setFieldValByName("version", 1l, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

        this.setFieldValByName("lcu", "test", metaObject);
        this.setFieldValByName("lcd", LocalDateTime.now(), metaObject);
//        this.setFieldValByName("version", (long)metaObject.getValue("version") +1l, metaObject); // 乐观锁字段已单独处理，此处不处理
    }
}
