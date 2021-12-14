package com.epam.hw.task5.main;

import com.epam.hw.task5.emun.Color;
import com.epam.hw.task5.entity.*;
import com.epam.hw.task5.logic.Basket;


public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.getGoods().add(new Book(200, 1, "Title", "Author"));
        basket.getGoods().add(new Book(50, 2, "Title2", "Author2"));
        basket.getGoods().add(new Book(100, 2, "Title1", "Author1"));

        basket.getGoods().add(new CrismasTree(500, 1, 3));
        basket.getGoods().add(new CrismasTree(200, 2, 2));
        basket.getGoods().add(new FlowerPot(50, 1, Color.RED, 3.5));
        basket.getGoods().add(new Fridge(1000, 1, "LG"));
        basket.getGoods().add(new FlowerPot(100, 1, Color.GREEN, 5));

        basket.check();

        basket.sort();

//      basket.checkFullData();
      }
    }

