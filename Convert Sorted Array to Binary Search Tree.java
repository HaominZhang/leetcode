 public TreeNode BSTHelper(int[] num, int low, int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode left =BSTHelper(num,low,mid-1);
        TreeNode right = BSTHelper(num,mid+1,high);
        TreeNode root = new TreeNode(num[mid]);
        root.left = left;
        root.right = right;
        return root;
    }
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length==0) return null;
        TreeNode head = BSTHelper(num,0,num.length-1);
        return head;
    }