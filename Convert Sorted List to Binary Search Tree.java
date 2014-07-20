 public TreeNode sortedListToBST(ListNode head) {
     if(head == null)  
            return null;  
        ListNode cur = head;  
        int count = 0;  
        while(cur!=null)  
        {  
            cur = cur.next;  
            count++;  
        }  
        // ArrayList<ListNode> list = new ArrayList<ListNode>();  
        // list.add(head);  
        return helper(head,0,count-1);  
    }  
    private TreeNode helper(ListNode node, int low, int high)  
    {  
        if(low>high)  
            return null;  
        int mid = (low+high)/2;  
        TreeNode left = helper(node,low,mid-1);  
        TreeNode root = new TreeNode(node.val);  
        root.left = left; 
        node = node.next;
        root.right = helper(node,mid+1,high);  
        return root;  
    }