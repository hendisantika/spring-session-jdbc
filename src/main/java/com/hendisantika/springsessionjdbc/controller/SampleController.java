package com.hendisantika.springsessionjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-session-jdbc
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-27
 * Time: 06:05
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class SampleController {
    @GetMapping("/api/sample")
    public Map<String, String> get() {
        Map<String, String> m = new HashMap<>();
        m.put("Indonesia", "Jakarta");
        return m;
    }
}