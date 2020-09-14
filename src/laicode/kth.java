package laicode;

import java.util.ArrayList;
import java.util.List;

public class kth {
    public class TreeNode {
        private int key;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int key, TreeNode left, TreeNode right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    public int findKth(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        int num = res.get(res.size() - k);
        return num;
    }
    public void inOrder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inOrder(root.left, res);
        res.add(root.key);
        inOrder(root.right, res);
    }
}
