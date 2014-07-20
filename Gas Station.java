    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas==null || gas.length==0 || cost==null || cost.length==0 || gas.length!=cost.length)  
            return -1; 
        int cur_total = 0;
        int gas_total=0;
        int index=-1;
        for(int i=0;i<gas.length;i++){
            cur_total += gas[i] - cost[i];
            gas_total += gas[i] - cost[i];
            if(cur_total<0){
                index = i;
                cur_total = 0;
            }
        }
        return gas_total>=0?index+1:-1;
    }