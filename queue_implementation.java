import java.util.Scanner;

public class queue_implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the queue size:");
        int size = sc.nextInt();
        int queue[] = new int[size];
        int front = -1;
        int rear = -1;

        System.out.println("1-Perform Enqueue Operation:");
        System.out.println("2-perfomr the dequeu operation:");
        System.out.println("3-display");
        System.out.println("4- exit");
        while (true) {

            System.out.println("enter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (rear == size - 1) {
                        System.out.println("oveflow");
                    } else {
                        System.out.println("Enter the Value:");
                        int value = sc.nextInt();
                        if (front == -1) {
                            front = 0;
                        }
                        rear++;
                        queue[rear] = value;
                        System.out.println("Donee");

                    }
                    break;
                case 2:
                    if (front == -1 || front > rear) {
                        System.out.println("underflow");
                    } else {
                        System.out.println("deleted element:" + queue[front]);
                    }
                    break;
                case 3: // Display
                    if (front == -1 || front > rear) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue elements:");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
