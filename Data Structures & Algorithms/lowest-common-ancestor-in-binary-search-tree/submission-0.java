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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode p_node = lowestCommonAncestor(root.left, p, q);
        TreeNode q_node = lowestCommonAncestor(root.right, p, q);

        if(p_node!=null && q_node!=null) return root;
        if(q_node==null) return p_node;
        return q_node;
    }
}
