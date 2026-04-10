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
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (choice == 2) {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + ": " + tasks.get(i));
                }
            } else if (choice == 3) {
                System.out.print("Enter index to delete: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < tasks.size()) {
                    tasks.remove(index);
                }
            }

        } while (choice != 4);

        scanner.close();
    }
}
