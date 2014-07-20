public int minPathSum(int[][] grid) {
        int rows = grid.length;
        if(rows==0)
            return 0;
        int cols = grid[0].length;
        if(cols==0)
            return 0;
        int[][] board = new int[rows][cols];
        board[0][0]=grid[0][0];
        for(int i=1;i<rows;i++){
                board[i][0]=grid[i][0]+board[i-1][0];
        }
        for(int i=1;i<cols;i++){
                board[0][i]=grid[0][i]+board[0][i-1];
        }
        
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                board[i][j] = board[i-1][j]>board[i][j-1]?board[i][j-1]+grid[i][j]:board[i-1][j]+grid[i][j];
            }
        }
        return board[rows-1][cols-1];
    }