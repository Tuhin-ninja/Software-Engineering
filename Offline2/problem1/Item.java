package Offline2.problem1;

public class Item implements Menu{
    private String name;
    private float price;
    public Item(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }
}
