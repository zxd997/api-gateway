package com.zxd.apigateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试自动刷新这个失败 可能有其他原因
 * 设置路由权限时这个 类的controller是 不算在里面的
 */
@RestController
@RefreshScope
public class TodayController {
    @Value("${today}")
    private String today;
    @GetMapping("/today")
    public String getToday(){
        return today;
    }
}
