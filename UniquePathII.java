public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m==0)
            return 0;
        int n = obstacleGrid[0].length;
    	if(n==0)
    	    return 0;
    	 if(m==1){
    	    for (int i=0; i<n; i++){
                if(obstacleGrid[0][i]==1)
                    return 0;
            }
            return 1;
    	 }
    	  if(n==1){
    	    for (int i=0; i<m; i++){
                if(obstacleGrid[i][0]==1)
                    return 0;
            }
            return 1;
    	 }
    	 
        int[][] path = new int[m][n]; 
        if(obstacleGrid[0][0]!=1){
        	path[0][0]=1;
        }else{
            return 0;
        }
        for(int i=1;i<m;i++){
        	if(obstacleGrid[i][0]!=1&&path[i-1][0]!=Integer.MAX_VALUE)
        		path[i][0] = 1;
        	else
        		path[i][0] = Integer.MAX_VALUE;
        }
        for(int i=1;i<n;i++){
        	if(obstacleGrid[0][i]!=1&&path[0][i-1]!=Integer.MAX_VALUE)
        		path[0][i] = 1;
        	else
        		path[0][i] = Integer.MAX_VALUE;
        }
        
        
        for (int i=1; i<m; i++){  
            for (int j=1; j<n; j++){
                if(obstacleGrid[i][j]!=1){
                    if(path[i-1][j]!=Integer.MAX_VALUE&&path[i][j-1]!=Integer.MAX_VALUE){
                            path[i][j] = path[i-1][j] + path[i][j-1];
                            continue;
                    }
                    if(path[i-1][j]!=Integer.MAX_VALUE){
                        path[i][j] =path[i-1][j];
                        continue;
                    }
                    if(path[i][j-1]!=Integer.MAX_VALUE){
                        path[i][j] = path[i][j-1];
                        continue;
                    }
                    path[i][j]=Integer.MAX_VALUE;
                }else{
                    path[i][j] = Integer.MAX_VALUE;
                }
            }  
        }  
        return path[m-1][n-1]==Integer.MAX_VALUE?0:path[m-1][n-1];
}