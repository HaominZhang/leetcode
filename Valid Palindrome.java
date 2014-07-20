  public boolean isPalindrome(String s) {
         char[] sarray = s.trim().toUpperCase().toCharArray();
	        if(sarray.length==0||sarray.length==1)
	            return true;
	        int n = sarray.length;
	        int i=0;
	        while(i<n){
	        	if((sarray[i]>='A'&&sarray[i]<='Z')||(sarray[i]>='0'&&sarray[i]<='9')){
	        	    if((sarray[n-1]>='A'&&sarray[n-1]<='Z')||(sarray[n-1]>='0'&&sarray[n-1]<='9')){
	        	        if(sarray[i]!=sarray[n-1]){
	        			    return false;
	        		    }else{
	        		        i++;
	        		        n--;
	        		    }
	        	    }else{
	        	        n--;
	        	    }
	        	}else{
	        	    i++;
	        	}
	        }
	        return true;
    }