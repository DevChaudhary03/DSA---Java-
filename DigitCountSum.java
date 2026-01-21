
// Q-1:

//  public class ArraySum {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 3, 4, 5};
//         int sum = 0;
        
//         for (int num : a) {
//             sum += num;
//         }
//         System.out.println("Sum of array: " + sum);
//     }
// }


// Q-2:

import java.util.Scanner;

public class DigitCountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();   

        int b = a;             
        int count = 0;         
        int sum = 0;            

        while (b != 0) {
            int digit = b % 10;   
            sum = sum + digit;    
            count = count + 1;   
            b = b / 10;           
        }

        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
    }
}
// ---- sum of all the elements of an array 
// ----total number of an elements in an array
// ----find the mid value in an array is odd or a even like eg - 534 so the 3 "mid values is odd or even check it ?"

