package problem2;

abstract class AbstractFactory {
    abstract Loan getLoan(String loan_type); 
    abstract Account getAccount(String account_type);
}
