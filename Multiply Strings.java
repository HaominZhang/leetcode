http://leetcodenotes.wordpress.com/2013/10/20/leetcode-multiply-strings-%E5%A4%A7%E6%95%B4%E6%95%B0%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2%E4%B9%98%E6%B3%95/comment-page-1/#comment-122
public String multiply(String num1, String num2) {
        String n1 = new StringBuilder(num1).reverse().toString();  
        String n2 = new StringBuilder(num2).reverse().toString();  
          
        int[] d = new int[n1.length()+n2.length()];     
        for(int i=0; i<n1.length(); i++){  
            for(int j=0; j<n2.length(); j++){  
                d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');       
            }  
        }  
          
        StringBuilder sb = new StringBuilder();  
        for(int i=0; i<d.length; i++){  
            int digit = d[i]%10;          
            int carry = d[i]/10;       
            if(i+1<d.length){  
                d[i+1] += carry;  
            }  
            sb.insert(0, digit);         
        }  
          
        while(sb.charAt(0)=='0' && sb.length()>1){  
            sb.deleteCharAt(0);  
        }  
        return sb.toString();  
    }