 public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ArrayList<Integer> dupint = new ArrayList<Integer>();
        ListNode slower,faster;
        slower = head;
        faster = head.next;
        while(faster!=null){
             if(slower.val==faster.val){
                 if(!dupint.contains(slower.val))
                    dupint.add(slower.val);
                slower.next = faster.next;
             }else{
                slower = slower.next;
             }
             faster = faster.next;
        }
        if(dupint.size()==0)
            return head;
        
        int counter=0;
        while(head!=null){
            if(counter==dupint.size()||head.val!=dupint.get(counter))
                break;
            else{
                head = head.next;
                counter++;
            }
        }
        ListNode finalcheck = head;
        while(counter<dupint.size()){
            if(finalcheck==null||finalcheck.next==null)
                break;
            if(finalcheck.next.val==dupint.get(counter)){
                finalcheck.next = finalcheck.next.next;
                counter++;
            }else{
                finalcheck = finalcheck.next;
            }
        }
        return head;
    }