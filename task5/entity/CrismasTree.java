package com.epam.hw.task5.entity;

import java.util.Objects;

public class CrismasTree extends Goods {
    private double size;

    public CrismasTree(double price, double amount, double size) {
        super(price, amount);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CrismasTree)) return false;
        if (!super.equals(o)) return false;
        CrismasTree that = (CrismasTree) o;
        return Double.compare(that.getSize(), getSize()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSize());
    }

//    @Override
//    public String toString() {
//        return "CrismasTree{" +
//                "size=" + size +
//                '}';
//    }

        @Override
    public String toString() {
        return "CrismasTree " +
                "size=" + size +
                ", price='" + getPrice() + '\'' +
                ", amount='" + getAmount() + '\'' +
                '\n';
    }
}
