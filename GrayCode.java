//http://blog.csdn.net/linhuanmars/article/details/24511221
 public ArrayList<Integer> grayCode(int n) {  
        ArrayList<Integer> res = new ArrayList<Integer>();  
        if(n<0)  
            return res;  
        if(n==0)  
        {  
            res.add(0);  
            return res;  
        }  
        res.add(0);  
        res.add(1);  
        for(int i=2;i<=n;i++)  
        {  
            int size = res.size();  
            for(int j=size-1;j>=0;j--)  
            {  
                res.add(res.get(j)+(1<<(i-1)));  
            }  
        }  
        return res;  
    }  