public class Solution {
    public int reverse(int x) {
        boolean porm = true;
    	if (x<0){
    		porm = false;
    		x =-x;
    	}
        String str = Integer.toString(x);
        char[] rsvstr = new char[str.length()];
        int len = str.length();
        for(int i=0;i<str.length();i++){
            rsvstr[i] = str.charAt(len-1);
            len--;
        }

        String strstr = new String(rsvstr);
        int rvsint = Integer.parseInt(strstr);
        if(porm==false){
        	rvsint = -rvsint;
        }
        return rvsint;
    }
}