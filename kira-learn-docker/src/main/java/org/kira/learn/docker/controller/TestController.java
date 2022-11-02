package org.kira.learn.docker.controller;

import org.kira.common.resp.CommonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/11/2 18:37
 */
@RestController
public class TestController {

    @GetMapping("hi")
    public CommonResp<?> hi() {
        return CommonResp.success("hi");
    }
}