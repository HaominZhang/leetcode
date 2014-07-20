 public List<List<Integer>> permuteUnique(int[] num) {
        List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
        if(num.length==0)
            return returnlist;
        Arrays.sort(num);
        boolean[] visited = new boolean[num.length];
        List<Integer> list = new ArrayList<Integer>();
        permuteHelper(num,list,returnlist,visited);
        return returnlist;
    }
    
    public static void permuteHelper(int[] num, List<Integer> list,List<List<Integer>> returnlist,boolean[] visited){
        if(num.length==list.size()){
            returnlist.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<num.length;i++){
            if(i>0&&!visited[i-1]&&num[i]==num[i-1])
                continue;
            if(!visited[i]){ 
                visited[i]=true;
                list.add(num[i]);
                permuteHelper(num,list,returnlist,visited);
                list.remove(list.size()-1);
                visited[i]=false;
            }
        }
    }