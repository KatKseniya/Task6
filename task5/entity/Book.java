package com.epam.hw.task5.entity;

import java.util.Objects;

public class Book extends Goods {
    private String title;
    private String author;

    public Book(double price, double amount, String title, String author) {
        super(price, amount);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double totalPrice() {
        return getAmount()*getPrice();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTitle(), getAuthor());
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }



        @Override
    public String toString() {
        return
                "Book" + '\'' +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + getPrice() + '\'' +
                ", amount='" + getAmount() + '\'' +
                '\n';
    }

}
