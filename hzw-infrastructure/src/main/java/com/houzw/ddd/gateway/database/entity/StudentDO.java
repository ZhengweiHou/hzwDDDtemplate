package com.houzw.ddd.gateway.database.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import com.houzw.ddd.gateway.database.api.BaseDO;

/**
 * <p>
 * 
 * </p>
 *
 * @author hzwDDD generator
 * @since 2022-03-22
 */
@TableName("student")
public class StudentDO extends BaseDO {

    private static final long serialVersionUID=1L;

    @TableField("studentNo")
    private String studentno;

    @TableField("name")
    private String name;


    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDO{" +
        "studentno=" + studentno +
        ", name=" + name +
        "}";
    }
}
