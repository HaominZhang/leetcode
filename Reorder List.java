 //http://codeganker.blogspot.com/2014/03/reorder-list-leetcode.html
 public void reorderList(ListNode head) {
        if(head==null||head.next==null)
            return;
        ListNode slower = head, faster = head;
        while(faster.next!=null&&faster.next.next!=null){
            slower = slower.next;
            faster = faster.next.next;
        }
        ListNode head1 = head;
        ListNode head2 = slower.next;
        slower.next = null;
        head2 = reverse(head2);
        while(head1!=null&head2!=null){
            ListNode next = head2.next;
            head2.next = head1.next;
            head1.next = head2;
            head1 = head2.next;
            head2 = next;
        }
    }
    
    public static ListNode reverse(ListNode head)
    {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }