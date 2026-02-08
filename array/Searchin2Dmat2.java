public class Searchin2Dmat2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n= matrix[0].length;
        int row=0;
        int col=n-1;
        while(col>=0 && row<m){
            if(target==matrix[row][col]){
                return true;
            }else if(target>matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target=5;
        int matrix[][]={
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24}
        };
        System.out.println(searchMatrix(matrix,target));
    }
}
