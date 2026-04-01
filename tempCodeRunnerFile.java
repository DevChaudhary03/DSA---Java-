// ivan byross-Sql
// Perform a Porgram of Circular Queue and Enque or dequeue operation.
import java.util.Scanner;
public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] cq = new int[n];
        int front = -1;
        int rear = -1;
        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if ((rear + 1) % n == front) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.print("Enter the element to enqueue: ");
                        int element = sc.nextInt();
                        rear = (rear + 1) % n;
                        cq[rear] = element;
                        if (front == -1) {
                            front = 0;
                        }
                    }
                    break;
                case 2:
                    if (front == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        int element = cq[front];
                        if (front == rear) {
                            front = -1;
                            rear = -1;
                        } else {
                            front = (front + 1) % n;
                        }
                        System.out.println("Dequeued element: " + element);
                    }
                    break;
                case 3:
                    if (front == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.print("Elements in the queue: ");
                        for (int i = front; i != rear; i = (i + 1) % n) {
                            System.out.print(cq[i] + " ");
                        }
                        System.out.println(cq[rear]);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        
    }
}
