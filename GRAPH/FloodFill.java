import java.util.*;
public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orgcol = image[sr][sc];

        // If old color and new color are same,
        // no need to do anything.
        if (orgcol == color) {
            return image;
        }

        helper(image, sr, sc, color, orgcol);

        return image;
    }

    private static void helper(int[][] image, int sr, int sc,
                               int color, int orgcol) {

        // Boundary + different color check
        if (sr < 0 || sc < 0 ||
            sr >= image.length || sc >= image[0].length ||
            image[sr][sc] != orgcol) {
            return;
        }

        // Change color
        image[sr][sc] = color;

        // Left
        helper(image, sr, sc - 1, color, orgcol);

        // Right
        helper(image, sr, sc + 1, color, orgcol);

        // Up
        helper(image, sr - 1, sc, color, orgcol);

        // Down
        helper(image, sr + 1, sc, color, orgcol);
    }

    public static void main(String[] args) {

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] result = floodFill(image, sr, sc, color);

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}

