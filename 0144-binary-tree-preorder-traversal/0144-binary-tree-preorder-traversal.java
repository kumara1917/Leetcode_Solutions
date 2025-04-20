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
    List<Integer> tree=new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return tree;
    }
    public int preorder(TreeNode root){
        if  (root==null) return 0;
        tree.add(root.val);
        preorder(root.left);
        preorder(root.right);
        return 0;

    }
}