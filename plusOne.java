package leetcodeOJ;

public class plusOne {
	   public static int[] plusOne(int[] digits) {
	        int len = digits.length;
	        int carry=1;
	        boolean flag = false;
	        for(int i=len-1;i>=0;i--){
	            digits[i] = digits[i]+carry;
	            if(digits[i]==10){
	                digits[i] = digits[i]%10;
	                carry = 1;
	                if(i==0){
	                    flag = true;
	                }
	            }else{
	                carry=0;
	            }
	        }
	        if(flag==false){
	            return digits;
	        }else{
	            int[] sum = new int[len+1];
	            sum[0]=1;
               for(int j=1;j<len+1;j++){
                   sum[j] = digits[j-1];
               }
               return sum;
	        }
	    }
	 
	 public static void main(String[] argv){
		 int[] digits = {9,8,7,6,5,4,3,2,1,0};
		 plusOne(digits);
		 System.out.println("finish");
	 }
}
