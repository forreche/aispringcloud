package com.soouthwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: aispringcloud
 * @author: fxb
 * @create: 2020-08-08 04:34
 * <p>
 * description
 **/

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    public String index() {
        return this.port + "-" + this.foo;
    }
}
