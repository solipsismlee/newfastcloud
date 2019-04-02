package com.feignserver.service.impl;

import com.feignserver.service.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {
    @Override
    public String error() {
        return "服务发生故障！";
    }
}
