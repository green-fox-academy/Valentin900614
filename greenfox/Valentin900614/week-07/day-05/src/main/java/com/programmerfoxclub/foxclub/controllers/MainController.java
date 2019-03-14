package com.programmerfoxclub.foxclub.controllers;

import com.programmerfoxclub.foxclub.model.Fox;
import com.programmerfoxclub.foxclub.model.FoxList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxList foxList;

    @Autowired
    public MainController(FoxList foxList) {
        this.foxList = foxList;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showIndexWithFoxlist(Model model, @RequestParam(required = false) String name) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxList.findFox(name));
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm(Model model, @RequestParam(name = "name", required = false) String name, @RequestParam(name = "fox", required = false) String fox) {
        model.addAttribute("name", name);
        model.addAttribute("fox", fox);
        model.addAttribute("foxlist", foxList);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginOrCreateFox(String name) {
        if (name.equals("")) {
            return "redirect:/login";
        } else if (!foxList.existFox(name)) {
            return "redirect:/login/?name=" + name;
        } else {
            return "redirect:/?name=" + name;
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerFox(String fox) {
        if (fox.equals("")) {
            return "redirect:/login";
        } else if (foxList.existFox(fox)) {
            return "redirect:/login/?fox=" + fox;
        } else {
            foxList.addFox(new Fox(fox));
            return "redirect:/?name=" + fox;
        }
    }

}
