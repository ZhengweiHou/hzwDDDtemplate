package com.houzw.ddd.student.executor;

import com.houzw.ddd.domain.gateway.StudentGateway;
import com.houzw.ddd.dto.StudentAddCmd;
import com.houzw.ddd.dto.StudentModifyCmd;
import com.houzw.ddd.dto.data.StudentDTO;
import com.houzw.ddd.student.assembler.StudentAssembler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName StudentAddCmdExe
 * @Description TODO
 * @Author houzw
 * @Date 2022/3/11
 **/
@Component
public class StudentModifyCmdExe {

    @Resource
    StudentGateway studentGateway;

    public StudentDTO execute(StudentModifyCmd cmd) {
        return StudentAssembler.toDTO(
                studentGateway.modify(StudentAssembler.toEntity(cmd))
        );
    }
}
