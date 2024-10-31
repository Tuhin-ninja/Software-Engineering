package Offline2.problem1;

public class MenuHandler {
    public Combo totalMenu; 
    public MenuHandler(){
        totalMenu = new Combo("Total Menu");
        Menu burger = new Item("Burger", 300);
        Menu fries = new Item("Fries", 100);
        Menu wedges = new Item("Wedges", 150);
        Menu shawarma = new Item("Shawarma", 200);
        Menu drink = new Item("Drink", 25);
    
        // Combo totalMenu = new Combo("Total Menu");
        totalMenu.addItem(burger);
        totalMenu.addItem(fries);
        totalMenu.addItem(wedges);
        totalMenu.addItem(shawarma);
        totalMenu.addItem(drink);
    
        Combo combo1 = new Combo("Combo1");
        combo1.addItem(burger);
        combo1.addItem(fries);
        combo1.addItem(drink);
        combo1.setPrice(400);
        totalMenu.addItem(combo1);
    
        Combo combo2 = new Combo("Combo2");
        combo2.addItem(shawarma);
        combo2.addItem(drink);
        combo2.setPrice(215);
        totalMenu.addItem(combo2);

    }
    public void ExistingMenuItems(){
        // System.out.println("Total Menu: " + totalMenu.getName());
        totalMenu.items.forEach(item -> {
            System.out.println(item.getName() + " - " + item.getPrice());
        });
    }

    public Combo getTotalMenu(){
        return totalMenu;
    }
}
