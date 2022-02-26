package Commands;

import Movie.MovieCollection;
import Movie.Movie;
import java.util.Iterator;
/**
 * The Count oscars type.
 */
public class CountOscars implements CommandableEx{
    @Override
    public String execute(Object arg) {
        try {
            int count = 0;
            MovieCollection collection = new MovieCollection();
            if (collection.getSize() == 0) return ("Коллекция пустая.");
            else {
                int n = Integer.parseInt((String) arg);
                for(Iterator<Movie> it = (Iterator<Movie>) MovieCollection.getCollection().iterator(); it.hasNext();)
                {
                    Movie movie = (Movie) it.next();
                    if (movie.getOscarsCount() == n)
                        count++;
                }
                return ("Фильмов с таким количеством оскаров: "+ count+"");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getName() {
        return "count_by_oscars_count";
    }
}
