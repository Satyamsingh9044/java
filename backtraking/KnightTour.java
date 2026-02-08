public class KnightTour { //lc-2596
    public static  boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        int r=0,c=0,expValue=0;
        return isValid(grid,r,c,n,expValue);
    }
    public static boolean isValid(int[][]grid,int r,int c,int n,int expValue){
        if(r<0||c<0||r>=n||c>=n||grid[r][c]!=expValue){
            return false;
        }
        if(expValue==n*n-1){
            return true;
        }
        boolean ans1=isValid(grid,r-2,c+1,n,expValue+1);
        boolean ans2=isValid(grid,r-1,c+2,n,expValue+1);
        boolean ans3=isValid(grid,r+1,c+2,n,expValue+1);
        boolean ans4=isValid(grid,r+2,c+1,n,expValue+1);
        boolean ans5=isValid(grid,r+2,c-1,n,expValue+1);
        boolean ans6=isValid(grid,r+1,c-2,n,expValue+1);
        boolean ans7=isValid(grid,r-1,c-2,n,expValue+1);
        boolean ans8=isValid(grid,r-2,c-1,n,expValue+1);
        return ans1||ans2||ans3||ans4||ans5||ans6||ans7||ans8;
    }
    public static void main(String[] args) {
        int[][] grid={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));
    }
}