public class matrix_opertion {
    public static void main(String[] args) {
    int[][] matrixA={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] matrixB={
        {9,8,7},
        {11,4,2},
        {3,2,1}       
    };

    int rows = matrixA.length;
    int cols=matrixB[0].length;

    int[][] sumofmatrix =  new int[rows][cols];
    int[][] subtractionofmatrix = new int[rows][cols];
    int[][] mutliplicationofmatrix = new int[rows][cols];
    
    for(int i=0;i<rows;i++){
        for (int j=0;j<cols;j++){
            sumofmatrix[i][j]=matrixA[i][j] +matrixB[i][j];
        }
    }
System.out.println("Sum of two matrix:");
    for(int i =0;i<rows;i++){
        for(int j =0;j<cols;j++){
            System.out.print(sumofmatrix[i][j] +" ");  
        }
        System.out.println( );
    }
    System.out.println("subtracction of two matrix:");
    for (int i =0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(subtractionofmatrix[i][j]+" ");
        }
        System.out.println( );
    }
    System.out.println("multiplication of two matrix:");
    for (int i =0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(mutliplicationofmatrix[i][j]+" ");
        }
        System.out.println( );
    }
}
}