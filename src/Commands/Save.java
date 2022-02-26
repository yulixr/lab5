package Commands;

import Movie.MovieCollection;

import java.io.IOException;
import java.util.Scanner;

/**
 * The type Save.
 */
public class Save implements CommandNoArg {
    @Override
    public String execute(Object o) throws IOException {
        WriterFile.writeToXMLusingJDOM(MovieCollection.getCollection());
        return ("Сохранено");
    }

    @Override
    public String getName() {
        return "save";
    }
}