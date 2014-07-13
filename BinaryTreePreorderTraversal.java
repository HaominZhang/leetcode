public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        preorderHelper(root,list);
        return list;
    }
    
    public void preorderHelper(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        list.add(root.val);
        if(root.left!=null)
            preorderHelper(root.left,list);
        if(root.right!=null)
            preorderHelper(root.right,list);
    }