  public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null)
            return null;
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        UndirectedGraphNode newnode = new UndirectedGraphNode(node.label);
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        map.put(node,newnode);
        queue.offer(node);
        while(!queue.isEmpty()){
            UndirectedGraphNode cur = queue.pop();
            for(UndirectedGraphNode nod:cur.neighbors){
                if(!map.containsKey(nod)){
                    UndirectedGraphNode nnode = new UndirectedGraphNode(nod.label);
                    map.put(nod,nnode);
                    map.get(cur).neighbors.add(nnode);
                    queue.add(nod);
                }else{
                    map.get(cur).neighbors.add(map.get(nod));
                }
               
            }
        }
        return newnode;
    }