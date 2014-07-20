//http://www.programcreek.com/2013/03/leetcode-palindrome-partitioning-java/
 public static List<List<String>> partition(String s) {
	        List<List<String>> returnlist = new ArrayList<List<String>>();
	        if(s==null||s.length()==0)
	            return returnlist;
	        List<String> plist = new ArrayList<String>();
	        partitionHelper(s,0,returnlist,plist);
	        return returnlist;
	    }
	    
	    public static void partitionHelper(String s,int start, List<List<String>> returnlist, List<String> plist){
	        if(start==s.length()){
	            returnlist.add(new ArrayList<String>(plist));
	            return;
	        }
	        for(int i=start+1;i<=s.length();i++){
	        	String substr = s.substring(start,i);
	           StringBuffer str = new StringBuffer(substr);
	      
	           if(substr.equals(str.reverse().toString())){
	               plist.add(substr);
	               partitionHelper(s,i,returnlist,plist);
	               plist.remove(plist.size()-1);
	           }
	        }
	    }