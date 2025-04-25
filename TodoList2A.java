import java.util.ArrayList;
import java.util.Scanner;

public class TodoList2A {
    private ArrayList<String> todoList;

    // Constructor to initialize the ArrayList
    public TodoList2A() {
        todoList = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(String task) {
        //fixing tambah task
    }

    // Method to remove a task
    public void removeTask(String task) {
        //fixing remote task by task name

    }

    // Method to display all tasks
    public void displayTasks() {
        //fixing displayTask
    }
    //fitur search task by index

    //fitur remo task by index
    public void removeTaskByIndex(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task \"" + removedTask + "\" has been removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }


    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            //fixing menu ?
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By Task Name");
            System.out.println("5. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    app.addTask(taskToAdd);
                    break;

                case 2:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    app.removeTask(taskToRemove);
                    break;

                case 3: 
                    app.displayTasks();
                    System.out.print("Enter the index of the task to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); 
                    app.removeTaskByIndex(indexToRemove);
                    break;  
                case 4;
                app.displayTasks();
                break;

                case 5:
                    running = false;
                    System.out.println("Exiting the application...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
