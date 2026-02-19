//  take 2d array as input from the user.. adn find the usm of the upper diagonal..
import java.util.Scanner;

public class UpperDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
