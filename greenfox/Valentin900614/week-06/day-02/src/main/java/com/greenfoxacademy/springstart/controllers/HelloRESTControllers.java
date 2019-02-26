package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTControllers {
    private AtomicLong atomicLong = new AtomicLong();
    Greeting greeting;

    @RequestMapping
    public Greeting greeting(@RequestParam String name){
        atomicLong.incrementAndGet();
        greeting = new Greeting(atomicLong, name);
        return greeting;
    }
}
