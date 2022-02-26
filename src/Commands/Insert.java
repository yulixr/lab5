package Commands;

import Movie.MovieCollection;

import Movie.MovieCollection;

/**
 * The type Insert.
 */
public class Insert implements CommandNoArg {

    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        collection.add(new MovieInserter().create("free"));
        return ("Вы добавили фильм в коллекцию");
    }

    @Override
    public String getName() {
        return "insert";
    }
}