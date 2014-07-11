public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode sm_list_head,lg_list_head;
        sm_list_head = new ListNode(0);
        lg_list_head = new ListNode(0);
        
        ListNode lsp = sm_list_head;
        ListNode llp = lg_list_head;
        
        while(head!=null){
            if(head.val<x){
                lsp.next = new ListNode(head.val);
                lsp = lsp.next;
            }else{
                llp.next = new ListNode(head.val);
                llp = llp.next;
            }
            head = head.next;
        }
        lsp.next = lg_list_head.next;
        return sm_list_head.next;
    }