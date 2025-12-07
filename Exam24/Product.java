package Exam24;
public class Product implements CartItem {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return this.name+";"+this.price;
    }
}
