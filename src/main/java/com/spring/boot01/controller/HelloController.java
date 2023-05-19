package com.spring.boot01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/5/6 17:54
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot --- 软件2031 康伟伟 2020007747";
    }
}
