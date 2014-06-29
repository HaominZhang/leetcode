 public static int sumHelper(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        
        int leftval = sumHelper(root.left,sum-root.val);
        if(leftval==Integer.MAX_VALUE) return Integer.MAX_VALUE;
        int rightval = sumHelper(root.right,sum-root.val);
        if(rightval==Integer.MAX_VALUE) return Integer.MAX_VALUE;
        
        if(leftval==0&&rightval==0&&root.val==sum){
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
        
    }    
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        
        int treesum = sumHelper(root,sum);
        return treesum==Integer.MAX_VALUE?true:false;
        
    }

    //better solution
        public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        sum -= root.val;
        if(root.left == null && root.right==null)  return sum == 0;
        else return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
