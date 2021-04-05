package com.imooc.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangshucheng
 * @create 2021-04-03 19:37
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(HttpServletRequest req,Exception e){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success",false);
        modelMap.put("errMsg",e.getMessage());
        return modelMap;
    }
}
