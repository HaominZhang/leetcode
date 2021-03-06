 //http://blog.csdn.net/linhuanmars/article/details/19957455
 public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        int count=0;
        ListNode pre = newhead;
        ListNode cur = head;
        while(cur!=null){
            count++;
            ListNode next= cur.next;
            if(count==k){
                pre = reverse(pre,next);
                count=0;
            }
            cur = next;
        }
        return newhead.next;
    }
    
    public static ListNode reverse(ListNode pre, ListNode end){
        if(pre==null||pre.next==null)
            return pre;
        ListNode head = pre.next;
        ListNode cur = pre.next.next;
        while(cur!=end)  
        {  
            ListNode next = cur.next;  
            cur.next = pre.next;  
            pre.next = cur;  
            cur = next;  
        }  
        head.next = end;  
        return head; 
    }