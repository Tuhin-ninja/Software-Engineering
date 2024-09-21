package problem1;
import java.util.Scanner;


public class TicketingSystemExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director(); 
        IBuilder ticketingSystemBuilder = new TicketingSystem(); 
        String pack, connection, framework; 

        System.out.println("Welcome to Ticketing System!!");
        System.out.println("\n\n");


        //*****     Package selection  *****/

        System.out.println("We have four packages from Basic to Premium.");
        System.out.println("Basic : ATMega32 with LCD display");
        System.out.println("Standard : Arduino Mega with LED display");
        System.out.println("Advanced : Raspberry Pi with OLED display");
        System.out.println("Premium : Raspberry Pi with touch screen display");
        System.out.print("Enter your package : ");
        pack = scanner.nextLine(); 
        System.out.println("\n\n");




        //*****   Connection Type Selection  ******/

        System.out.println("We Provide Several types of Internet Connections.");
        System.out.println("WiFi");
        System.out.println("GSM");
        if(pack.equalsIgnoreCase("basic") || pack.equalsIgnoreCase("standard")){
            System.out.print("Enter your connection : ");
            connection = scanner.nextLine();
        }
        else{
            System.out.println("Ethernet");
            System.out.print("Enter your connection : ");
            connection = scanner.nextLine();
        }
        System.out.println("\n\n");



        //****   Framework Selection  ******/

        System.out.println("We also provide several types of web browser framework.");
        System.out.println("Django");
        System.out.println("NodeJS");
        System.out.println("Ruby");
        System.out.print("Enter your framework : ");
        framework = scanner.nextLine();
        System.out.println("\n\n");
        

        director.ProduceTicket(ticketingSystemBuilder, pack, connection, framework);
        Ticket ticket = ticketingSystemBuilder.GetTicket(); 
        ticket.show();









        scanner.close();
    }
}
