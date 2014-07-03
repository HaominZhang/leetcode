	 public static String longestCommonPrefix(String[] strs) { 
		 int index = Integer.MAX_VALUE;
		 String prefix = "";
		 int i=0;
		 for(String str:strs){
	        if(index==Integer.MAX_VALUE){ 
	        	prefix = str;
	        	index=str.length();
	        }else{
	            if(str==""){
	                return "";
	            }
                int term = str.length()>index?index:str.length();
	        	for(i=0;i<term;i++){
	        		if(str.charAt(i)!=prefix.charAt(i)){
		        		break;
		        	}
		        }
		       	prefix = str.substring(0,i);
		  		index = i;
	        }
		 }
		 return prefix;
	 }