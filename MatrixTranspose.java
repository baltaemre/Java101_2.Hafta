public class MatrixTranspose {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix){
        int row = matrix.length, column = matrix[0].length ;
        int[][] newMatrix = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int [][] transposeMatrix;

        System.out.println("Matris :");
        printMatrix(matrix);

        transposeMatrix = transpose(matrix);
        System.out.println("Transpoze :");
        printMatrix(transposeMatrix);
    }
}