import java.util.Scanner;

public class stack1 {
    public static void main(String[] args) {

        // wap to push and pop using switch case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        int top = -1;
        int value;
        int[] stack = new int[size];

        while (true) {

            System.out.print(
                    "\nSelect operations to perform:\nEnter 1 to PUSH new value.\nEnter 2 to POP a value.\nEnter 3 to DISPLAY the Stack.\nEnter 5 to swap elements.\nEnter 6 to find MIN and MAX in the Stack.\nEnter 7 to find Factorial of stack.\nEnter 8 to get fibonacci of stack.\nEnter 10 to exit.\nChoice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (top == size - 1) {
                        System.out.println("\nStack is full.");
                    } else {
                        System.out.print("Enter value to push: ");
                        value = sc.nextInt();
                        top++;
                        stack[top] = value;
                    }
                    break;
                case 2:
                    if (top < 0) {
                        System.out.println("\nStack is empty.");
                    } else {
                        System.out.println("\nElement deleted.");
                        top--;
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("\nStack is empty.");
                    } else {
                        for (int i = top; i >= 0; i--) {
                            System.out.println("|" + stack[i] + "|");
                        }
                    }
                    break;
                case 5:
                    int index = -1;
                    int index2 = -1;

                    System.out.println("Stack elements:- ");
                    for (int i = top; i >= 0; i--) {
                        System.out.println("|" + stack[i] + "|");
                    }
                    System.out.print("Enter element to swap: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter 2nd element to swap with: ");
                    int ele2 = sc.nextInt();
                    for (int i = top; i >= 0; i--) {
                        if (ele == stack[i]) {
                            index = i;
                        } else if (ele2 == stack[i]) {
                            index2 = i;
                        }
                    }
                    if (index == -1 && index2 == -1) {
                        System.out.println("Elements not found.");
                    } else {
                        int temp = stack[index];
                        stack[index] = stack[index2];
                        stack[index2] = temp;
                    }
                    break;
                case 6:
                    int min = stack[0];
                    int max = stack[0];
                    for (int i = top; i >= 0; i--) {
                        if (stack[i] > max) {
                            max = stack[i];
                        } else if (stack[i] < min) {
                            min = stack[i];
                        }
                    }
                    System.out.println("Min: " + min + "\nMax: " + max);
                    break;
                case 7:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        for (int i = top; i >= 0; i--) {
                            int num = stack[i];
                            int fact = 1;

                            if (num < 0) {
                                System.out.println("Factorial not defined for negative: " + num);
                                continue;
                            }

                            for (int j = 1; j <= num; j++) {
                                fact *= j;
                            }

                            System.out.println("Factorial of " + num + " = " + fact);
                        }
                    }
                    break;
                case 8:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        int n = top + 1;

                        int a = 0, b = 1;

                        System.out.print("Fibonacci series: ");

                        for (int i = 0; i < n; i++) {
                            System.out.print(a + " ");

                            int next = a + b;
                            a = b;
                            b = next;
                        }
                        System.out.println();
                    }
                    break;
                case 10:
                    System.out.println("Program Ended.");
                    return;

                default:
                    System.out.println("invalid choice.");

            }
        }
        
    }
}