package com.houzw.ddd.gateway.database.service.impl;

import com.houzw.ddd.gateway.database.entity.StudentDO;
import com.houzw.ddd.gateway.database.mapper.StudentDOMapper;
import com.houzw.ddd.gateway.database.service.StudentRep;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hzwDDD generator
 * @since 2022-03-22
 */
@Service
public class StudentRepImpl extends ServiceImpl<StudentDOMapper, StudentDO> implements StudentRep {

}
