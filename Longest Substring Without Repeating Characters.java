public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)
            return s.length();
        int start_index=0,end_index=1;
        int max = 0;
        boolean[] flag = new boolean[256];
        for(int i=0;i<256;i++){
            flag[i] = false;
        }
        flag[s.charAt(start_index)]=true;
        while(end_index<s.length()){
            if(flag[s.charAt(end_index)]==true){
                for(int i=0;i<256;i++){
                    	flag[i] = false;
                }
           
                max = Math.max(end_index-start_index,max);
                start_index=start_index+1;
                flag[s.charAt(start_index)]=true;
                end_index = start_index+1;
            }else{
                flag[s.charAt(end_index)]=true;
                end_index++;
            }
        }
        return Math.max(end_index-start_index, max);
    }
//better solution
public static int lengthOfLongestSubstring(String s) {
 
	char[] arr = s.toCharArray();
	int pre = 0;
 
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < arr.length; i++) {
		if (!map.containsKey(arr[i])) {
			map.put(arr[i], i);
		} else {
			pre = pre > map.size() ? pre : map.size();
			i = map.get(arr[i]);
			map.clear();
		}
	}
 
	return Math.max(pre, map.size());
}