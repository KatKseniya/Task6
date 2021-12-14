package com.epam.hw.task5.logic;

import com.epam.hw.task5.entity.Goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Basket {

    List<Goods> goods = new ArrayList <Goods>();

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public double totalPrice (ArrayList <Goods> goods) {
        double totalPrice = 0;
        for (int i = 0; i < goods.size(); i++) {
        totalPrice += goods.get(i).totalPrice();
        }
        return totalPrice;
    }

    public void print (ArrayList <Goods> goods) {
        for (int i = 0; i < goods.size(); i++)
        System.out.println(goods.get(i).getClass().getSimpleName() +
                ", price: " + goods.get(i).getPrice() +
                ", amount: " + goods.get(i).getAmount());
    }

    public void  check () {
        System.out.println(
                "Check" + "\n" + "Purchases:" + "\n" );

        print((ArrayList<Goods>) goods);

        System.out.println(
        "\n" + "Total: " + totalPrice((ArrayList<Goods>) goods));
    }


    public void  checkFullData () {
        System.out.println(
                "Check" + "\n" +
                "Purchase" + "\n" +
                goods + "\n" +
                "Total " + totalPrice((ArrayList<Goods>) goods));

    }

    public void sort (){
        Collections.sort(getGoods(), new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(getGoods());
    }

}
