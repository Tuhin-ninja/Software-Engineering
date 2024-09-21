package problem1;

public class PackageFactory {
    public static Microprocessor getMicroprocessor(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("basic")) return new Atmega32(); 
        else if(type.equalsIgnoreCase("standard")) return new Arduino(); 
        else if(type.equalsIgnoreCase("advanced")) return new RaspberryPi(); 
        else if(type.equalsIgnoreCase("premium")) return new RaspberryPi(); 


        return null;

    }

    public static Display getDisplay(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("basic")) return new Lcd();
        else if(type.equalsIgnoreCase("standard")) return new Led();
        else if(type.equalsIgnoreCase("advanced")) return new Oled(); 
        else if(type.equalsIgnoreCase("premium")) return new TouchScreenDisplay();

        return null; 
    }

    public static Identification getIdentification(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("basic")) return new RFID();
        else if(type.equalsIgnoreCase("standard")) return new RFID(); 
        else if(type.equalsIgnoreCase("advanced")) return new NFC(); 
        else if(type.equalsIgnoreCase("premium")) return new NFC(); 

        return null; 
    }

    public static Payment getPayment(String type){
        if(type == null) return null; 
        return new PaymentSystem(); 
    }

    public static Storage getStorage(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("basic")) return new SDCard(); 
        else if(type.equalsIgnoreCase("standard")) return new SDCard();
        else if(type.equalsIgnoreCase("advanced")) return new ProvidedStorage(); 
        else if(type.equalsIgnoreCase("premium")) return new ProvidedStorage(); 

        return null; 
    }

    public static Controller getController(String type){
        if(type == null) return null; 
        else if(type.equalsIgnoreCase("basic")) return new SeparateController();
        else if(type.equalsIgnoreCase("standard")) return new SeparateController();
        else if(type.equalsIgnoreCase("advanced")) return new TouchScreenController(); 
        else if(type.equalsIgnoreCase("premium")) return new TouchScreenController(); 

        return null; 
    }
}
