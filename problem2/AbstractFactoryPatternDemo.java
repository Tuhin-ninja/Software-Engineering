package problem2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factoryProducer1 = FactoryProducer.geFactory("loan"); 
        AbstractFactory factoryProducer2 = FactoryProducer.geFactory("account"); 

        // Loan Part 

        Loan l1 = factoryProducer1.getLoan("regular"); 
        l1.setInterest();
        l1.calculateInterset(1500, 2);
        Loan l2 = factoryProducer1.getLoan("premium"); 
        l2.setInterest();
        l2.calculateInterset(1500, 2);
        Loan l3 = factoryProducer1.getLoan("vip"); 
        l3.setInterest();
        l3.calculateInterset(1500, 2);


        // Account Part 

        Account a1 = factoryProducer2.getAccount("regular"); 
        a1.setInterest();
        a1.calculateInterset(1500, 2);
        Account a2 = factoryProducer2.getAccount("premium"); 
        a2.setInterest();
        a2.calculateInterset(1500, 2);
        Account a3 = factoryProducer2.getAccount("vip");
        a3.setInterest();
        a3.calculateInterset(1500, 2);
    }
}
