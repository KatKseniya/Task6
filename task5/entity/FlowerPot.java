package com.epam.hw.task5.entity;

import com.epam.hw.task5.emun.Color;

import java.util.Objects;

public class FlowerPot extends Goods {
    private Color color;
    private double volume;

    public FlowerPot(double price, double amount, Color color, double volume) {
        super(price, amount);
        this.color = color;
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlowerPot)) return false;
        if (!super.equals(o)) return false;
        FlowerPot flowerPot = (FlowerPot) o;
        return Double.compare(flowerPot.getVolume(), getVolume()) == 0 && Objects.equals(getColor(), flowerPot.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getVolume());
    }

//    @Override
//    public String toString() {
//        return "FlowerPot{" +
//                "color='" + color + '\'' +
//                ", volume=" + volume +
//                '}';
//    }

        @Override
    public String toString() {
        return "FlowerPot " +
                "color='" + color + '\'' +
                ", volume=" + volume +
                ", price='" + getPrice() + '\'' +
                ", amount='" + getAmount() + '\'' +
                '\n';
    }
}
