	public static StringBuffer getSequence(StringBuffer list){
        StringBuffer newlist = new StringBuffer();
        int prevint = Character.getNumericValue(list.charAt(0));
        int count=0;
        for(int n=0;n<list.length();n++){
            int curint = Character.getNumericValue(list.charAt(n));
            if(curint==prevint){
                count++;	
            }else{
                newlist.append(count);
                newlist.append(prevint);
                prevint = curint;
                count =1;
            }
        }
        newlist.append(count);
        newlist.append(prevint);
        return newlist;
        
    }
    
    public static String countAndSay(int n) {
        StringBuffer str=new StringBuffer();
        str = str.append(1);
        for(int i=0;i<n-1;i++){
            str = getSequence(str);
        }
        return str.toString();
    }