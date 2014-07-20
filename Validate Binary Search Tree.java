http://www.programcreek.com/2012/12/leetcode-validate-binary-search-tree-java/
public boolean isValidBST(TreeNode root) {
        return validBSTHelper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    
    public static boolean validBSTHelper(TreeNode root, int max, int min){
        if(root==null)
            return true;
        if(root.val<=min||root.val>=max)
            return false;
        return validBSTHelper(root.left,root.val,min)&&validBSTHelper(root.right,max,root.val);
    }