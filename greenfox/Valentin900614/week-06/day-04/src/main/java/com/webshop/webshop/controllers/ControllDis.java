package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ControllDis {

        List<ShopItem> list = new ArrayList<>();

        public ControllDis() {
                ShopItem shopItem = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
                list.add(shopItem);
                ShopItem shopItem1 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
                list.add(shopItem1);
                ShopItem shopItem2 = new ShopItem("Coca cola", "0.5l standard coke", 25, 0);
                list.add(shopItem2);
                ShopItem shopItem3 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100);
                list.add(shopItem3);
                ShopItem shopItem4 = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1);
                list.add(shopItem4);
        }

        @RequestMapping(value = "/")
        public String showAllShopItems(Model model) {
                model.addAttribute("list", list);
                return "index";
        }

        @RequestMapping(value = "/onlyavailable")
        public String showOnlyAvailableItems(Model model) {
                List<ShopItem> newList = list.stream()
                        .filter(s -> s.getQuantityOfStock() > 0)
                        .collect(Collectors.toList());

                model.addAttribute("list", newList);
                return "index";
        }

        @RequestMapping(value = "/averagestock")
        public String countAverageOfStock(Model model) {
                double sumStock = list.stream()
                        .mapToDouble(a -> a.getQuantityOfStock())
                        .average().getAsDouble();

                model.addAttribute("average", sumStock);
                return "averagestock";
        }

        @RequestMapping(value = "/cheapestfirst")
        public String sortItemsAsCheapestFirst(Model model) {
                List<ShopItem> cheapestList = list.stream()
                        .sorted(Comparator.comparing(ShopItem::getPrice))
                        .collect(Collectors.toList());
                model.addAttribute("list", cheapestList);
                return "index";
        }

        @RequestMapping(value = "/mostexpensive")
        public String showMostExpensiveItem(Model model) {
                        ShopItem mostExpensiveItem = Collections.max(list, Comparator.comparing(s -> s.getPrice()));
                        model.addAttribute("list", mostExpensiveItem);
                        return "index";
        }

        @RequestMapping(value = "/containsnike")
        public String showItemsWhichContainsNike(Model model) {
                List<ShopItem> nikeList = list.stream()
                        .filter(s -> s.getName().toLowerCase().contains("nike") || s.getDescription().toLowerCase().contains("nike"))
                        .collect(Collectors.toList());

                model.addAttribute("list", nikeList);
                return "index";
        }

        @RequestMapping(value = "/search", method = RequestMethod.POST)
        public String showSearchedItems(Model model, @RequestParam(name = "search", required = false) String search) {
                List<ShopItem> searchedList = new ArrayList<>();
                if (search != null) {
                        searchedList = list.stream()
                                .filter(s -> s.getName().toLowerCase().contains(search) || s.getDescription().toLowerCase().contains(search))
                                .collect(Collectors.toList());

                        model.addAttribute("list", searchedList);
                } else
                        searchedList.add(new ShopItem("No record", "Zero items have your keyword", 0, 0));
                        model.addAttribute("list", searchedList);

                return "index";
        }

}
