package Commands;

import java.io.IOException;

/**
 * The interface Commandable.
 */
public interface CommandableEx {
    /**
     * Execute string.
     *
     * @param o the o
     * @return the string
     * @throws IOException the io exception
     */
    String execute(Object o) throws IOException;

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();
}
