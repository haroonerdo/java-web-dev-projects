import java.util.Scanner;
import java.util.HashMap;
public class HashMapPractice {
    public static void main(String[] args) {
// Create a HashMap to store student ID as key and name as value
        HashMap<Integer, String> studentMap = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        // Keep adding students until the user chooses to stop
        while (true) {
            System.out.println("Enter student ID (integer) or 0 to stop:");
            int id = scan.nextInt();

            // If user enters 0, stop adding students
            if (id == 0) {
                break;
            }

            System.out.println("Enter student name:");
            scan.nextLine(); // Consume newline left-over
            String name = scan.nextLine();

            studentMap.put(id, name);

            // Display the student list
            System.out.println("Student List:");
            for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
        System.out.println("Student List:");
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
