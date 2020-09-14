package laicode;

public class laicode525 {
    public int numIslands(char[][] grid) {
        // Write your solution here
        char[][] g = grid;//防止对原图进行修改;
        int count = 0;
        int row = grid.length;
        int column = grid[0].length;
        if (row == 0) {
            return 0;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (g[i][j] == '1') {
                    dfs(i,j,g);
                    ++count;
                }
            }
        }
        return count;
    }
    private void dfs(int i, int j, char[][] g) {
        //base case: 思考什么时候会停呢？
        //就是说一定要连续的1都算进去，所以我们就关注边界情况就行
        if (i < 0 || j < 0|| i >= g.length || j >= g[0].length || g[i][j] != '1') {
            return;
        }
        g[i][j] = '0';
        dfs(i+1,j,g);
        dfs(i-1,j,g);
        dfs(i,j+1,g);
        dfs(i,j-1,g);
    }

    public static void main(String[] args) {
        char[][] grid = new char[3][5];
        grid[0] = new char[]{'1', '1', '1', '1', '1'};
        grid[1] = new char[]{'1','0','1','0','1'};
        grid[2] = new char[]{'1', '1', '1', '1', '1'};
        laicode525 lc = new laicode525();
        int res = lc.numIslands(grid);
        System.out.println(res);
    }
}
