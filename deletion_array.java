// to perform like a program deletion operation of an array 
import java.util.Scanner;
public class deletion_array {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]arr = {1,2,3,4,5};
    int n =arr.length;
    int del = sc.nextInt();
    // seraching the element
    int index=-1;
    for (int i=0;i<n;i++){
        if(arr[i]==del){
            index = i ;
            break;
        }
    }
    // delete the element :
    for (int i =index;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    // after deletion the array:
    System.out.println("array after deletion:");
    for (int i =0;i<n-1;i++){
        System.out.print(arr[i]+" ");

    }
   } 
}




