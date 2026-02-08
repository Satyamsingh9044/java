public class WordSearch {

    public static void main(String[] args) {

        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "SEE";

        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (board[i][j] == word.charAt(0)) {

                    if (dfs(board, word, i, j, 0))
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int idx) {

        if (idx == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return false;

        if (board[i][j] != word.charAt(idx))
            return false;

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, idx + 1) ||
                        dfs(board, word, i - 1, j, idx + 1) ||
                        dfs(board, word, i, j + 1, idx + 1) ||
                        dfs(board, word, i, j - 1, idx + 1);

        board[i][j] = temp;

        return found;
    }
}
