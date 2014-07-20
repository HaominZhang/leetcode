//http://blog.sina.com.cn/s/blog_71d59f9a01017irg.html
    public int numTrees(int n) {
        if(n==0||n==1)
            return 1;
        int count = 0;
        for(int i=1;i<=n;i++){
            count+=numTrees(i-1)*numTrees(n-i);
        }
        return count;
    }