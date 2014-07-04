    public static ArrayList<String> generateParenthesis(int n) {  
        ArrayList<String> list = new ArrayList<String>();  
        rec(n, 0, 0, "", list);  
        return list;  
    }  
      
    public static void rec(int n, int left, int right, String s, ArrayList<String> list){  
        if(left < right){  
            return;  
        }  
 
        if(left==n && right==n){  
            list.add(s);  
            return;  
        }  
        if(left == n){  
            rec(n, left, right+1, s+")", list);  
            return;  
        }  
          
        rec(n, left+1, right, s+"(", list);      
        rec(n, left, right+1, s+")", list);     
    }  