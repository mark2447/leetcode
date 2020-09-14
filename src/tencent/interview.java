package tencent;


//实现一个生产者消费者demo, 生产者线程生成随机整数，消费者线程获得这个随机整数并判断是否为偶数
//生产和消费的速率可能不相同，生产出的随机数需要一个 buffer 进行缓存
//1. 。比如给定一个二叉树，请从根结点开始，按照前序遍历的顺序打印所有的节点，每次打印完一个子树后再打印一次它的父节点：
//
//    2
//   / \
//  3   4
// /\    \
//5  6    7
//
//打印的结果是 2 3 5 3 6 3 2 4 7 4 2
//
//
//再比如：
//
//     1
//    /
//   2
//
//输出的就是 1 2 1
//
//再比如：
//
//     1
//    / \
//   2  3
//      /\
//     4  5
//输出就是 1 2 1 3 4 3 5 3 1
//
//2. 假设这是一颗二叉搜索树（左边的子树的数字都比根结点小，右边的子树的数据都比根节点大），能否根据遍历后的打印结果，将这棵树建起来。
//
//比如打印的结果是：3 1 2 1 3 6 5 6 7 6 3 那么这棵树就应该是：
//
//       3
//     /  \
//    1     6
//     \   / \
//      2 5   7

import laicode.kth;

public class interview {
    public class TreeNode {
        private int value;
        TreeNode left;
        TreeNode right;
        TreeNode (int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public void preVisit(TreeNode node) {
        if (node == null) {
            return;
        }
        preVisit(node.left);
        preVisit(node.right);
        System.out.println(node.value);
    }
}
