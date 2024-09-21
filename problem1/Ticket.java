package problem1;
import java.util.LinkedList; 

public class Ticket {
    private LinkedList<String> parts; 
    public Ticket(){
        parts = new LinkedList<String>(); 
    }

    public void Add(String part){
        parts.addLast(part);
    }

    public void show(){
        System.out.println("Printing the details of the Ticket...");
        for(int i=0;i<parts.size();i++){
            System.out.println(parts.get(i));
        }
    }

}
