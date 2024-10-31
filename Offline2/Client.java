package Offline2;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuHandler menuHandler = new MenuHandler();
        Combo availableItems = menuHandler.getTotalMenu();

        while(true) {
            System.out.print("Press 1 to create a combo, 2 to view menu\n" + //
                                "and 0 to exit : ");
            int choice = scanner.nextInt();
            if(choice == 1) {
                System.out.print("Enter the name of the combo : ");
                String name = scanner.next();
                scanner.nextLine();
                Combo combo = new Combo(name);

                System.out.println("Available commands:\n" +
                "Add [item]\n" +
                "Remove [item]\n" +
                "Free [item]\n" +
                "Discount [percentage]\n" +
                "Done");

                while (true) {
                    System.out.print("Enter command: ");
                    String input = scanner.nextLine();
                    String[] parts = input.split(" ", 2);
                    String command = parts[0];
        
                    if (command.equalsIgnoreCase("Done")) {
                        break;
                    } 
                    
                    else if (command.equalsIgnoreCase("Add")) {
                        String itemName = parts[1];
                        for (Menu item : availableItems.items) {
                            if (item.getName().equalsIgnoreCase(itemName) || item.getName().toLowerCase().contains(itemName.toLowerCase())) {
                                combo.addItem(item);
                                break;
                            }
                        }
                    } 
                    
                    else if (command.equalsIgnoreCase("Remove")) {
                        String itemName = parts[1];
                        for(Menu item : combo.items) {
                            if(item.getName().equalsIgnoreCase(itemName) || item.getName().toLowerCase().contains(itemName.toLowerCase())) {
                                combo.items.remove(item);
                                break;
                            }
                        }
                    } 
                    
                    else if (command.equalsIgnoreCase("Free")) {
                        String itemName = parts[1];
                        System.out.println("Free Item: " + itemName);
                        for(Menu item : availableItems.items) {
                            System.out.println(item.getName());
                            if(item.getName().equalsIgnoreCase(itemName)) {
                                combo.addFreeItem(item);
                                break;
                            }
                        }
                    } 
                    
                    else if (command.equalsIgnoreCase("Discount")) {
                        int percentage = Integer.parseInt(parts[1]);
                        combo.setDiscount(percentage);
                        System.out.println("Discount of " + percentage + "% applied.");
                    } else {
                        System.out.println("Invalid command.");
                    }
                }


                System.out.println("Your Combo : ");
                System.out.println(name);
                float actualPrice = 0;
                for (Menu item : combo.items) {
                    System.out.println(" - "+item.getName());
                    actualPrice += item.getPrice();
                }
                for (Menu item : combo.frees) {
                    System.out.println(" - "+item.getName() + " (Free!!!)");
                }
                System.out.println("Total : "+actualPrice);
                System.out.println("Discount : "+combo.getDiscount() + "%");
                System.out.println("Discounted Total : "+combo.getPrice());


                availableItems.addItem(combo);
        
            } 
            
            else if(choice == 2) {
                menuHandler.ExistingMenuItems();
            } 
            
            else if(choice == 0) {
                break;
            } 
            
            else {
                System.out.println("Invalid choice");
                break;
            }
        }

        scanner.close();

    }

}
