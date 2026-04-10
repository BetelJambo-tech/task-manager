import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                } else {
                    System.out.println("\nYour Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter task number to delete: ");
                int index = scanner.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.remove(index - 1);
                    System.out.println("Task deleted.");
                } else {
                    System.out.println("Invalid task number.");
                }

            } else if (choice == 4) {
                System.out.print("Enter task number to mark completed: ");
                int index = scanner.nextInt();
                if (index > 0 && index <= tasks.size()) {
                    tasks.set(index - 1, tasks.get(index - 1) + " (Done)");
                    System.out.println("Task marked as completed.");
                } else {
                    System.out.println("Invalid task number.");
                }

            } else if (choice != 5) {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        System.out.println("Goodbye!");
        scanner.close();
    }
}
