    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int leftdepth = minDepth(root.left);
        int rightdepth = minDepth(root.right);
        if(leftdepth==0)
            return rightdepth+1;
        if(rightdepth==0)
            return leftdepth+1;
        return Math.min(leftdepth,rightdepth)+1;
    }
    
