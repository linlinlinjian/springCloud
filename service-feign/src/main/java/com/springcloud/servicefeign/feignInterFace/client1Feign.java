package com.springcloud.servicefeign.feignInterFace;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <ol>
 *
 * @date：2019/11/27 15:30
 * @editor：第五轻轻
 * @Description：功能描述 <li></li>
 * </ol>
 */
@FeignClient(value="service-hi")
public interface client1Feign {

    @RequestMapping("/hello")
    String getClient();
}
