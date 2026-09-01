import  java.util.*;
class DiagonalTraverse {
    public static  int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i + j, new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        boolean flip = true;
        for (int k = 0; k <= m + n - 2; k++) {
            List<Integer> diagonal = map.get(k);
            if (diagonal == null)
                continue;
            if (flip) {
                Collections.reverse(diagonal);
            }
            result.addAll(diagonal);
            flip = !flip;
        }
        int ans[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                         {7, 8, 9} };
                         int ans[]=findDiagonalOrder(mat);
                         for(int i=0;i<ans.length;i++){
                            System.out.print(ans[i]+" ");
                         }
    }
}