package com.houzw.ddd.student.assembler;

import com.houzw.ddd.domain.student.StudentEntity;
import com.houzw.ddd.dto.StudentAddCmd;
import com.houzw.ddd.dto.StudentModifyCmd;
import com.houzw.ddd.dto.data.StudentDTO;

/**
 * @Author houzw
 * @Date 2022/3/11 下午2:10
 **/
public class StudentAssembler {

    public static StudentEntity toEntity(StudentAddCmd co){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentno(co.getStudentno());
        studentEntity.setName(co.getName());
        return studentEntity;
    }

    public static StudentEntity toEntity(StudentModifyCmd cmd){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(cmd.getId());
        studentEntity.setStudentno(cmd.getStudentno());
        studentEntity.setName(cmd.getName());
        return studentEntity;

    }

    public static StudentDTO toDTO(StudentEntity entity){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(entity.getId());
        studentDTO.setStudentno(entity.getStudentno());
        studentDTO.setName(entity.getName());
        return studentDTO;
    }
}
