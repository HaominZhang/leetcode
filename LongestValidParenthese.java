    //http://blog.csdn.net/perfect8886/article/details/22818423
    public static int longestValidParentheses(String s) {
        if(s==null||s.length()==0||s.length()==1)
		 		return 0;
	        Stack<Integer> stack = new Stack<Integer>();
	        int maxLen=0;
	        int index=0;
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)=='(')
	        		stack.push(i);
	        	else{
	        		if(stack.isEmpty()){
	        			index = i+1;
	        		}else{
	        			stack.pop();
	        			maxLen = stack.isEmpty()?Math.max(maxLen, i-index+1):Math.max(maxLen, i-stack.peek());
	        		}
	        	}
	        }
	        return maxLen;
	 }