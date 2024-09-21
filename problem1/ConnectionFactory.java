package problem1;

public class ConnectionFactory {
    public static Connection getConnection(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("wifi")) return new Wifi(); 
        else if(type.equalsIgnoreCase("gsm")) return new GSM(); 
        else if(type.equalsIgnoreCase("ethernet")) return new Ethernet(); 

        return null; 
    }
}
