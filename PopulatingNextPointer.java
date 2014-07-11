    public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        root.next = null;
        ArrayList<TreeLinkNode> current = new ArrayList<TreeLinkNode>();
        current.add(root);
        
        while(current.size()>0){
            ArrayList<TreeLinkNode> parent = current;
            current = new ArrayList<TreeLinkNode>();
            for(TreeLinkNode node: parent){  
                if(node.left != null)  
                    current.add(node.left);
                if(node.right != null)  
                    current.add(node.right);  
            }
            if(current.size()==0)
                continue;
            int i=1;
            for(i=1;i<current.size();i++){
                current.get(i-1).next = current.get(i);
            }
            current.get(current.size()-1).next=null;
        }
    }

    //better solution from Boying Shi
        public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        if(root.left!=null)
            root.left.next=root.right;
        if(root.right!=null){
            if(root.next!=null)
                root.right.next = root.next.left;
            else
                root.right.next = null;
        }
        connect(root.left);
        connect(root.right);
    }