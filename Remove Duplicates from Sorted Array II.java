    //https://oj.leetcode.com/discuss/2754/is-it-possible-to-solve-this-question-in-place
    public int removeDuplicates(int[] A) {
    if(A.length<=2)
        return A.length;
    int count = 2;
    int len = A.length;
    for (int i = 2; i < len; i++) {
        if (A[i] != A[count - 2]) {
            A[count++] = A[i];
        }
    }
    return count;
    }