import java.util.Scanner;

public class CqEQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of cQ:");
        int size = sc.nextInt();
        int cQ[] = new int[size];
        int n = cQ.length;
        int f = -1;
        int r = -1;
        // perform Enqueue operation
        while(true){
            if (((r + 1) % n == f)) {
                System.out.println("queue overflow");
                break;
            } else if (f == -1) {
                f = 0;
                r = 0;
            } else if ((r == n - 1) && (f != 0)) {
                r = 0;
            } else {
                r = (r + 1) % n;
            }
            System.out.println("enter value:");
            cQ[r] = sc.nextInt();
            System.out.println("element inserted: "+ cQ[r]);
        }
        System.out.println("queue Elements:");
        for(int i = f; i <= r; i++){
            System.out.println(cQ[i]);
        }
        // performing dequeue operation
        System.err.println("after dequeue operation:");
        while(true){

            if(f == -1 && r == -1){
                System.out.println("dequeue operation is not possible.");
                break;
            }
            else if(f == r){
                System.out.println("element deleted, Now queue is empty");
                f = -1; r = -1;
            }
            else{
                f = (f + 1)% n;
                System.out.println("remaining elements:");
                for(int i = f; i <= r; i++){
                    System.out.println(cQ[i]);
                }
            }
        }
    }

}