package MidtermSprint;

public class User {
    private String name;
    private TaskList taskList;

    // Constructor
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    // Add task
    public void addTask(String description) {
        taskList.addTask(description);
    };

    // Mark task as completed
    public void markAsCompleted(String description) {
        taskList.markAsCompleted(description);
    };

    // Print all tasks for user
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }

    // Getter
    public String getName() {
        return name;
    }
}
