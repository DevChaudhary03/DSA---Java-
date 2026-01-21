
import java.util.Scanner;

public class ArrayInsertionSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial array
        int[] arr = new int[10];
        int size = 5;

        // Input initial elements
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nChoose insertion option:");
        System.out.println("1. Insert at Beginning");
        System.out.println("2. Insert at Position");
        System.out.println("3. Insert at End");

        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Insert at Beginning
                System.out.print("Enter element to insert: ");
                int element1 = sc.nextInt();

                for (int i = size; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = element1;
                size++;
                break;

            case 2: // Insert at Specific Position
                System.out.print("Enter element to insert: ");
                int element2 = sc.nextInt();

                System.out.print("Enter position (0-based index): ");
                int pos = sc.nextInt();

                for (int i = size; i > pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos] = element2;
                size++;
                break;

            case 3: // Insert at End
                System.out.print("Enter element to insert: ");
                int element3 = sc.nextInt();

                arr[size] = element3;
                size++;
                break;

            default:
                System.out.println("Invalid choice");
        }

        // Display updated array
        System.out.println("\nArray after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
