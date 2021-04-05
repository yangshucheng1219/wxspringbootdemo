package com.imooc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangshucheng
 * @create 2021-04-03 9:55
 */
@RestController
public class hello {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello SpringBoot";
    }

}
