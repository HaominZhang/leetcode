  //https://github.com/yuanx/leetcode/blob/master/Subsets.java
  public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(S.length==0)
            return returnlist;
        Arrays.sort(S);
        for(int i=0;i<=S.length;i++){
            ArrayList<Integer> sublist = new ArrayList<Integer>();
            subsetsHelper(S,i,0,returnlist,sublist);
        }
        return returnlist;
    }
    
    public static void subsetsHelper(int[] S, int n, int start, List<List<Integer>> returnlist, ArrayList<Integer> list){
        if(list.size()==n){
            returnlist.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start;i<S.length;i++){
            list.add(S[i]);
            subsetsHelper(S,n,i+1,returnlist,list);
            list.remove(list.size()-1);
        }
    }