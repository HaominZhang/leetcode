public static int atoi(String str){
	        int len = str.length();
	        boolean neg = false; 
	        int i=0,j=0,start_index=0,end_index=0;
	        for(i=0;i<len;i++){
	            if(str.charAt(i)=='-'||str.charAt(i)=='+'){
	                if(str.charAt(i)=='-'){
	                    neg = true;
	                }
	                start_index = i+1;
	                if(str.charAt(start_index)<=57&&str.charAt(start_index)>=48){
		                for(j=start_index;j<len;j++){
		                   if(str.charAt(j)<=57&&str.charAt(j)>=48){
		                       end_index=j+1;
		                   }else{
		                        break;
		                   }
		               }
		                String substr = str.substring(start_index,end_index);
		                if(substr.length()>10&&neg==false){
		                   return Integer.MAX_VALUE;
		                }
		                if(substr.length()>10&&neg==true){
		                   return Integer.MIN_VALUE;
		                }
		               if(substr.length()==10){
		            	   if(substr.charAt(0)>Integer.toString(2).charAt(0)){
		            		   return neg==false?Integer.MAX_VALUE:Integer.MIN_VALUE;
		            	   }
		            	   if(substr.charAt(0)<Integer.toString(2).charAt(0))
		            	   {
		            		   int result = Integer.parseInt(substr);
		    	               return neg==false?result:-result;
		            	   }
		            	   if(neg==false){
		            		   for (int t=1; t < substr.length(); t++) {
		                		   if (substr.charAt(t)<Integer.toString(Integer.MAX_VALUE).charAt(t)){
		                			   int a=0;
		                			   break;
		                		   }
		                		   if (t==substr.length()-1) return Integer.MAX_VALUE;
		            		   }
		            		}else{
		            			for (int t=1; t < substr.length(); t++) {
		            				char st = Integer.toString(Integer.MIN_VALUE).charAt(t+1);
			                		   if (substr.charAt(t)<Integer.toString(Integer.MIN_VALUE).charAt(t+1)){
			                			   break;
			                		   }
			                		   if (t==substr.length()-1) return Integer.MIN_VALUE;
			            		}
		                	}
		               }
		               int result = Integer.parseInt(substr);
		               return neg==false?result:-result;
	                }else{
	                    return 0;
	                }
	            }
	            if(str.charAt(i)!=' '&&(str.charAt(i)>57||str.charAt(i)<48))
	        		break;
	            start_index=i;
	            if(str.charAt(start_index)<=57&&str.charAt(start_index)>=48){
	                for(j=start_index;j<len;j++){
	                   if(str.charAt(j)<=57&&str.charAt(j)>=48){
	                       end_index=j+1;
	                   }else{
	                        break;
	                   }
	               }
	                String substr = str.substring(start_index,end_index);
	                if(substr.length()>10&&neg==false){
	                   return Integer.MAX_VALUE;
	                }
	                if(substr.length()>10&&neg==true){
	                   return Integer.MIN_VALUE;
	                }
	               if(substr.length()==10){
	            	   if(substr.charAt(0)>Integer.toString(2).charAt(0)){
	            		   return neg==false?Integer.MAX_VALUE:Integer.MIN_VALUE;
	            	   }
	            	   if(substr.charAt(0)<Integer.toString(2).charAt(0))
	            	   {
	            		   int result = Integer.parseInt(substr);
	    	               return neg==false?result:-result;
	            	   }
	            	   if(neg==false){
	            		   for (int t=1; t < substr.length(); t++) {
	                		   if (substr.charAt(t)<Integer.toString(Integer.MAX_VALUE).charAt(t)){
	                			   int d=0;
	                			   break;
	                		   }
	                		   if (t==substr.length()-1) return Integer.MAX_VALUE;
	            		   }
	            		}else{
	            			for (int t=1; t < substr.length(); t++) {
	            				 if (substr.charAt(t)<Integer.toString(Integer.MIN_VALUE).charAt(t+2)){
		                			   int b=0;
		                			   break;
		                		   }
	            				 if (t==substr.length()-1) return Integer.MIN_VALUE;
		            		}
	                	}
	               }
	               int result = Integer.parseInt(substr);
	               return neg==false?result:-result;
	            }
	        }
	        return 0;
    }

    //better solution
    public int atoi(String str) {
	if (str == null || str.length() < 1)
		return 0;
 
	// trim white spaces
	str = str.trim();
 
	char flag = '+';
 
	// check negative or positive
	int i = 0;
	if (str.charAt(0) == '-') {
		flag = '-';
		i++;
	} else if (str.charAt(0) == '+') {
		i++;
	}
	// use double to store result
	double result = 0;
 
	// calculate value
	while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		result = result * 10 + (str.charAt(i) - '0');
		i++;
	}
 
	if (flag == '-')
		result = -result;
 
	// handle max and min
	if (result > Integer.MAX_VALUE)
		return Integer.MAX_VALUE;
 
	if (result < Integer.MIN_VALUE)
		return Integer.MIN_VALUE;
 
	return (int) result;
}