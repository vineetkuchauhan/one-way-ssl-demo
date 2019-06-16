package com.lestdoit.onewayssldemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/onewayssl/v1/test")
public class OneWaySslController {

    @GetMapping
    @ResponseBody
    public String sayHello() {
        return "Hi, This is one way ssl demo test !";
    }
}
