package com.southwind.coontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: aispringcloud
 * @author: fxb
 * @create: 2020-08-08 05:11
 * <p>
 * description
 **/

@RestController
@RequestMapping("/hello")
public class HelloHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    private String index() {
        return this.port;
    }

}
