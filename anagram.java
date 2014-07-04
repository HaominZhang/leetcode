public static List<String> anagrams(String[] strs){
		List<String> list = new ArrayList<String>();
		if(strs.length==0)
			return list;
		HashMap<String,String> table = new HashMap<String,String>();
		for(int i=0;i<strs.length;i++){
			char[] chararray = strs[i].toCharArray();
			Arrays.sort(chararray);
			String curstr = new String(chararray);
			if(table.size()==0)
				table.put(curstr,strs[i]);
			else{
				if(!table.containsKey(curstr)){
					table.put(curstr,strs[i]);
				}else{
					if(!list.contains(table.get(curstr)))
					{
						list.add(table.get(curstr));
					}
					list.add(strs[i]);
				}
			}
		}
		return list;
	}

	//other solution
	public ArrayList<String> anagrams(String[] strs) {  
    ArrayList<String> res = new ArrayList<String>();  
    if(strs == null || strs.length == 0)  
        return res;  
    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();  
    for(int i=0;i<strs.length;i++)  
    {  
        char[] charArr = strs[i].toCharArray();  
        Arrays.sort(charArr);  
        String str = new String(charArr);  
        if(map.containsKey(str))  
        {  
            map.get(str).add(strs[i]);  
        }  
        else  
        {  
            ArrayList<String> list = new ArrayList<String>();  
            list.add(strs[i]);  
            map.put(str,list);  
        }  
    }  
    Iterator iter = map.values().iterator();  
    while(iter.hasNext())  
    {  
        ArrayList<String> item = (ArrayList<String>)iter.next();  
        if(item.size()>1)  
            res.addAll(item);  
    }  
    return res;  
}	