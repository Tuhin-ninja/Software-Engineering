package Task1;

public interface Subject {
    void addObserver(Observer observer); 
    void removeObserver(Observer observer); 
    void notifyObservers(String Genre, String Movie); 
    void addGenre(String name); 
    void removeGenre(String name);
}
