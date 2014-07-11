 //http://blog.csdn.net/worldwindjp/article/details/19938131
 public int numDecodings(String s) {
        if(s==null||s.length()==0)
            return 0;
        if(s.charAt(0)=='0')
            return 0;
            
        int[] number = new int[s.length()+1];
        number[0]=1;
        number[1]=1;
        int temp;
        for(int i=2;i<=s.length();i++){
            if(s.charAt(i-1)!='0')
                number[i] = number[i-1];
            if(s.charAt(i-2)!='0'){
                temp = Integer.parseInt(s.substring(i-2,i));
                if(temp>0&&temp<=26)
                    number[i]+=number[i-2];
            }
        }
        return number[s.length()];
    }