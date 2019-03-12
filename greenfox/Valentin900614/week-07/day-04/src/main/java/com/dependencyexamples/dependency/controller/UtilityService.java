package com.dependencyexamples.dependency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Random;

@Controller
@Service
public class UtilityService {
    
    private ArrayList<String> colors;
    private Random random;

    public UtilityService() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    private String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    @RequestMapping(value = "/useful", method = RequestMethod.GET)
    public String usefulIndex(){
        return "useful";
    }

    @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
    public String colorizeTheBackground (Model model) {
        model.addAttribute("color", randomColor());
        return "useful";
    }
}
