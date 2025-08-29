package com.xuanxi.backend.controller;

import com.xuanxi.backend.common.BaseResponse;
import com.xuanxi.backend.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // TODO: Implement health check endpoint
    @RequestMapping("/")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
