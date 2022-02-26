package Commands;
/**
 * The type Exit.
 */
public class Exit implements CommandNoArg{
    @Override
    public String execute(Object o) {
        System.out.println("Завершаю работу.");
        System.exit(0);
        return null;
    }

    @Override
    public String getName() {
        return "exit";
    }
}