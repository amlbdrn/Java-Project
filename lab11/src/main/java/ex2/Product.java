package ex2;

public class Product {

    private String name="None";
    private int quantity=0;
    private int price=0;

    public void setName(String name) {
        this.name=name;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    public void setPrice(int price) {
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
