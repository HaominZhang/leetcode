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
    
    //better solution
    public int maxDepth(TreeNode root){
        return root==null?0:1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
