package ex4;

import ex2.Author;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock=0;

    public Book(String name, Author[] author, double price, int qtyInStock) {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }

    public Book(String name, Author[] author, double price) {
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public void printAuthors() {
        String content="The authors of the book named :" + getName() + " are: ";
        for(Author tempAuthor : authors){
            content=content.concat(" " + tempAuthor.getName() + " ");
        }
        System.out.println(content);
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String toString() {
        return "Book: " + name + "by" + authors.length + "authors";
    }
}
