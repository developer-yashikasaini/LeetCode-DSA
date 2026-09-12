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
    public List<String> result= new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(new StringBuilder(), root);
        return result;
    }
    private void helper(StringBuilder path, TreeNode root){
        if(root==null) return;
        int len=path.length();
        if(len!=0){ path.append("->");}
        path.append(root.val);
        if(root.left==null && root.right==null){
            result.add(path.toString());
        } else{
            helper(path,root.left);
            helper(path,root.right);
        } path.setLength(len);
    }
}