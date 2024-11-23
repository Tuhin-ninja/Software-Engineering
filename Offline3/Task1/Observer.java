package Task1;

import java.util.List;

public interface Observer {
    List<String> getFavoriteGenres(); 
    void update(String genre, String movie);
    void addFavoriteGenre(String genre); 
    void removeFavoriteGenre(String genre); 
}
