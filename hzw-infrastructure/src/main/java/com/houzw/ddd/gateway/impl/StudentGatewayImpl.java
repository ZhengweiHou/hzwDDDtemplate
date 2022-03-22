package com.houzw.ddd.gateway.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.houzw.ddd.common.exception.BizException;
import com.houzw.ddd.convertor.StudentConvertor;
import com.houzw.ddd.domain.gateway.StudentGateway;
import com.houzw.ddd.domain.student.StudentEntity;
import com.houzw.ddd.dto.data.ErrorCode;
import com.houzw.ddd.gateway.database.entity.StudentDO;
import com.houzw.ddd.gateway.database.mapper.StudentDOMapper;
import com.houzw.ddd.gateway.database.service.StudentRep;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @ClassName StudentGatewayImpl
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/11
 **/
@Component("studentGateway")
public class StudentGatewayImpl implements StudentGateway {
    @Resource
    StudentRep studentRep;

    @Resource
    StudentDOMapper studentDOMapper;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public StudentEntity save(StudentEntity entity) {

        LambdaQueryWrapper<StudentDO> wrapper = Wrappers.<StudentDO>lambdaQuery().eq(StudentDO::getStudentno, entity.getStudentno());
        if(studentRep.count(wrapper) != 0){
            throw new BizException(ErrorCode.B_STUDENT_STUDENTNO_REPEAT);
        }

        StudentDO studentDO = StudentConvertor.toAddStudentDO(entity);
        studentRep.save(studentDO);
        return StudentConvertor.toEntity(studentDO);
    }


    @Override
    @Transactional(rollbackFor = Throwable.class)
    public StudentEntity modify(StudentEntity entity) {

//        QueryWrapper<StudentDO> wrapper = new QueryWrapper<>();
//        wrapper.eq("studentno",entity.getStudentno());
//        StudentDO studentDo = studentRep.getOne(wrapper);

        StudentDO studentDO = studentRep.getById(entity.getId());
        if(ObjectUtils.isEmpty(studentDO)){
            throw new BizException(ErrorCode.B_STUDENT_UNDEFINED);
        }

//        LambdaQueryWrapper<StudentDO> wrapper = Wrappers.<StudentDO>lambdaQuery().eq(StudentDO::getStudentno, entity.getStudentno());
//        StudentDO studentDO = studentRep.getOne(wrapper);

        StudentConvertor.toModifyStudentDO(entity,studentDO);

        boolean result = studentRep.updateById(studentDO);
        if (!result) {
            throw new PersistenceException("更新学生信息异常");
        }

        return StudentConvertor.toEntity(studentDO);
    }
}
