package problem1;

public class FrameworkFactory {
    public static Framework getFramework(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("django")) return new Django(); 
        else if(type.equalsIgnoreCase("ruby")) return new Ruby(); 
        else if(type.equalsIgnoreCase("nodejs")) return new Node(); 

        return null; 
    }
}
