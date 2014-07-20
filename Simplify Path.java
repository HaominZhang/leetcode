//https://oj.leetcode.com/discuss/4558/whats-the-best-solution-coded-with-java
public String simplifyPath(String path){
	String[] paths = path.split("/");
	Stack<String> = new Stack();

	for(String str:paths){
		if(s.length()>0){
			if(s.equal("..")){
				if(!stack.empty()){
					stack.pop();
				}
			}else if(s.equal(".")){
				continue;
			}else{
				stack.push(s);
			}
		}
	}

	String result = "/";
	while(!stack.empty()){
		result = stack.pop()+result+"/";
	}
	if(result.length()==0)
		result +="/";
	return result;
}