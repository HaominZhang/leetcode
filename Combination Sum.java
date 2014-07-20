////http://blog.csdn.net/yiding_he/article/details/18893515
 public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
            List<Integer> sumlist = new ArrayList<Integer>();
            if(candidates.length<=0){
                return returnlist;
            }
            Arrays.sort(candidates);
            combinationHelper(candidates,target,sumlist,returnlist,0,0);
            return returnlist;
    }
    
    public static void combinationHelper(int[] candidates,int target,List<Integer> sumlist,
                                        List<List<Integer>> returnlist, int index, int sum){
        if(sum==target){
            if(!returnlist.contains(sumlist))
                returnlist.add(new ArrayList<Integer>(sumlist));
            return; 
        }           
        
        if(sum>target)
            return;
            
        for(int i=index;i<candidates.length;i++){
            //sum = sum + candidates[i];
            sumlist.add(candidates[i]);
            combinationHelper(candidates,target,sumlist,returnlist,i,sum + candidates[i]);
            sumlist.remove(sumlist.size()-1);
        }
    }
