package com.greenfoxacademy.hundredacrewood.controller;

import com.greenfoxacademy.hundredacrewood.model.Gender;
import com.greenfoxacademy.hundredacrewood.model.Inhabitant;
import com.greenfoxacademy.hundredacrewood.model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InhabitantController {

    private InhabitantList inhabitantList;

    @Autowired
    public InhabitantController(InhabitantList inhabitantList) {
        this.inhabitantList = inhabitantList;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getMainPage() {
        return "index";
    }

    @RequestMapping(path = "/inhabitants", method = RequestMethod.GET)
    public String showInhabitants(Model model) {
        model.addAttribute("inhabitants", inhabitantList.getInhabitants());
        return "inhabitants_table";
    }

    @RequestMapping(path = "/inhabitant/{id}", method = RequestMethod.GET)
    public String getInhabitantById(@PathVariable int id, Model model) {

        Inhabitant inhabitant = inhabitantList.filterById(id);

        if (inhabitant != null) {
            model.addAttribute("inhabitant_by_id", inhabitant);
        } else {
            model.addAttribute("error", "No inhabitant found by this id!");
        }

        return "inhabitant_id";
    }

    @RequestMapping(path = "/inhabitants/add", method = RequestMethod.GET)
    public String addInhabitantForm(Model model, @ModelAttribute(name = "inhabitant") Inhabitant inhabitant) {
        model.addAttribute("inhabitant", inhabitant);
        model.addAttribute("genders", Gender.values());
        return "create";
    }

    @RequestMapping(path = "/inhabitants/add", method = RequestMethod.POST)
    public String addInhabitant(@ModelAttribute(name = "inhabitant") Inhabitant inhabitant) {
        inhabitantList.addNewInhabitant(inhabitant);
        return "redirect:/inhabitants";
    }

}
