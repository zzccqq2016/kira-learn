package org.kira.lean.web.controller;

import org.kira.lean.web.bean.common.CommonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: Zhang Chaoqing
 * @date: 2022/12/10 22:43
 */
@RestController
public class CommonController {


    @GetMapping("get/session")
    public CommonResp<?> getSession(HttpServletResponse response, HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println("sessionValue:" + session.getAttribute("test"));
        return CommonResp.success();
    }


    @GetMapping("set/session")
    public CommonResp<?> setSession(HttpServletResponse response, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("test", "testValue");
        return CommonResp.success();
    }


}