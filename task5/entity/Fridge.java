package com.epam.hw.task5.entity;

import java.util.Objects;

public class Fridge extends Goods {

    private String model;

    public Fridge(double price, double amount, String model) {
        super(price, amount);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fridge)) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return Objects.equals(getModel(), fridge.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getModel());
    }

    @Override
    public String toString() {
        return "Fridge " +
                "model='" + model + '\'' +
                                ", price='" + getPrice() + '\'' +
                ", amount='" + getAmount() + '\'' +
                '\n';
    }
}
