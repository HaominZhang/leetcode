 public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    public static ListNode mergeSort(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode slower = head,faster = head;
        while(faster.next!=null&&faster.next.next!=null){
            slower = slower.next;
            faster = faster.next.next;
        }
        ListNode head2 = slower.next;
        slower.next = null;
        ListNode head1 = head;
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        return mergeTwoLists(head1,head2);
    }
    
      public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode newhead;
        
        if(l2.val>l1.val){
            newhead = l1;
            l1 = l1.next;
        }else{
            newhead = l2;
            l2 = l2.next;
        }
        ListNode newp = newhead;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                newp.next = l1;
                l1 = l1.next;
            }else{
                newp.next = l2;
                l2 = l2.next;
            }
            newp = newp.next;
        }
        if(l1!=null) newp.next = l1;
        if(l2!=null) newp.next = l2;
        return newhead;
    }