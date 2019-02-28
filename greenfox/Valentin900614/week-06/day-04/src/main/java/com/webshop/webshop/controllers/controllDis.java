package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class controllDis {

        List<ShopItem> list = new ArrayList<>();
        AtomicLong atomicLong = new AtomicLong(0);

        @RequestMapping
        public String index(Model model) {

            if (atomicLong.intValue() == 0) {
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
                model.addAttribute("list", list);
            }
            atomicLong.incrementAndGet();

            return "index";
    }

}
