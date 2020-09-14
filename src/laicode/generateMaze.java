package laicode;

import java.util.Arrays;

public class generateMaze {
    public int[][] maze(int n) {
        // Write your solution here.
        //time complexity:
        //space complexity: O(n^2)
        //initialize
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    res[i][j] = 0;
                } else {
                    res[i][j] = 1;
                }
            }
        }
        generate(res, 0, 0);
        return res;
    }
    private void generate(int[][] res, int x, int y) {
        Dir[] dir = Dir.values();
        shuffle(dir);
        for (Dir d : dir) {
            int newX = d.moveX(x,2);
            int newY = d.moveY(y,2);
            if (isValidWall(res, newX, newY)) {
                res[d.moveX(x,1)][d.moveY(y,1)] = 0;
                res[newX][newY] = 0;
                generate(res, newX, newY);
            }
        }
    }

    private void shuffle (Dir[] dir) {
        for (int i = 0; i < dir.length; i++) {
            int index = (int)Math.random() * (dir.length - i);
            Dir tmp = dir[i];
            dir[i] = dir[i+index];
            dir[i+index] = tmp;
        }
    }

    private boolean isValidWall(int[][] res, int x, int y) {
        if (x >=0 && x < res.length && y >= 0 && y<res.length && res[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        generateMaze g = new generateMaze();
        int[][] res = g.maze(11);
        for (int[] a : res) {
            System.out.println(Arrays.toString(a));
//            System.out.println("/n");
        }
    }


    enum Dir{
        North(0, 1), South(0, -1), West(-1, 0), East(1,0);
        int Dx;
        int Dy;
        Dir(int Dx, int Dy) {
            this.Dx = Dx;
            this.Dy = Dy;
        }

        public int moveX(int x, int times) {
            return x + times*Dx;
        }
        public int moveY(int y, int times) {
            return y + times*Dy;
        }
    }
}
