package com.soldier;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author soldier
 * @Date 20-4-13 上午11:48
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello travis!";
    }
}
