package com.company;

import com.company.Models.PizzaMenu;
import com.company.Models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {

        PizzaMenu menu = new PizzaMenu();

        menu.addItem(new PizzaMenuItem("Salami", "Tasty pizza with Salami", 170));
        menu.addItem(new PizzaMenuItem("Cheese", "Tasty pizza with cheese", 160));

        for (PizzaMenuItem item: menu.getItems()) {
            System.out.println(item);
        }
    }
}
