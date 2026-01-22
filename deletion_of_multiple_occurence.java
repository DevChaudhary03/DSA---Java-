import java.util.Scanner;
public class deletion_of_multiple_occurence {
    public static void main(String[] args) {
        int []arr = {1,2,3,2,4,5,2};
        int element= 2;  

        int [] newarr = new int[arr.length];
        int index = 0 ;

        for (int i =0;i<arr.length;i++){
            if ( arr[i] != element){
                newarr[index] =arr[i];
                index++;
            }
        }
        System.out.print("array after remove occurence Elements:");
        for (int i =0;i<index;i++){
            System.out.print(newarr[i]+" ");
        }
        
        
        
    }
}

