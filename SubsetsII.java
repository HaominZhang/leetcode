public List<List<Integer>> subsetsWithDup(int[] num) {
       List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(num.length==0)
            return returnlist;
        Arrays.sort(num);
        for(int i=0;i<=num.length;i++){
            ArrayList<Integer> sublist = new ArrayList<Integer>();
            subsetsHelper(num,i,0,returnlist,sublist);
        }
        return returnlist;
    }
    
    public static void subsetsHelper(int[] S, int n, int start, List<List<Integer>> returnlist, ArrayList<Integer> list){
        if(list.size()==n){
            if(!returnlist.contains(list))
                returnlist.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start;i<S.length;i++){
            list.add(S[i]);
            subsetsHelper(S,n,i+1,returnlist,list);
            list.remove(list.size()-1);
        }
    }