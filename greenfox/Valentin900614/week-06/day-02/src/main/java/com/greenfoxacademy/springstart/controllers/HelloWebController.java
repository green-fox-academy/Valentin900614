package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
    private AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/web/greeting")
    public String greeting(Model model) {
        //atomicLong.incrementAndGet();

        Greeting greeting = new Greeting(atomicLong.incrementAndGet(), "World");

        model.addAttribute("greeting", greeting);

        //model.addAttribute("name", " World");
        //model.addAttribute("count", atomicLong);
        return "greeting";
    }
}
