    public void pathSumHelper(TreeNode root, int sum, List <Integer> sumlist, List<List<Integer>> returnlist){
        if(root==null) return;
        sumlist.add(root.val);
        sum = sum-root.val;
        if(root.left==null && root.right==null){
            if(sum==0){
                returnlist.add(new ArrayList<Integer>(sumlist));
            }
        }else{
            if(root.left!=null)
                pathSumHelper(root.left,sum,sumlist,returnlist);
            if(root.right!=null)
                pathSumHelper(root.right,sum,sumlist,returnlist);
        }
        sumlist.remove(list.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> pathlist=new ArrayList<List<Integer>>();
        List<Integer> sumlist = new ArrayList<Integer>();
        pathSumHelper(root,sum,sumlist,pathlist);
        return pathlist;
    }