 public String reverseWords(String s) {
        String ss = s.trim();
        if(ss==null||ss.length()==0)
            return "";
        String[] strarray = ss.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i=strarray.length-1;i>=0;i--){
            if(strarray[i].length()==0)
        		continue;
        	result.append(strarray[i]);
        	result.append(" ");
        }
        if(result.charAt(result.length()-1)==' '){
        	result.deleteCharAt(result.length()-1);
        }
        return result.toString();
    }