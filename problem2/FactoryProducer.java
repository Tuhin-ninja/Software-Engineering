package problem2;

public class FactoryProducer {
    public static AbstractFactory geFactory(String factory_type){
        if(factory_type == null) return null; 
        else if(factory_type == "loan") return new LoanFactory(); 
        else if(factory_type == "account") return new AccountFactory(); 

        return null; 
    }
}
