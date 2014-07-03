     public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if((p==null&&q!=null)||(p!=null&&q==null)||(p.val!=q.val)){
            return false;
        }

        if(isSameTree(p.left,q.right)==true&&isSameTree(p.right,q.left)){
            return true;
        }
        return false;
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null&&root.right==null){
            return true;
        }
        if((root.left==null&&root.right!=null)||(root.left!=null&&root.right==null)){
            return false;
        }
        
        if(isSameTree(root.left,root.right)){
            return true;
        }
        return false;
    }

    //better solution
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;  // only one has node in a tree and b tree
        if (a.val != b.val) return false;
        return helper(a.left, b.right) && helper(a.right, b.left); // a goes in in-order traversal, b goes right first then left.
    }