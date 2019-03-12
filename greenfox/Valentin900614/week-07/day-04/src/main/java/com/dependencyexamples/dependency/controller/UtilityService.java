package com.dependencyexamples.dependency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    @RequestMapping(path = "/useful/email", method = RequestMethod.GET)
    public String checkDefaultEmail(@RequestParam(name = "email") String email, Model model) {
        if (email != null) {
            if (validateEmail(email)) {
                model.addAttribute("answer", true);
            } else
                model.addAttribute("answer", false);
        }

        return "useful";
    }

    private boolean validateEmail(String string) {
            Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
            Matcher mat = pattern.matcher(string);

            return mat.matches();
    }
}
