// wap to take 2d array and print the row major order and the column major order..
//  using matrix try to write the patterns

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int rows = sc.nextInt();
        System.out.println("enter cols:");
        int cols= sc.nextInt();
        
        System.out.println("take input array:");
        int [][] arr=new int[rows][cols];
        for (int i = 0;i<rows;i++ ){
            for(int j =0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Row major order:");
        for (int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
        System.out.println("column major order:");
        for(int j =0;j<cols;j++){
            for(int i=0;i<rows;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        }
    }

