package com.greenfoxacademy.hundredacrewood.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderList {

    private List<Order> orders;
    private List<Order> filteredList;

    public OrderList() {
        this.orders = new ArrayList<>();
        initiallizeList();
    }

    private void initiallizeList() {
        orders.add(new Order("Honey", 0, 0));
        orders.add(new Order("Honey", 20, 0));
        orders.add(new Order("Honey", 400, 0));
        orders.add(new Order("Moslek", 20, 1));
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> filterByInhabitantId (int id) {
        filteredList = new ArrayList<>();
        for (Order order : orders) {
            if (order.getInhabitantId() == id)
                filteredList.add(order);
        }

        return filteredList;
    }

    public int countOrdersById (int id) {
        int sum = 0;
        for (Order order : orders) {
            if (order.getInhabitantId() == id)
                sum++;
        }
        return sum;
    }

}
