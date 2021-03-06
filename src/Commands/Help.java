package Commands;

/**
 * The type Help.
 */
public class Help implements CommandNoArg {
    @Override
    public String execute(Object o) {
        return ("help : вывести справку по доступным командам\n"+
        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n"+
        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n"+
        "insert : добавить новый элемент\n"+
        "update id : обновить значение элемента коллекции, id которого равен заданному\n"+
        "removekey id : удалить элемент из коллекции по его ключу\n"+
        "clear : очистить коллекцию\n"+
        "save : сохранить коллекцию в файл\n"+
        "execute_script file_name : считать и исполнить скрипт из указанного файла.\n"+
        "exit : завершить программу (без сохранения в файл)\n"+
        "removegreater id : удалить из коллекции все элементы, превышающие заданный\n"+
        "removelower id : удалить из коллекции все элементы, меньшие, чем заданный\n"+
        "history : вывести последние 12 команд (без их аргументов)\n"+
        "remove_all_by_mpaa_rating mpaaRating : удалить из коллекции все элементы, значение поля mpaaRating которого эквивалентно заданному\n"+
        "count_by_oscars_count oscarsCount : вывести количество элементов, значение поля oscarsCount которых равно заданному\n"+
        "filter_by_oscars_count oscarsCount : вывести элементы, значение поля oscarsCount которых равно заданному\n" );
    }

    @Override
    public String getName() {
        return "help";
    }
}
