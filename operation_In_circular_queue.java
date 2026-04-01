import java.util.Scanner;

public class operation_In_circular_queue {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cQ[] = new int[4];
        int size = cQ.length;
        int f = -1;
        int r = -1;
        while(true){
            if (((r + 1) % size == f)) {
                System.out.println("Queue Overflow");
                break;
            } else if (f == -1) {
                f = 0;
                r = 0;
            } else if ((r == size - 1) && (f != 0)) {
                r = 0;
            } else {
                r = (r + 1) % size;
            }
            System.out.println("Enter value:");
            cQ[r] = sc.nextInt();
            System.out.println("Element inserted: "+ cQ[r]);
        }
        
        System.out.println("Queue elements:");
        int i = f;
        while(true){
            System.out.println(cQ[i]);
            
            if(i == r){
                break;
            }
            i = (i+1)%size;
        }
        
    }    
    
}



// public class operation_In_circular_queue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =5;
//         int[]circularqueue=new int[n];
//         int front = -1 ;
//         int rear = -1;
//         int choice;
//         do{
//             System.out.println("1- perform the enqueue oepration :");
//             System.out.println("3- display the element in the queue :");
//             choice = sc.nextInt();
//             switch(choice){
//                 case 1:
//                     if((rear+1)%n==front){
//                         System.out.println("the queue is full");
//                     }else{
//                         System.out.println("enter the element in the queue:");
//                         int element = sc.nextInt();
//                         rear = (rear+1)%n;
//                         circularqueue[rear]=element;
//                         if(front ==-1){
//                             front=0;

//                         }
//                     }
//                     break;
//             };
        

//     }
// }



// check for circular queue is full or not : (rear+1)%n==front
// insert one element and display it 
// insert elements to size of queue and display all elment 