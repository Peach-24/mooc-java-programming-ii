import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String task){
        this.tasks.add(task);
    };

    public void print(){
        for (String task : this.tasks) {
            System.out.println((tasks.indexOf(task) + 1) + ": " + task);
        }
    };

    public void remove(int number){
        this.tasks.remove(number -1);
    };
}
