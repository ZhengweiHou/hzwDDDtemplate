package com.houzw.ddd.domain.gateway;

import com.houzw.ddd.domain.student.StudentEntity;

/**
 * @ClassName StudentGateway
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/11
 **/
public interface StudentGateway {

    StudentEntity save(StudentEntity studentEntity);

    StudentEntity modify(StudentEntity entity);

}
