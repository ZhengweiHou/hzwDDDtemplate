package com.houzw.ddd.student;

import com.houzw.ddd.api.IStudentService;
import com.houzw.ddd.dto.StudentAddCmd;
import com.houzw.ddd.dto.StudentModifyCmd;
import com.houzw.ddd.dto.data.StudentDTO;
import com.houzw.ddd.student.executor.StudentAddCmdExe;
import com.houzw.ddd.student.executor.StudentModifyCmdExe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {

    /*
     * Executor 避免 service 膨胀
     */
    @Resource
    private StudentAddCmdExe studentAddCmdExe;
    @Resource
    private StudentModifyCmdExe studentModifyCmdExe;


    /**
     * @Author houzw
     * @Description TODO
     * @Date 2022/3/11
     * @Param [cmd]
     * @return com.houzw.ddd.dto.data.StudentVO
     **/
    @Override
    public StudentDTO add(StudentAddCmd cmd) {
        return studentAddCmdExe.execute(cmd);
    }

    @Override
    public StudentDTO modify(StudentModifyCmd cmd) {
        return studentModifyCmdExe.execute(cmd);
    }


}
