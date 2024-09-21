package problem2;

abstract class Account {
    protected double account_interest_rate; 
    protected String account_type; 
    abstract void setInterest(); 

    public void calculateInterset(double amount, int years){
        double total_interest = amount*account_interest_rate*years/100; 
        // System.out.println(total_interest);
        System.out.println("Your total Interest for "+years+"years under the "+account_type+" account on the amount "+ amount + " is "+total_interest);
    }

}
