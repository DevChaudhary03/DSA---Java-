import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.println("Enter the element to find the in array:");
        int ele =sc.nextInt();
        boolean found = false;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==ele){
                System.out.println(ele+"fount at index"+i);
                found = true;
                break; 
            }
        //     else{
        //         System.out.println(ele+"not found in this array");
        //     }
        }
        if(found == false){
            System.out.println("Not found.");
        }
    }
    
}
