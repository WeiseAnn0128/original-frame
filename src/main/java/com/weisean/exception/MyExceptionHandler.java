package com.weisean.exception;

import com.weisean.entity.ResultMsg;
import com.weisean.constant.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    public ResultMsg handleNoHandlerFound(NoHandlerFoundException e) {
        return new ResultMsg().setC(ErrorCode.REQUEST_URL_NOT_EXIST).setM("request URL not exist").setD("");
    }

    @ExceptionHandler
    @ResponseBody
    public ResultMsg handleRequestMethodNotAllowed(HttpRequestMethodNotSupportedException e) {
        return new ResultMsg().setC(ErrorCode.REQUEST_METHOD_NOT_ALLOWED).setM("only " + e.getSupportedHttpMethods() + " method allowed").setD("");
    }

    @ExceptionHandler
    @ResponseBody
    public ResultMsg handleOthers(Exception e) {
        log.error(e.getMessage(), e);
        return new ResultMsg().setC(ErrorCode.SERVER_ERROR).setM("server error, contact with administrator please").setD("");
    }
}
