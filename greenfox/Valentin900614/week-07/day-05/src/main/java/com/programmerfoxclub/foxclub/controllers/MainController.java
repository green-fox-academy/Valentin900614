package com.programmerfoxclub.foxclub.controllers;

import com.programmerfoxclub.foxclub.classes.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    private List<Fox> foxList = new ArrayList<>();

    public MainController() {
        List<String> mrFoxList = Arrays.asList("write HTML", "code in Java");
        foxList.add(new Fox("Mr. Fox", mrFoxList, "pizza", "lemonade"));
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(Model model, @ModelAttribute(name="nameField") String name) {
        model.addAttribute("fox", name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginOrCreateFox(Model model, @ModelAttribute(name="nameField") String name) {
        for (Fox fox : foxList) {
            if (fox.getName().toLowerCase().equals(name.toLowerCase())) {
                model.addAttribute("fox", fox);
            } else
                model.addAttribute("fox", new Fox(name, null, null, null));
        }

        return "redirect:/index";
    }

}
