package com.houzw.ddd.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

//@EqualsAndHashCode(callSuper = true)
@EqualsAndHashCode
@Data
public class StudentAddCmd implements Serializable {

    private String studentno;

    private String name;

}
