package problem1;

public class TicketingSystem implements IBuilder {
    private Ticket ticket = new Ticket(); 
    public void BuildPackage(String type){
        ticket.Add("Microprocessor : "+PackageFactory.getMicroprocessor(type).process());
        ticket.Add("Display : "+PackageFactory.getDisplay(type).display()); 
        ticket.Add("Identification : "+PackageFactory.getIdentification(type).identify());
        ticket.Add("Payment Info : "+PackageFactory.getPayment(type).pay());
        ticket.Add("Storage : "+PackageFactory.getStorage(type).Store());
        ticket.Add("Controller : "+PackageFactory.getController(type).control());
    }

    public void BuildConnection(String type){
        ticket.Add("Connection : "+ConnectionFactory.getConnection(type).connect());
    }

    public void BuildFramework(String type){
        ticket.Add("Framework : "+FrameworkFactory.getFramework(type).useFramework());
    }

    public Ticket GetTicket(){
        return ticket; 
    }
}
