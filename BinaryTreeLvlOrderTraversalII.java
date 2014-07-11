    //http://blog.csdn.net/likecool21/article/details/24289447
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<TreeNode>> result = new ArrayList<List<TreeNode>>();  
        List<List<Integer>> trueResult = new ArrayList<List<Integer>>();  
        if(root == null)  
            return trueResult;  
          
        ArrayList<TreeNode> current = new ArrayList<TreeNode>();  
        current.add(root);  
  
        while(current.size() > 0){  
            //add the previous level into the final result  
            result.add(current);  
              
            ArrayList<TreeNode> parent = current;  
            current = new ArrayList<TreeNode>();  
              
            for(TreeNode node: parent){  
                if(node.left != null)  
                    current.add(node.left);  
                if(node.right != null)  
                    current.add(node.right);  
            }  
             
        }  
        
        int len = result.size();
        for(int i = len-1;i>=0;i--){
            ArrayList<Integer> intArr = new ArrayList<Integer>();
            for(TreeNode node:result.get(i)){
                intArr.add(node.val);
            }
            trueResult.add(intArr);
        }
        return trueResult;  
    } 