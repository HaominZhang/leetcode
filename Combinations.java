//https://oj.leetcode.com/discuss/5913/whats-the-best-solution
public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(n==0||k==0)
            return returnlist;
        ArrayList<Integer> list = new ArrayList<Integer>();
        combineHelper(n,k,1,returnlist,list);
        return returnlist;
    }
    
    public static void combineHelper(int n, int k, int start, List<List<Integer>> returnlist, ArrayList<Integer> list){
        if(k==0){
            returnlist.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            combineHelper(n,k-1,i+1,returnlist,list);
            list.remove(list.size()-1);
        }
    }