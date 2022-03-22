package com.houzw.ddd.common.exception;


import com.houzw.ddd.dto.data.ErrorCode;

/**
 * @ClassName BizException
 * @Description 业务异常类
 * @Author houzw
 * @Date 2022/3/22
 **/
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -1L;

    private final ErrorCode errorCode;

    public BizException(ErrorCode errorCode) {
        super(errorCode.getErrDesc());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
