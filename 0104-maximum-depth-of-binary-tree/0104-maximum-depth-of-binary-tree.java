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
class Solution {
    public int maxDepth(TreeNode root) {
        return findDepth(root, 0);
    }
    public static int findDepth(TreeNode root, int curdepth){
        if (root==null) return curdepth;
        return Math.max(findDepth(root.left,curdepth +1),findDepth(root.right, curdepth+1));
    }
}