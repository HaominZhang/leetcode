package leetcodeOJ;

public class removeDuplicate {
    public static int removeDuplicates(int[] A) {
        int i=0,j=1,index=2;
        for(j=1;j<A.length;j++){
            if(A[j]-A[i]<=0){
                if(index<A.length){
                    A[j]=A[index];
                    index++;
                }else{
                    break;
                }
                j--;
            }else{
                i++;
            }
        }
        return j;
    }
    
    public static void main(String[] argv){
    	int[] A = {1,1,2};
    	System.out.println(removeDuplicates(A));
    }
}
