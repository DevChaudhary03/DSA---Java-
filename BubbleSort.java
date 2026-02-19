

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count[] = new int[max+1];
        
        int comp = 0;
        
        for(int i = 0; i < n-1; i++){
            int swap = 0;
            
            for(int j = 0; j < n-i-1; j++){
                comp++;
                int first = arr[j];
                int second = arr[j+1];
                
                if(first > second){
                    count[first]++;
                    count[second]++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            
            System.out.println("No. of swaps in pass " + (i+1) + " : " + swap);
            
            if(swap == 0){
                break;
            }
        }
        
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nNo. of comparisons: " + comp);
        System.out.println("no. of swap of each number:");
        for(int i =0 ; i < n; i++){
            for(int j = 1; j < count.length; j++){
                if(arr[i] == j){
                    System.out.println(arr[i]+ " = "+count[j]);
                }
            }
        }
    }
}