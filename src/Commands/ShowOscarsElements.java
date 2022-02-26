package Commands;

import Movie.MovieCollection;
import Movie.Movie;
import java.util.Iterator;
import java.util.Locale;
/**
 * The Show Oscars Elements.
 *  Shows elements with exact oscars number.
 */
public class ShowOscarsElements implements CommandableEx{
    @Override
    public String execute(Object arg) {
        try {
            String s = "";
            MovieCollection collection = new MovieCollection();
            if (collection.getSize() == 0) return ("Коллекция пустая.");
            else {
                int n = Integer.parseInt((String)arg);
                for(Iterator<Movie> it = (Iterator<Movie>) MovieCollection.getCollection().iterator(); it.hasNext();)
                {
                    Movie movie = (Movie) it.next();
                    if (movie.getOscarsCount() == n)
                         s += movie.getInfo();
                    s+="\n";
                }
            }
            return s;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getName() {
        return "filter_by_oscars_count";
    }
}
