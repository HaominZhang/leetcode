//solution
 public static int uniquePaths(int m, int n)  
	    {  
		 	if(m==0 || n==0) return 0;  
	     	if(m ==1 || n==1) return 1;  
	          
	        int[][] path = new int[m][n];  
	          
	        // 1st row only 1 path  
	        for (int i=0; i<n; i++)  
	            path[0][i] = 1;  
	          
	        // 1st column only 1 path  
	        for (int i=0; i<m; i++)  
	            path[i][0] = 1;  
	          
	        // for each body node, number of path = paths from top + paths from left  
	        for (int i=1; i<m; i++){  
	            for (int j=1; j<n; j++){  
	                path[i][j] = path[i-1][j] + path[i][j-1];  
	            }  
	        }  
	        return path[m-1][n-1];  
	    }    