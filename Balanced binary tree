    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftdepth = maxDepth(root.left);
        if(leftdepth==-1){
            return -1;
        }
        int rightdepth = maxDepth(root.right);
        if(rightdepth==-1){
            return -1;
        }
        if(Math.abs(leftdepth-rightdepth)>1)
            return -1;
        return Math.max(leftdepth,rightdepth)+1;
        
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(maxDepth(root)==-1){
            return false;
        }
        return true;
    }

    //better solution
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
 
        if (getHeight(root) == -1)
            return false;
 
        return true;
    }
 
    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
 
        int left = getHeight(root.left);
        int right = getHeight(root.right);
 
        if (left == -1 || right == -1)
            return -1;
 
        if (Math.abs(left - right) > 1) {
            return -1;
        }
 
        return Math.max(left, right) + 1;
 
    }