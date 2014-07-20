//http://fisherlei.blogspot.com/2013/01/leetcode-rotate-list.html
public ListNode rotateRight(ListNode head, int n) {
        if(n<=0||head==null)
            return head;
        int len=1;
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
            len++;
        }
        temp.next= head;
        int k = len - n%len;
        while(k>0){
            temp = temp.next;
            k--;
        }
        head = temp.next;
        temp.next=null;
        return head;
    }