 //http://blog.csdn.net/lcore/article/details/8881795
 //http://blog.csdn.net/lcore/article/details/8880475
public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int root_idx=0;
        while(inorder[root_idx]!=root.val){
            root_idx++;
        }
        int[] left_preorder = new int[root_idx];
        for(int i=0;i<root_idx;i++){
            left_preorder[i] = preorder[i+1];
        }
        int[] left_inorder = new int[root_idx];
        for(int i=0;i<root_idx;i++){
            left_inorder[i] = inorder[i];
        }
        root.left = buildTree(left_preorder,left_inorder);
        
        int[] right_preorder = new int[preorder.length-root_idx-1];
        for(int i=0;i<preorder.length-root_idx-1;i++){
            right_preorder[i] = preorder[root_idx+i+1];
        }
        int[] right_inorder = new int[inorder.length-root_idx-1];
        for(int i=0;i<inorder.length-root_idx-1;i++){
            right_inorder[i] = inorder[root_idx+i+1];
        }
        root.right = buildTree(right_preorder,right_inorder);
        return root;
    }