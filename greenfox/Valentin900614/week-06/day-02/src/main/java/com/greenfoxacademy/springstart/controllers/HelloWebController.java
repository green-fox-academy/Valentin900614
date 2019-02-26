package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
    private AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        atomicLong.incrementAndGet();
        model.addAttribute("name", " World");
        model.addAttribute("count", atomicLong);
        return "greeting";
    }
}
