package com.houzw.ddd.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.houzw.ddd.api.IStudentService;
import com.houzw.ddd.dto.StudentAddCmd;
import com.houzw.ddd.dto.StudentModifyCmd;
import com.houzw.ddd.dto.data.StudentDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("student")
public class StudentController {

    @Resource
    private IStudentService studentService;


    @PostMapping(value = "add")
    // curl -H "Content-type: application/json" -X POST -d '{"studentno":"001","name":"houzw"}' http://127.0.0.1:8002/student/add
    public StudentDTO add(@RequestBody StudentAddCmd cmd){
        log.info("addStudent:{}",cmd.getName());
        return studentService.add(cmd);
    }

    @PostMapping(value = "update")
    // curl -H "Content-type: application/json" -X POST -d '{"id":"4","studentno":"001","name":"houzw2"}' http://127.0.0.1:8002/student/update
    public StudentDTO update(@RequestBody StudentModifyCmd cmd){
        log.info("update Student:{}",cmd.getName());
        return studentService.modify(cmd);
    }
}
