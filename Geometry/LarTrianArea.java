//Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area
//of the largest triangle that can be formed by any three different points. 
//lc-812
// Example:
// Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
// Output: 2.00000





class LarTrianArea {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];

                    // Shoelace formula for triangle area:
                    // Area = 1/2 * | x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2) |
                    double area = 0.5 * Math.abs(
                        x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
                    );

                    // Track the maximum area
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}

// Important concept to remember
// For three points:
// (x1,y1)
// (x2,y2)
// (x3,y3)
// Triangle area:
// Area = |x1(y2-y3) + x2(y3-y1) + x3(y1-y2)| / 2

// This is called the determinant/shoelace formula.

// The DSA pattern here is:

// When the problem asks for the best combination of 3 points and constraints are small → try all i < j < k combinations.

// Time complexity:
// O(n³)
// and space:
// O(1)