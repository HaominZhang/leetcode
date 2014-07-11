    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {  
        ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();  
        ArrayList<ArrayList<Integer>> trueResult = new ArrayList<ArrayList<Integer>>();  
        if(root == null)  
            return trueResult;  
          
        ArrayList<TreeNode> current = new ArrayList<TreeNode>();  
        current.add(root);  
  
        while(current.size() > 0){  
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
          
        for(ArrayList<TreeNode> nodeArr : result){  
            ArrayList<Integer> intArr = new ArrayList<Integer>();  
            for(TreeNode node : nodeArr){  
                intArr.add(node.val);  
            }  
            trueResult.add(intArr);  
        }  
        return trueResult;  
    }  