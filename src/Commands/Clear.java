package Commands;

import Movie.MovieCollection;

/**
 * The Clear type.
 */
public class Clear implements CommandNoArg {

    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        if (collection.getSize()==0) return "Коллекция и так пустая.";
        collection.clear();
        return ("Коллекция очищена.");
    }

    @Override
    public String getName() {
        return "clear";
    }
}