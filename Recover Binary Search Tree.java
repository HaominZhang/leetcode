   //
   private TreeNode fnode = null;
    private TreeNode snode = null;
    private TreeNode lastElement = new TreeNode(Integer.MIN_VALUE); 
    
    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        if (fnode == null && root.val < lastElement.val) {
            fnode = lastElement;
        }
        if (fnode != null && root.val < lastElement.val) {
            snode = root;
        }
        lastElement = root;
        traverse(root.right);
    }
    
    public void recoverTree(TreeNode root) {
        traverse(root);
        int val = fnode.val;
        fnode.val = snode.val;
        snode.val = val;
    }