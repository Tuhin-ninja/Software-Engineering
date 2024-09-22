package Online1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your filename : ");
        String filename = scanner.nextLine();
        DocumentProcessor file = DocumentFactory.getDocument(filename);
        file.loadDocument();
        file.saveDocument(); 

        scanner.close();
    }
}
