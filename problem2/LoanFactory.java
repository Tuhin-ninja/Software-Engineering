package problem2;

public class LoanFactory extends AbstractFactory{
    public Loan getLoan(String loan_type){
        if(loan_type == null) return null;
        else if(loan_type == "regular") return new RegularLoan(); 
        else if(loan_type == "premium") return new PremiumLoan(); 
        else if(loan_type == "vip") return new VIPLoan(); 

        return null; 
    }

    public Account getAccount(String account_type){
        return null; 
    }


}
