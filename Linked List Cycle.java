    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode faster = head, slower = head;
        while(faster!=null&&faster.next!=null){
            faster = faster.next.next;
            slower = slower.next;
            if(faster==slower)
                return true;
        }
        return false;
    }