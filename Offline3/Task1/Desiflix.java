package Task1;

public class Desiflix {
    public static void main(String[] args) {
        User tuhin = new User("tuhin"); 
        User dip = new User("dip"); 
        User fahim = new User("fahim"); 
        User absk = new User("absk");
        tuhin.addFavoriteGenre("Thriller");
        dip.addFavoriteGenre("Thriller");
        fahim.addFavoriteGenre("Thriller");
        absk.addFavoriteGenre("Comedy");

        MoviePlatform moviePlatform = new MoviePlatform(); 
        moviePlatform.addGenre("Thriller");
        moviePlatform.addObserver(tuhin);
        moviePlatform.addObserver(fahim);
        moviePlatform.addObserver(dip);
        moviePlatform.upload("Thriller", "The Nun");


        moviePlatform.addGenre("Comedy");
        moviePlatform.addObserver(absk);
        moviePlatform.upload("Comedy", "The hashi");


        dip.removeFavoriteGenre("Thriller");
        moviePlatform.upload("Thriller", "Suspense");
        moviePlatform.close();
    }
}
