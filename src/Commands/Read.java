package Commands;

import Movie.MovieCollection;

import java.io.IOException;
import java.util.Scanner;

/**
 * The type Read.
 */
public class Read implements CommandNoArg {
    @Override
    public String execute(Object o) throws IOException {
        String s = ReaderFile.getFilePath();
        ReaderFile.readFromFile(s);
        return ("");
    }

    @Override
    public String getName() {
        return "read";
    }
}