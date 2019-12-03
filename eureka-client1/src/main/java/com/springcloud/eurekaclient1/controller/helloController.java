package com.springcloud.eurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <ol>
 *
 * @date：2019/11/27 14:33
 * @editor：第五轻轻
 * @Description：功能描述 <li></li>
 * </ol>
 */
@RestController
public class helloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(){
        return port;
    }
}
