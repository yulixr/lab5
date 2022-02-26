package Commands;

import Movie.Movie;
import Movie.MovieCollection;

import java.util.Collection;

/**
 * The type Update.
 */
public class Update implements CommandableEx {

    @Override
    public String execute(Object arg) {
        MovieCollection collection = new MovieCollection();
        try {
            if (collection.isIndexBusy(Integer.parseInt((String) arg))) {
                int id=Integer.parseInt((String) arg);
                Movie movieToDelete = MovieCollection.getCollection().stream().filter(o->o.getId()==id).findFirst().get();
                collection.add((new MovieInserter()).create( (String) arg));
                MovieCollection.getCollection().remove(movieToDelete);
                return ("Фильм [id:" + arg + "] успешно обновлен.");
            } else return ("Элемента с таким id не существует.");
        } catch (Exception e) {
            return ("Элемента с таким id не существует.");
        }
    }

    @Override
    public String getName() {
        return "update";
    }
}