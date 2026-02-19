public class matrix_operation {
    public static void main(String[] args) {

        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {11, 4, 2},
            {3, 2, 1}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;

        int[][] sum = new int[rows][cols];
        int[][] sub = new int[rows][cols];
        int[][] mul = new int[rows][cols];

        //  Addition &  Subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
                sub[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        //  Multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    mul[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Printing results
        System.out.println("Sum of matrix:");
        printMatrix(sum);

        System.out.println("Subtraction of matrix:");
        printMatrix(sub);

        System.out.println("Multiplication of matrix:");
        printMatrix(mul);

        //  Transpose
        System.out.println("Transpose of Matrix A:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        // 🔢 Sum of Diagonal
        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            diagonalSum += matrixA[i][i];
        }
        System.out.println("Sum of diagonal elements: " + diagonalSum);
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
