package Online1;

public class Pdf implements DocumentProcessor {
    public void loadDocument(){
        System.out.println("PDF Document has been loaded.");
    }

    public void saveDocument(){
        System.out.println("PDF Document has been saved.");
    }
}
