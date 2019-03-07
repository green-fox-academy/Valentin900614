package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.classes.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTControllers{
    private AtomicLong atomicLong = new AtomicLong();
    private Greeting greeting;

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name){
        greeting = new Greeting(atomicLong.incrementAndGet(), name);
        return greeting;
    }
}
