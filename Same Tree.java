public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if((p==null&&q!=null)||(p!=null&&q==null)||(p.val!=q.val)){
            return false;
        }

        if(isSameTree(p.left,q.left)==true){
            if(isSameTree(p.right,q.right)==true){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }
}