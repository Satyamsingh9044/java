import java.util.*;

public class SetMatrixZero {

    public void setZeroes(int[][] matrix) {
        boolean firstrowhaszero = false;
        boolean firstcolhaszero = false;
        int row = matrix.length;
        int col = matrix[0].length;

        for (int j = 0; j < col; j++) {
            if (matrix[0][j] == 0) {
                firstrowhaszero = true;
                break;
            }
        }

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstcolhaszero = true;
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstrowhaszero) {
            for (int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstcolhaszero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // MAIN METHOD TO TEST IN VS CODE
    public static void main(String[] args) {
        SetMatrixZero sol = new SetMatrixZero();

        int[][] matrix = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        System.out.println("Before:");
        printMatrix(matrix);

        sol.setZeroes(matrix);

        System.out.println("\nAfter:");
        printMatrix(matrix);
    }

    // Helper method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
