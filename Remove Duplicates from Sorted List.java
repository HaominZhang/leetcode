package leetcodeOJ;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
		}
}

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode slower,faster;
        slower = head;
        faster = head.next;
        while(faster!=null){
             if(slower.val==faster.val){
                slower.next = faster.next;
             }else{
                slower = slower.next;
             }
             faster = faster.next;

        }
        return head;
    }
}
