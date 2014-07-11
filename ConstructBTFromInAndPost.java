 //http://blog.csdn.net/lcore/article/details/8881795
 //http://blog.csdn.net/lcore/article/details/8880475
 public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0||inorder.length==0)
            return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int root_idx=postorder.length-1;
        while(inorder[root_idx]!=root.val){
            root_idx--;
        }
        int[] right_postorder = new int[postorder.length-root_idx-1];
        for(int i=0;i<postorder.length-root_idx-1;i++){
            right_postorder[i] = postorder[root_idx+i];
        }
        int[] right_inorder = new int[inorder.length-root_idx-1];
        for(int i=0;i<inorder.length-root_idx-1;i++){
            right_inorder[i] = inorder[root_idx+i+1];
        }
        root.right = buildTree(right_inorder,right_postorder);
        
        int[] left_postorder = new int[root_idx];
        for(int i=0;i<root_idx;i++){
            left_postorder[i] = postorder[i];
        }
        int[] left_inorder = new int[root_idx];
        for(int i=0;i<root_idx;i++){
            left_inorder[i] = inorder[i];
        }
        root.left = buildTree(left_inorder,left_postorder);
        return root;
    }