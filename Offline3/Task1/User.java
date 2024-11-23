package Task1;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    List<String> FavoriteGenres; 
    String userName; 
    public User(String name){
        FavoriteGenres  = new ArrayList<>();
        userName = name; 
    }
    @Override
    public List<String> getFavoriteGenres() {
        return FavoriteGenres;
        // throw new UnsupportedOperationException("Unimplemented method 'getFavoriteGenres'");
    }

    @Override
    public void update(String genre, String movie) {
        System.out.println(userName+" has been updated with movie : "+movie+" and genre : "+genre);
        // throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void addFavoriteGenre(String genre) {
        FavoriteGenres.add(genre);
        // throw new UnsupportedOperationException("Unimplemented method 'addFavoriteGenre'");
    }

    @Override
    public void removeFavoriteGenre(String genre) {
        FavoriteGenres.remove(genre);
        // throw new UnsupportedOperationException("Unimplemented method 'removeFavoriteGenre'");
    }
    
}
