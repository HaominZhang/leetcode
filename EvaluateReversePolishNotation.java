public int evalRPN(String[] tokens) {
	        Stack<Integer> stack = new Stack<Integer>();
	        int result=0;
	        for(String token:tokens){
	            if(!token.equals("+")&&!token.equals("-")&&!token.equals("*")&&!token.equals("/")){
	                stack.push(Integer.parseInt(token));
	            }else{
	            	int operand2 = stack.pop();
	            	int operand1 = stack.pop();
	            	switch(token){
	            		case "+":
	            			result = operand1 + operand2;
	            			break;
	            		case "-":
	            			result = operand1 - operand2;
	            			break;
	            		case "*":
	            			result = operand1 * operand2;
	            			break;
	            		case "/":
	            			result = operand1 / operand2;
	            			break;
	            		default:
	            			break;
	            	}
	            	stack.push(result);
	            }
	        }
	        return stack.pop();
    }