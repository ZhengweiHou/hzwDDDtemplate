package com.houzw.ddd.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

//@EqualsAndHashCode(callSuper = true)
@EqualsAndHashCode
@Data
public class StudentModifyCmd implements Serializable {

    private Long id;

    private String studentno;

    private String name;

}
