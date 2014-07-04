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
    public ListNode mergeKLists(List<ListNode> lists) {
        int len = lists.size();
        if(len==0)
            return null;
        if(len==1)
            return lists.get(0);
        
        
        int times = (int)(Math.log(len)/Math.log(2));
        times = times < Math.log(len)/Math.log(2)? times+1:times;
        for(int i=1;i<=times;i++){
            for(int j=0;j<len;j += (int)Math.pow(2,i)){
                int offset = j+(int)Math.pow(2,i-1);
                lists.set(j, mergeTwoLists(lists.get(j), (offset >= lists.size()? null : lists.get(offset))));
            }
        }
        return lists.get(0);
    }