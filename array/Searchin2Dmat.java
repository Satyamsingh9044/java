class Searchin2Dmat {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int sr = 0;
        int er = m - 1;
        while (sr <= er) {
            int midRow = sr + (er - sr) / 2;
            if (target >= matrix[midRow][0] && target <= matrix[midRow][n - 1]) {
                return searchInrow(matrix, target, midRow);
            } else if (target > matrix[midRow][n - 1]) {
                sr = midRow + 1;
            } else {
                er = midRow - 1;
            }
        }
        return false;
    }

    private static  boolean searchInrow(int matrix[][], int target, int row) {
        int n = matrix[0].length;
        int sc = 0;
        int ec = n - 1;
        while (sc <= ec) {
            int mid = sc + (ec - sc) / 2;
            if (target == matrix[row][mid]) {
                return true;
            }else if(target>matrix[row][mid]){
                sc=mid+1;
            }else{
                ec=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target=34;
        int[][] matrix = {
              {1, 3, 5, 7},
              {10, 11, 16, 20},
              {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix,target));

    }
}