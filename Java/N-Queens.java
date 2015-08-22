public class Solution {
    public List<String> drawmap(char[][] map, int n) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < n; i ++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < n; j ++) {
                sb.append(map[i][j]);
            }
            res.add(sb.toString());
        }
        return res;
    }
    public void helper(List<List<String>> res, char[][] map, int[][] vis,int pos, int n) {
        if (pos == n) {
            res.add(drawmap(map, n));
            return;
        }
        for (int i = 0; i < n; i ++) {
            if (vis[0][i] == 0 && vis[1][i - pos + n] == 0 && vis[2][pos + i] == 0) {
                map[pos][i] = 'Q';
                vis[0][i] = vis[1][i - pos + n] = vis[2][pos + i] = 1;
                helper(res, map, vis, pos + 1, n);
                vis[0][i] = vis[1][i - pos + n] = vis[2][pos + i] = 0;
                map[pos][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        int[][] vis = new int[3][30];
        char[][] map = new char[n][n];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                map[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        helper(res, map, vis, 0, n);
        return res;
    }
}