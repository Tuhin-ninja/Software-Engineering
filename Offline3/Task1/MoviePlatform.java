package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MoviePlatform implements Subject {
    private List<Observer> observers; 
    private ExecutorService executorService;
    private List<String> genres; 

    public MoviePlatform(){
        observers = new ArrayList<>();
        genres  = new ArrayList<>();
        this.executorService = Executors.newCachedThreadPool();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        // throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        // throw new UnsupportedOperationException("Unimplemented method 'removeObserver'");
    }

    @Override
    public void notifyObservers(String genre, String movie) {
        for (Observer observer : observers) {
            if (observer.getFavoriteGenres().contains(genre)) {
                executorService.execute(() -> observer.update(genre,movie));
            }
        }
        // throw new UnsupportedOperationException("Unimplemented method 'notifyObservers'");
    }

    @Override
    public void addGenre(String name) {
        genres.add(name);
        // throw new UnsupportedOperationException("Unimplemented method 'addGenre'");
    }

    @Override
    public void removeGenre(String name) {
        genres.remove(name);
        for (Observer observer : observers) {
            if(observer.getFavoriteGenres().contains(name)){
                observer.removeFavoriteGenre(name);
            }
        }
        // throw new UnsupportedOperationException("Unimplemented method 'removeGenre'");
    }

    public void upload(String genre,String movie){
        if (!genres.contains(genre)) {
            System.out.println("The genre " + genre + " is not available on the platform");
            return;
        }
        notifyObservers(movie, genre);
    }

    public void close(){
        executorService.close();
    }
    
}
