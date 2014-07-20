 public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        postorderHelper(root,list);
        return list;
    }
    public void postorderHelper(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        if(root.left!=null)
            postorderHelper(root.left,list);
        if(root.right!=null)
            postorderHelper(root.right,list);
        list.add(root.val);
    }