
//wap a program in java to perform push and pop operation in stack 
import java.util.Scanner;

public class push_pop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the stack size :");
        int size = sc.nextInt();
        int top = -1;
        int value;
        int []stack = new int[size];

        while(true){
            System.out.println("\n select operations to perform:\n Enter 1 to push new value.\n Enter 2 to pop a value.\n enter 3 to DISPLAY the stack . \n enter 5 to exit .\n choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if(top==size-1){
                        System.out.println("\n stack is full");
                    }else{
                        System.out.println("enter value to push:");
                        value  =sc.nextInt();
                        top++;
                        stack[top]=value;
                    }
                    break;
                case 2:
                    if(top==-1){
                        System.out.println("stack is empty");
                    }else{
                        System.out.println("element deleted:");
                        top--;
                    }
                    break;
                case 3:
                    if(top==-1){
                    System.out.println("stack is full");
                    }
                    else{
                        for(int i=top;i>=0;i--){
                            System.out.println(stack[i]);

                        }
                    }
                    break;
                case 4:
                    if(top==-1){
                        System.out.println("stack is empty");
                    else{
                        
                    }
            case 4:
                System.out.println("Exit");
                return;
            default:
                System.out.println("Invalid choice: ");
            }
        }
    }
}