  public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(num.length==0)
            return returnlist;
        List<Integer> list = new ArrayList<Integer>();
        permuteHelper(num,list,returnlist);
        return returnlist;
    }
    
    public static void permuteHelper(int[] num,List<Integer> list,List<List<Integer>> returnlist){
        if(num.length==list.size()){
            returnlist.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(!list.contains(num[i])){
                list.add(num[i]);
                permuteHelper(num,list,returnlist);
                list.remove(list.size()-1);
            }
        }
    }