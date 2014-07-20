//My Solution
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] newmatrix = new int[size][size];
		int pos;
			for(int i=0;i<size;i++){
				pos=0;
				for(int j=size-1;j>=0;j--){
					newmatrix[i][pos] = matrix[j][i];
					pos++;
				}
			}
		for(int i=0;i<size;i++){
		    for(int j=0;j<size;j++){
		        matrix[i][j] = newmatrix[i][j];
		    }
		}
    }

    //better solution
    //https://oj.leetcode.com/discuss/3064/in-place-solution
        public void rotate(int[][] matrix) {
    	int n = matrix.length;
    	for (int i = 0; i < n / 2; i++) {
    		for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
    			int temp = matrix[i][j];
    			matrix[i][j] = matrix[n-1-j][i];
    			matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
    			matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
    			matrix[j][n-1-i] = temp;
    		}
    	}
    }