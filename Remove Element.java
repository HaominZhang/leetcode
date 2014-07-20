package leetcodeOJ;

public class removeElem {
	public static int removeElement(int[] A, int elem) {
        if(A.length==0) 
        	return 0;
        int i=A.length-1, j=0;
        while(i>=0){
            if(i<j){
            	break;
            }
            if(A[j]==elem){
                if(A[i]!=elem){
                    A[j] = A[i];
                    j++;
                }
                i--;
            }else{
                j++;
            }
        }
        return j;
    }
	
	public static void main(String[] argv){
    	int[] A = {1,3,2,3,4,3,5,3,6,3};
    	System.out.println(removeElement(A,3));
    }
}
