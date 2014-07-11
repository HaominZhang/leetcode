//http://gongxuns.blogspot.com/2012/12/leetcode-reverse-linked-list-ii.html
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        head = prev;
        ListNode start=head;
        int j=0;
        while(j<m-1){
            start = start.next;
            j++;
        }
        prev = start;
        start = start.next;
        while(m<n){
            ListNode st = start.next;
            start.next = st.next;
            st.next = prev.next;
            prev.next = st;
            m++;
        }
        return head.next;
    }