    //http://gongxuns.blogspot.com/2012/12/leetcode-spiral-matrix-ii.html
    public int[][] generateMatrix(int n) {
        if(n<0)
            return null;
        int[][] matrix = new int[n][n];
        int val=1,x=0,y=0;
        for(int i=n;i>0;i-=2){
            if(i==1){
                matrix[x][y] = val;
                break;
            }
            for(int j=0;j<i-1;j++){
                matrix[x][y++] = val++;
            }
            for(int j=0;j<i-1;j++){
                matrix[x++][y] = val++;
            }
            for(int j=0;j<i-1;j++){
                matrix[x][y--] = val++;
            }
            for(int j=0;j<i-1;j++){
                matrix[x--][y] = val++;
            }
            x++;
            y++;
        }
        return matrix;
    }