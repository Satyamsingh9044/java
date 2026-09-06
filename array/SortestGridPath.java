// lc-1293 Shortest path in grid with obstacle elimination

// 2. Main concept
// BFS + State + Visited
// Because every move costs exactly 1 step, this is an unweighted shortest-path problem


// 3.But normal BFS is not enough.
// Why?
// Because reaching the same cell with different remaining k values represents different states.
// For example:
// (2,3,5)
// (2,3,2)
// Both are at (2,3), but the first state is better because it has 5 obstacles remaining.
// Therefore:
// State = (row, col, remainingK)

// 4. Most important concept 
// Instead of:
// boolean[][] visited;
// we need:
// boolean[][][] visited;
// Because:
// visited[row][col][remainingK]
// means:
// "Have I already reached this cell with this many obstacle eliminations remaining?"
// Remember:
// Position + remaining resource = State


// 5.Since every movement has equal cost, I use BFS to find the shortest path. However,
//  simply marking a cell as visited is not sufficient because reaching the same cell with
//   different numbers of remaining obstacle eliminations represents different states.
//   Therefore, I define the state as (row, column, remainingK) and use a 3D visited array.
//    For each neighboring cell, if it is empty, the remaining k stays the same; if it is an obstacle, 
//    I decrease k by one, provided k is greater than zero. I also store the current distance in the queue, 
//    so I can use a single BFS loop.

// Our state is:
// (row, col, remainingK)
// There are at most:
// m × n × (k + 1)
// different states.
// For every state, we check 4 directions, which is constant.
// Therefore:
// O(m × n × k × 4)
// = O(m × n × k)
// Time = O(m × n × k)
// Space = O(m × n × k)
// Because of:
// boolean[][][] visited = new boolean[m][n][k + 1];
// which requires:
// m × n × (k + 1)


import java.util.*;
class SortestGridPath {

    public int shortestPath(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        boolean[][][] visited = new boolean[m][n][k + 1];

        // {row, col, remaining obstacles, steps}
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, k, 0});
        visited[0][0][k] = true;

        int[][] directions = {
            {-1, 0},
            {0, -1},
            {1, 0},
            {0, 1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int row = current[0];
            int col = current[1];
            int remaining = current[2];
            int steps = current[3];

            // Destination
            if (row == m - 1 && col == n - 1) {
                return steps;
            }

            for (int[] dir : directions) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow < 0 || newRow >= m ||
                    newCol < 0 || newCol >= n) {
                    continue;
                }

                // Empty cell
                if (grid[newRow][newCol] == 0 &&
                    !visited[newRow][newCol][remaining]) {

                    visited[newRow][newCol][remaining] = true;

                    queue.offer(new int[]{
                        newRow, newCol, remaining, steps + 1
                    });
                }

                // Obstacle
                else if (grid[newRow][newCol] == 1 &&
                         remaining > 0 &&
                         !visited[newRow][newCol][remaining - 1]) {

                    visited[newRow][newCol][remaining - 1] = true;

                    queue.offer(new int[]{
                        newRow, newCol, remaining - 1, steps + 1
                    });
                }
            }
        }

        return -1;
    }
}
