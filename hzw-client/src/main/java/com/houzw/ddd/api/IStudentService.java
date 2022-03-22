package com.houzw.ddd.api;

import com.houzw.ddd.dto.StudentAddCmd;
import com.houzw.ddd.dto.StudentModifyCmd;
import com.houzw.ddd.dto.data.StudentDTO;

/**
 * @Author houzw
 * @Date 2022/3/11 下午2:04
 **/
public interface IStudentService {


    /**
     * @Description 添加学生
     * @Param cmd
     * @return 
     **/
    StudentDTO add(StudentAddCmd cmd);

    
/**
 * @Description 更新学生
 * @Param cmd
 * @return 
 **/
    StudentDTO modify(StudentModifyCmd cmd);
}
