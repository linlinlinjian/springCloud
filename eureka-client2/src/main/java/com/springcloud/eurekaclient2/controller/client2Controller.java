package com.springcloud.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <ol>
 *
 * @date：2019/11/27 15:08
 * @editor：第五轻轻
 * @Description：功能描述 <li></li>
 * </ol>
 */
@RestController
public class client2Controller {

    @Value("${server.port}")
    String port ;

    @RequestMapping("/hello")
    public String client(){
        return  port;
    }
}
