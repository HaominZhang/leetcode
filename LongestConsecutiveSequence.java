 public int longestConsecutive(int[] num) {
       if(num.length==0||num.length==1)
          if(num.length==0||num.length==1)
            return num.length;
        Arrays.sort(num);
        int maxLen = 1;
        int temp=num[0];
        int curLen=1;
        for(int i=1;i<num.length;i++){
            if(num[i]==temp+1){
                curLen++;
            	temp = num[i];
            }else if(num[i]==temp){
                continue;
            }
            else{
                maxLen = Math.max(curLen,maxLen);
                curLen=1;
                temp = num[i];
            }
        }
        return Math.max(curLen,maxLen);
    }

    //better solution
    //http://www.programcreek.com/2013/01/leetcode-longest-consecutive-sequence-java/
    public int longestConsecutive(int[] num) {
    Set<Integer> set = new HashSet<Integer>();
    int max = 1;
 
    for (int e : num)
        set.add(e);
 
    for (int e : num) {
        int left = e - 1;
        int right = e + 1;
        int count = 1;
 
        while (set.contains(left)) {
            count++;
            set.remove(left);
            left--;
        }
 
        while (set.contains(right)) {
            count++;
            set.remove(right);
            right++;
        }
 
        max = Math.max(count, max);
    }
 
    return max;
}