package com.feignserver.service;

import com.feignserver.service.impl.ApiServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient", fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/hello/world",method = RequestMethod.GET)
    String error();
}
