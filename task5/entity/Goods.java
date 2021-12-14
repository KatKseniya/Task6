package com.epam.hw.task5.entity;
import java.util.Objects;

public class Goods{
    private double price;
    private double amount;

    public Goods() {
    }

    public Goods(double price, double amount) {
        this.price = price;
        this.amount = amount;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double totalPrice () {
        return price*amount;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return getPrice() == goods.getPrice() && getAmount() == goods.getAmount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getAmount());
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", amount=" + amount +
                '}';
    }



    //    @Override
//    public String toString() {
//        return "Goods{" +
//                "price=" + price +
//                ", amount=" + amount +
//                '}';
//    }
}
