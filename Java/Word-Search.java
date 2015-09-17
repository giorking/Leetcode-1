public class Solution {
    public static int dx[] = {1, -1, 0, 0};
    public static int dy[] = {0, 0, 1, -1};
    public boolean helper(char[][] board, int[][] arr, String word, int x, int y, int pos) {
        if (pos == word.length()) return true;
        for (int i = 0; i < 4; i ++) {
            int x1 = dx[i] + x;
            int y1 = dy[i] + y;
            if (x1 >= 0 && x1 < board.length && y1 >= 0 && y1 < board[0].length
                    && arr[x1][y1] == 0 && board[x1][y1] == word.charAt(pos)) {
                arr[x1][y1] = 1;
                if (helper(board, arr, word, x1, y1, pos + 1)) return true;
                arr[x1][y1] = 0;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int lenx = board.length;
        if (lenx == 0 || word.length() == 0) return false;
        int leny = board[0].length;
        int[][] arr = new int[lenx][leny];
        for (int i = 0; i < lenx; i ++) {
            for (int j = 0; j < leny; j ++) {
                if (board[i][j] == word.charAt(0)) {
                    arr[i][j] = 1;
                    if (helper(board, arr, word, i, j, 1)) return true;
                    arr[i][j] = 0;
                }
            }
        }
        return false;
    }
}
