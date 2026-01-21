import java.util.Scanner;
public class count_postive_negative_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int zeros=0;
        int positive=0;
        int negatives=0;
        int []arr= new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter the element:");
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                positive++;
            }else if(arr[i]<0){
                negatives++;

            }else{
                zeros++;
            }
            }
            System.out.println("zeroes;"+zeros+"\npostive count:"+positive+"\nnegative count:"+negatives);
        }
    }

