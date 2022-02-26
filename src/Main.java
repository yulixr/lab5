import Movie.*;
import Commands.*;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
/**
 * The type Main.
 */
public class Main {
    /**
     * The main function.
     *
     * @param args
     */
    public static void main(String[] args) {
        MovieCollection movieCollection = new MovieCollection();
        Uncoder.fillCollection(ReaderFile.getFilePath());
        Commands commands = new Commands();
        commands.regist(new Exit(), new Help(), new Info(), new Insert(), new Show(), new Update(),
                new RemoveKey(), new RemoveGreater(), new RemoveLower(), new RemoveByMpaa(),
                new CountOscars(), new ShowOscarsElements(), new Save(), new Read(), new Clear(),
                new ExecuteScript());
        Scanner in = new Scanner(System.in);
        System.out.println("Введите команду, для справки введите help.");
        String com = "";
        while (true) {
            System.out.print("- ");
            String commandName = in.nextLine();
            com += commandName + "\n";
            if (!commandName.equals("") && !commandName.equals("history"))
                System.out.println(commands.doCommand(commandName));
            else if(commandName.equals("history"))
                System.out.println(com);
            System.out.println("Введите команду:");
        }
    }
}