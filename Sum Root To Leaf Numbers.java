        public static void pathSumHelper(TreeNode root, String str, List <String> sumlist){
        if(root==null) return;
        str+=root.val;
        if(root.left==null && root.right==null){
                sumlist.add(new String(str));
        }else{
            if(root.left!=null)
                pathSumHelper(root.left,str,sumlist);
            if(root.right!=null)
                pathSumHelper(root.right,str,sumlist);
        }
        str = str.substring(0,str.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        String sumstr = "";
        List<String> result = new ArrayList<String>();
        pathSumHelper(root,sumstr,result);
        int sum=0;
        for(String s:result){
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    //better solution
     public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return sumR(root, 0);
    }
    public int sumR(TreeNode root, int x) {
        if (root.right == null && root.left == null)
            return 10 * x + root.val;
        int val = 0;
        if (root.left != null)
            val += sumR(root.left, 10 * x + root.val);
        if (root.right != null)
            val += sumR(root.right, 10 * x + root.val);
        return val;
    }