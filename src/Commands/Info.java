package Commands;

import Movie.MovieCollection;

/**
 * The Info type.
 */
public class Info implements CommandNoArg{
    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        return (collection.getInfo());
    }

    @Override
    public String getName() {
        return "info";
    }
}
