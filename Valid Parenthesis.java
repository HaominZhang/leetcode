 public static boolean isValid(String s) {
		 java.util.Stack<Character> stack = new java.util.Stack<Character>();
		 for(char c:s.toCharArray()){
			 if(c=='['||c=='('||c=='{'){
				 stack.push(c);
			 }else{
			     if(stack.isEmpty())
			        return false;
			     char popc = stack.pop();
			     if((c==']'&&popc=='[')||(c==')'&&popc=='(')||(c=='}'&&popc=='{'))
                    continue;
			     else
			        return false;
			 }
		 }
		 return stack.isEmpty()?true:false;
	 }