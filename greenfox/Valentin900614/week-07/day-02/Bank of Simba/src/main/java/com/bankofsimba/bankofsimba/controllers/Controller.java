package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.classes.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private List<BankAccount> animalAccounts = new ArrayList<>();

    public Controller() {

        animalAccounts.add(new BankAccount("Simba", 2000, "lion"));
        animalAccounts.add(new BankAccount("Nala", 1500, "lion"));
        animalAccounts.add(new BankAccount("Timon", 800, "meerkat"));
        animalAccounts.add(new BankAccount("Pumba", 650, "warthog"));
        animalAccounts.add(new BankAccount("Zazu", 4238, "hornbill"));

    }

    @RequestMapping(value = "/show")
    public String showAllAnimalAccounts (Model model) {
        model.addAttribute("list", animalAccounts);
        return "show";
    }

    @RequestMapping(value = "/string")
    public String showAString (Model model) {
        model.addAttribute("practiceString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "string";
    }

}
