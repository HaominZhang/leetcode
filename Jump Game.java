   //https://oj.leetcode.com/discuss/3104/this-is-my-answer
    public boolean canJump(int[] A) {
        int maxStep=0;
        for(int i=0;i<A.length&&i<=maxStep;i++){
            if(i+A[i]>maxStep)
                maxStep = i+A[i];
            if(maxStep>=A.length-1)
                return true;
        }
        if(maxStep>=A.length-1)
            return true;
        return false;
    }