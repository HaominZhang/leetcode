public List<List<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(num.length==0)
            return returnlist;
        Arrays.sort(num);
        combinationHelper(num,target,0,new ArrayList<Integer>(),returnlist);
        return returnlist;
    }
    public static void combinationHelper(int[] num, int target, int idx, List<Integer> sumlist, List<List<Integer>> returnlist){
        if(target<0||idx>num.length)
            return;
        if(target==0){
            if(!returnlist.contains(sumlist))
                returnlist.add(new ArrayList<Integer>(sumlist));
            return;
        }
        for(int i=idx;i<num.length;i++){
            sumlist.add(num[i]);
            combinationHelper(num,target-num[i],i+1,sumlist,returnlist);
            sumlist.remove(sumlist.size()-1);
        }
    }