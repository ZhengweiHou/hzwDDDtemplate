package com.houzw.ddd.dto.data;

/**
 * @ClassName ErrorCode
 * @Description 错误码
 * @Author houzw
 * @Date 2022/3/22
 **/
public enum ErrorCode {

    B_STUDENT_STUDENTNO_REPEAT("B_STUDENT_studentNoRepeat", "学号重复"),
    B_STUDENT_UNDEFINED("B_STUDENT_undefined", "学生不存在");

    private final String errCode;
    private final String errDesc;

    ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
