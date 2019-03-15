package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.model.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private List<BankAccount> animalAccounts = new ArrayList<>();

    public Controller() {

        animalAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        animalAccounts.add(new BankAccount("Nala", 1500, "lion", false, true));
        animalAccounts.add(new BankAccount("Timon", 800, "meerkat", false, true));
        animalAccounts.add(new BankAccount("Pumba", 650, "warthog", false, true));
        animalAccounts.add(new BankAccount("Zazu", 4238, "hornbill", false, true));
        animalAccounts.add(new BankAccount("Scar", 250, "lion", true, false));

    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showAllAnimalAccounts (Model model) {
        model.addAttribute("list", animalAccounts);
        return "show";
    }

    @RequestMapping(path = "/show", method = RequestMethod.POST)
    public String raiseBalance(Model model, @RequestParam(name = "animalIndex") int index) {
        animalAccounts.get(index).raiseBalance();
        model.addAttribute("list", animalAccounts);
        return "show";
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("newAccount", new BankAccount());
        return "newaccountform";
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String addNewAccount(@ModelAttribute BankAccount newAccount) {
        animalAccounts.add(newAccount);
        return "redirect:/show";
    }

    @RequestMapping(value = "/string")
    public String showAString (Model model) {
        model.addAttribute("practiceString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "string";
    }

}
