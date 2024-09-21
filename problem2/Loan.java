package problem2;

abstract class Loan {
    protected double loan_interest; 
    protected String loan_type; 
    abstract void setInterest(); 
    public void calculateInterset(double amount, int years){
        double total_interest = amount*loan_interest*years/100; 
        System.out.println("Your total Interest for "+years+ "years under the "+loan_type+" loan on the amount "+ amount + " is "+total_interest);
    }
}
