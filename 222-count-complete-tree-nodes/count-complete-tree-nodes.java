/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


//Count No.of Nodes in a Binary Tree
class Solution {
    public int countNodes(TreeNode root) {
       
        if(root ==null) return 0;
        return 1+countNodes(root.left) + countNodes(root.right);
        

        
    }
}