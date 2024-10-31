package Offline2.problem1;

// import java.lang.reflect.Array;
import java.util.ArrayList;

public class Combo implements Menu{
    private String name;
    private float price;
    public ArrayList<Menu> items;
    public ArrayList<Menu> frees;
    private float discount;
    public Combo(String name){
        this.name = name;
        this.discount = 0;
        items = new ArrayList<>();
        frees = new ArrayList<>();
    }

    public void addItem(Menu item){
        items.add(item);
    }

    public void addFreeItem(Menu item){
        frees.add(item);
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public float getPrice(){
        if(this.price != 0){
            return this.price;
        }
        float totalPrice = 0;
        for(Menu item: items){
            totalPrice += item.getPrice();
        }
        return totalPrice - totalPrice * discount / 100;
    }

    public float getDiscount(){
        return this.discount;
    }


    public String getName() {
        StringBuilder comboDescription = new StringBuilder(this.name + " (");
        for (int i = 0; i < items.size(); i++) {
            comboDescription.append(items.get(i).getName());
            if (i < items.size() - 1) {
                comboDescription.append(" +  ");
            }
        }
        
        if(frees.size()>0){
            // comboDescription.append("\n");
            comboDescription.append(" + Free Items (");
            for (int i = 0; i < frees.size(); i++) {
                comboDescription.append(frees.get(i).getName());
                if (i < frees.size() - 1) {
                    comboDescription.append(" + ");
                }
            }
            comboDescription.append(")");
        }

        comboDescription.append(")");
        return comboDescription.toString();
    }
    
    
}
