package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.classes.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {
    private AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/web/greeting")
    public String greeting(Model model, @RequestParam(required = false) String name) {
        //atomicLong.incrementAndGet();

        if (name == null)
            name = "World";

        Greeting greeting = new Greeting(atomicLong.incrementAndGet(), name);

        model.addAttribute("greeting", greeting);

        //model.addAttribute("name", " World");
        //model.addAttribute("count", atomicLong);
        return "greeting";
    }
}
