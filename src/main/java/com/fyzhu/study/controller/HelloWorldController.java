package com.fyzhu.study.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fyzhu on 2016/9/26.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
        return "Hello " + name;
    }

}
