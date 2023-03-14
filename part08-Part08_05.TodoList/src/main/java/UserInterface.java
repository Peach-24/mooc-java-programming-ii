import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
    }

    public void start () {

        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if (command.equals("list")) {
                todoList.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                String taskToRemove = scanner.nextLine();
                todoList.remove(Integer.parseInt(taskToRemove));
            }
        }

    }
}
