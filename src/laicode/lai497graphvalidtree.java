package laicode;

public class lai497graphvalidtree {
    public boolean validTree(int n, int[][] edges) {
        // Write your solution here
        int[] root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int r1 = find(root, edges[i][0]);
            int r2 = find(root, edges[i][1]);
            if (r1 != r2) {
                root[r1] = r2;
                n--;
                System.out.println(n);
            }
        }
        return n == 1 ? true : false;
    }
    private int find (int[] root, int key) {
        while (root[key] != key) {
            key = root[key];
        }
        return key;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1},{0,2},{1,2},{2,3},{2,4}};
        lai497graphvalidtree s = new lai497graphvalidtree();
        boolean res = s.validTree(5, matrix);
//        System.out.println(res);
    }
}
