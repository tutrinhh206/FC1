package Lec7_ArraysLoop;
import java.util.ArrayList;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // đọc bỏ ký tự xuống dòng
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task); // dùng add()
                    System.out.println("Task added!");
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet!");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < tasks.size(); i++) { // dùng size() và get()
                            System.out.println(i + " - " + tasks.get(i));
                        }
                    }
                }
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter index to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index); // dùng remove(index)
                            System.out.println("Task removed!");
                        } else {
                            System.out.println("Invalid index!");
                        }
                    }
                }
                case 4 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        scanner.close();
    }
}
