package com.houzw.ddd.convertor;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.houzw.ddd.domain.student.StudentEntity;
import com.houzw.ddd.gateway.database.entity.StudentDO;

/**
 * @ClassName StudentConvertor DO <---> Entity
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/18
 **/
public class StudentConvertor {
    public static StudentDO toAddStudentDO(StudentEntity entity){
        StudentDO studentDO = new StudentDO();
        studentDO.setStudentno(entity.getStudentno());
        studentDO.setName(entity.getName());
        return studentDO;
    }

    public static StudentEntity toEntity(StudentDO studentDO) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDO.getId());
        studentEntity.setStudentno(studentDO.getStudentno());
        studentEntity.setName(studentDO.getName());
        return studentEntity;
    }

    public static void toModifyStudentDO(StudentEntity entity,StudentDO studentDO){
        Assert.isTrue(entity.getStudentno().equals(studentDO.getStudentno()),
                "学生信息更新转换，学号不一致，{}>{}",entity.getStudentno(),studentDO.getStudentno());
        studentDO.setName(entity.getName());
//        studentDO.setStudentno(entity.getStudentno()); // 学号不可修改

    }


}
