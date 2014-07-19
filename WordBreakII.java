//http://blog.csdn.net/linhuanmars/article/details/22452163
public boolean isBreak(String s, Set<String> dict) {  
        if(s==null || s.length()==0)  
            return true;  
        boolean[] res = new boolean[s.length()+1];  
        res[0] = true;  
        for(int i=0;i<s.length();i++)  
        {  
            StringBuilder str = new StringBuilder(s.substring(0,i+1));  
            for(int j=0;j<=i;j++)  
            {  
                if(res[j] && dict.contains(str.toString()))  
                {  
                    res[i+1] = true;  
                    break;  
                }  
                str.deleteCharAt(0);  
            }  
        }  
        return res[s.length()];  
    }  
    
    public ArrayList<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> res = new ArrayList<String>(); 
        if(!isBreak(s,dict))
            return res;
            
        if(s==null || s.length()==0)  
            return res;  
        helper(s,dict,0,"",res);  
        return res;  
    }  
    private void helper(String s, Set<String> dict, int start, String item, ArrayList<String> res)  
    {  
        if(start>=s.length())  
        {  
            res.add(item);  
            return;  
        }  
        StringBuilder str = new StringBuilder();  
        for(int i=start;i<s.length();i++)  
        {  
            str.append(s.charAt(i));  
            if(dict.contains(str.toString()))  
            {  
                String newItem = item.length()>0?(item+" "+str.toString()):str.toString();  
                helper(s,dict,i+1,newItem,res);  
            }  
        }  
    }  