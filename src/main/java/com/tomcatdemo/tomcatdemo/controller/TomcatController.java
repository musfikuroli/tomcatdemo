package com.tomcatdemo.tomcatdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TomcatController {
    private static final Logger logger = LoggerFactory.getLogger(TomcatController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("Endpoint /api/hello was called");
        return "Hello Cabinet Division, from Tomcat Server.....";
    }
}