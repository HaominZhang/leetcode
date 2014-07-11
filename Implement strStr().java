//http://www.programcreek.com/2012/12/leetcode-implement-strstr-java/
public String strStr(String haystack, String needle) {
        if(haystack==null)
            return null;
        if(haystack.length()!=0&&needle.length()==0)
            return haystack;
        if(haystack.length()==0&&needle.length()==0)
            return "";
            
        for(int i=0;i<haystack.length();i++){
            if(haystack.length()-i+1<needle.length())
                return null;
            int j=i;
            int k=0;
            while(j<haystack.length()&&k<needle.length()&&haystack.charAt(j)==needle.charAt(k)){
                j++;
                k++;
                if(k==needle.length()){
                    return haystack.substring(i);
                }
            }
        }
        return null;
    }