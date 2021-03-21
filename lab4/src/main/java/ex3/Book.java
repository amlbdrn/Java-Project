package ex3;

import ex2.Author;

public class Book extends Author {

    public String name;
    public Author author;
    public double price;
    public int qtyInStock=0;

    public Book(String name, Author author, double price) {
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name=name;
        this.price=price;
        this.qtyInStock=qtyInStock;
        this.author=author;
    }

    public String getName() {

        return name;
    }

    public Author getAuthor() {

        return author;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getQtylnStock() {

        return qtyInStock;
    }

    public void setQtylnStock(int qtylnStock) {

        this.qtyInStock = qtylnStock;
    }

    public String toString() {

        return "Book: " + name + "by" + author;
    }
}
