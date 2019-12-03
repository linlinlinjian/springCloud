package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.feignInterFace.client1Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <ol>
 *
 * @date：2019/11/27 15:33
 * @editor：第五轻轻
 * @Description：功能描述 <li></li>
 * </ol>
 */
@RestController
public class FeignController {

    @Autowired
    private client1Feign client1Feign;

    @RequestMapping("/getClient")
    public String getClient(){
        return client1Feign.getClient();
    }
}
