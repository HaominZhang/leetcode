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