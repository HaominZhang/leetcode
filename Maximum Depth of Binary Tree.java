public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        int leftdepth = maxDepth(root.left);
        int rightdepth = maxDepth(root.right);
        
        if(leftdepth>=rightdepth){
            leftdepth++;
        }else{
            rightdepth++;
        }
        return leftdepth>rightdepth?leftdepth:rightdepth;
    }
}