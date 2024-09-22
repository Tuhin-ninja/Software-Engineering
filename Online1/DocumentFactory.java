package Online1;

public class DocumentFactory {
    public static DocumentProcessor getDocument(String filename){
        if(filename == null) return null; 

        else if(filename.contains(".pdf")){
            return new Pdf();
        }

        else if(filename.contains(".docx")){
            return new Docx();
        }

        else if(filename.contains(".txt")){
            return new Txt();
        }

        return null;
    }
}
