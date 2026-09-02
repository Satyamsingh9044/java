public class matrix{
    public static void main(String[] args){
        int [][] matrix={
            {1,1,0},
            {1,1,0},
            {0,0,1}
        };
        int row=1;
        int col=1;
        int direction[][]={
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        int count=0;
        for(int [] dir:direction){
           int nextRow=row+dir[0];
           int nextCol=col+dir[1];
           if(matrix[nextRow][nextCol]==1) count++;
        }
        System.out.println(count);
    }
}