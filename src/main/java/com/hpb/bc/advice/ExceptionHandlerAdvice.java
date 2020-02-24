package com.hpb.bc.advice;

import com.hpb.bc.entity.result.Result;
import com.hpb.bc.entity.result.ResultCode;
import com.hpb.bc.exception.ErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
@ResponseBody
@SuppressWarnings("rawtypes")
public class ExceptionHandlerAdvice {

    private Logger log = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<Object> handleIllegalParamException(MethodArgumentNotValidException e) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String tips = "参数不合法";
        if (errors.size() > 0) {
            tips = errors.get(0).getDefaultMessage();
        }
        Result result = new Result(ResultCode.PARAMETER_ERROR);
        result.setMsg(tips);
        log.error("Advice 捕获异常：[" + e.getMessage() + "]", e);
        return Arrays.asList(ResultCode.FAIL.code(), ResultCode.FAIL.msg(), e.getMessage());
    }

    @ExceptionHandler(ErrorException.class)
    public List<Object> errorException(ErrorException e) {
        log.error("Advice 捕获异常：[" + e.getMessage() + "]", e);
        return Arrays.asList(ResultCode.FAIL.code(), e.getMessage(), e.getData());
    }

    @ExceptionHandler(IOException.class)
    public List<Object> ioException(IOException e) {
        log.error("Advice 捕获异常：[" + e.getMessage() + "]", e);
        return Arrays.asList(ResultCode.FAIL.code(), ResultCode.FAIL.msg(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public List<Object> handleException(Exception e) {
        log.error("Advice 捕获异常：[" + e.getMessage() + "]", e);
        return Arrays.asList(ResultCode.FAIL.code(), ResultCode.FAIL.msg(), e.getMessage());
    }

}