public int threeSumClosest(int[] num, int target) {
        if(num.length<3) return 0;
        Arrays.sort(num);
        int min = Integer.MAX_VALUE;
        int returnval = 0;
        for(int i=0;i<num.length-2;i++){
            int j=i+1;
            int k = num.length-1;
            while(j<k){
                int sum= num[i]+num[j]+num[k];
                if(Math.abs(target-sum)<min){
                    min = Math.abs(target-sum);
                    returnval = sum;
                }
                if(target==sum){
                    return returnval;
                }else if(target>sum){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return returnval;
    }