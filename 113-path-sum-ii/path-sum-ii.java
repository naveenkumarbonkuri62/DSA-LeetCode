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
class Solution{
    public List<List<Integer>> pathSum(TreeNode root,int target){
        if(root==null){
            return ans;
        }
        answer(root,target);
        return ans;
    }
    List<Integer> subAns=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public void answer(TreeNode root,int target){
        if(root==null){
            return;
        }
        subAns.add(root.val);
        if(root.left==null&&root.right==null&&target==root.val){
            ans.add(new ArrayList<>(subAns));
        }
        answer(root.left,target-root.val);
        answer(root.right,target-root.val);
        subAns.remove(subAns.size()-1);
    }
}