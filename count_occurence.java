import java.util.Scanner;
public class count_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int size = sc.nextInt();
        int[]arr=new int [size];
        for (int i =0;i<size;i++){
            System.out.println("enter the element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target to count occurence:");
        int target=sc.nextInt();
        int count=0;
        for (int i=0;i<size;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count==0){
            System.out.println("element is not found");
        }else{
            System.out.println("Element found "+count+" timess..");
        }
        }
    }
    

