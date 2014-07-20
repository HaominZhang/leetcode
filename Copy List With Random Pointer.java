//http://blog.csdn.net/linhuanmars/article/details/22463599
public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)
            return null;
        RandomListNode node = head;
        while(node!=null){
            RandomListNode newnode = new RandomListNode(node.label);
            newnode.next = node.next;
            node.next = newnode;
            node = newnode.next;
        }
        node = head;
        while(node!=null){
            if(node.random!=null)
                node.next.random = node.random.next;
            node = node.next.next;
        }
        RandomListNode newhead = head.next;
        node = head;
        while(node!=null){
            RandomListNode newnode = node.next;
            node.next = newnode.next;
            if(newnode.next!=null)
                newnode.next = newnode.next.next;
            node = node.next;
        }
        return newhead;
    }

    //with hashmap
     public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)
            return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
        RandomListNode newhead = new RandomListNode(head.label);
        map.put(head,newhead);
        RandomListNode oldp = head.next;
        RandomListNode newp = newhead;
        while(oldp!=null){
            RandomListNode newnode = new RandomListNode(oldp.label);
            map.put(oldp,newnode);
            newp.next = newnode;
            oldp = oldp.next;
            newp = newp.next;
        }
        oldp = head;
        newp = newhead;
        while(oldp!=null){
            newp.random = map.get(oldp.random);
            oldp = oldp.next;
            newp = newp.next;
        }
        return newhead;
    }