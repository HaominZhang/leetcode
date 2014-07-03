    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode first=head,second;
        ListNode next,prev=head;
        
        if(head.next==null) return head;
        second = first.next;
        next = second.next;
        first.next = next;
        second.next = first;
        prev = first;
        first = next;
        head = second;
        
        while(first!=null&&first.next!=null){
            second = first.next;
            next = second.next;
            first.next = next;
            prev.next = second;
            second.next = first;
            prev = first;
            first = next;
        }
        return head;
    }

    //better solution
     public ListNode swapPairs(ListNode head) {
    ListNode start = new ListNode(0); //make head no longer a special case
    start.next = head;

    for(ListNode cur = start; cur.next != null && cur.next.next != null; cur = cur.next.next) {
      cur.next = swap(cur.next, cur.next.next);        
    }
    return start.next;
  }
  private Listnode swap(ListNode next1, ListNode next2) {
    next1.next = next2.next;
    next2.next = next1;
    return next2;
  }