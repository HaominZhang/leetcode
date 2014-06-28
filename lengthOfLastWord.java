package leetcodeOJ;

public class lengthOfLastWord {
	public static int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
		int i=0,counter=0;
		for(i=s.length();i>0;i--){
			if(s.charAt(i-1)!=' '){
				counter++;
			}
			if(s.charAt(i-1)==' '&&counter!=0){
				break;
			}
		} 
		return counter;
	 }
	 
	 public static void main(String[] argv){
		 String str = "a";
		 System.out.println(lengthOfLastWord(str));
	 }
}
