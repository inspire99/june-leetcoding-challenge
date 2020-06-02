package com.leetcode.june.day1;



  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        root = invert(root);
        return root;
    }

    TreeNode invert(TreeNode node){
        if(node==null){
            return node;
        }

        TreeNode right = invert(node.right);
        TreeNode left = invert(node.left);

        node.left = right;
        node.right = left;

        return node;

    }
}
