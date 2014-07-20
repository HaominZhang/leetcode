public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
         ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();  
        ArrayList<ArrayList<Integer>> trueResult = new ArrayList<ArrayList<Integer>>();
        int level=1;
        if(root == null)  
            return trueResult;  
          
        ArrayList<TreeNode> current = new ArrayList<TreeNode>();  
        current.add(root);  
  
        while(current.size() > 0){  
            result.add(current);  
               
            ArrayList<TreeNode> parent = current;  
            current = new ArrayList<TreeNode>();  
            for(int i=parent.size()-1;i>=0;i--){  
                TreeNode node= parent.get(i);
                if(level%2==1){
                    if(node.right != null)  
                        current.add(node.right); 
                    if(node.left != null)  
                        current.add(node.left);
                }else{
                    if(node.left != null)  
                        current.add(node.left);
                    if(node.right != null)  
                        current.add(node.right);
                }
            }  
            level++;
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