 public ListNode detectCycle(ListNode head) {
             if(head==null)
                return null;
            ListNode faster = head, slower = head;
            while(faster!=null&&faster.next!=null){
                faster = faster.next.next;
                slower = slower.next;
                if(faster==slower){
                    slower = head;
                    while(slower!=faster){
                        slower = slower.next;
                        faster = faster.next;
                    }
                    return slower;
                }
            }
            return null;
        }