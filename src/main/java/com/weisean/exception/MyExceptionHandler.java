package com.weisean.exception;

import com.weisean.entity.ResultMsg;
import com.weisean.constant.ErrorCode;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyExceptionHandler {

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

}
