  public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        inorderHelper(root,list);
        return list;
    }
    
        public void inorderHelper(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        if(root.left!=null)
            inorderHelper(root.left,list);
        list.add(root.val);
        if(root.right!=null)
            inorderHelper(root.right,list);
    }