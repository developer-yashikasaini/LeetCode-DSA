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
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> result= new ArrayList<Integer>();
      
      rightview(root,result,0);
      return result;  
    }
    public void rightview(TreeNode cur, List<Integer> result , int curdepth){
        if(cur==null) return;
        if(curdepth==result.size()){
            result.add(cur.val);
        }
        rightview(cur.right,result,curdepth+1);
        rightview(cur.left,result,curdepth+1);
    }
}