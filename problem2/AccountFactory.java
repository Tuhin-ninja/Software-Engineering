package problem2;


public class AccountFactory extends AbstractFactory {
    public Account getAccount(String account_type){
        if(account_type == null) return null; 
        else if(account_type == "regular") return new RegularAccount(); 
        else if(account_type == "premium") return new PremiumAccount(); 
        else if(account_type == "vip") return new VIPAccount();

        return null; 
    }

    public Loan getLoan(String loan_type){
        return null; 
    }
}
