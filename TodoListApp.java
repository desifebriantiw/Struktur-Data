import java.util.ArrayList;
import java.util.Scanner;
public class TodoListApp {
    //shabrina
    private ArrayList<String> todoList;
    //membuat variabel todoList tipe datanya ArrayList<String>
    // Constructor to initialize the ArrayList
    public TodoListApp() {
        //amanda
        todoList = new ArrayList<>();
        //membuat object array list
    }
    // Method to add a task
    public void addTask(String task) {
        //reiva
        //kalo mau menambahkan item ke sebuah list codingan yang digunakan adalah
        todoList.add(task);
    }
    // Method to remove a task
    public void removeTask(String task) {
    }
    // Method to display all tasks
    public void displayTasks() {
        //show all task
        System.out.println("Your todo List");
        // create looping
        for (int i = 0; i < todoList.size() ; i++) {
            System.out.println(todoList.get(i));
        }
    }
    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
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
                    //nambahin 2 baris codingan
                    // ambil input dari pengguna
                    String taskToAdd = scanner.nextLine();
                    // panggil function addTask
                    app.addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    break;
                case 3:
                    app.displayTasks();
                    break;
                case 4:
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
