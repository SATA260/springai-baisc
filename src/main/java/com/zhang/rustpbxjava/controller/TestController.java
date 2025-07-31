package com.zhang.rustpbxjava.controller;

import com.zhang.rustpbxjava.common.BaseResponse;
import com.zhang.rustpbxjava.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    // 测试接口
    @RequestMapping("/hello")
    public BaseResponse<String> test() {
        return ResultUtils.success("Hello, RustPBX Java!");
    }
}
