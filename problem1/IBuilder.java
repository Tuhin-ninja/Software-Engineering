package problem1;

public interface IBuilder {
    void BuildPackage(String type); 
    void BuildConnection(String type); 
    void BuildFramework(String type); 
    Ticket GetTicket();
}
