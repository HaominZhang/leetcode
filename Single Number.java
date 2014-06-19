public class Solution {
    public int singleNumber(int[] A) {
        int nbr = 0;
        for(int i=0;i<A.length;i++){
            nbr^=A[i];
        }
        return nbr;
    }
}