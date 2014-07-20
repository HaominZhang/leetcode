  public boolean isPalindrome(int x) {
        if(x<0) 
            return false;
        int counter=0;
        int oldnum = x;
        int newnum=0;
        while(oldnum/10!=0){
            oldnum/=10;
            counter++;
        }
        oldnum=x;
        while(x!=0){
            newnum = newnum + (x%10)*(int)Math.pow(10,counter--);
            x/=10;
        }
        return oldnum==newnum?true:false;
    }