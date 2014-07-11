   //http://blog.csdn.net/yiding_he/article/details/18893621
   static int rows;
    static int cols;
    public boolean exist(char[][] board, String word) {
        
        rows = board.length;
        cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dfsSearch(board,word,0,i,j,visited)==true){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dfsSearch(char[][] board,String word,int index, int row,int col,boolean[][] visited){
        if (index == word.length())  
            return true;
        if (row < 0 || col < 0 || row >= rows || col >= cols)  
            return false; 
        if (visited[row][col])  
            return false;  
        if (board[row][col] != word.charAt(index))  
            return false;  
        visited[row][col] = true; 
        boolean res = dfsSearch(board, word, index + 1, row - 1, col,visited)  
                || dfsSearch(board, word, index + 1, row + 1, col, visited)  
                || dfsSearch(board, word, index + 1, row, col + 1, visited)  
                || dfsSearch(board, word, index + 1, row, col - 1, visited);  
        visited[row][col] = false;  
        return res;  
    }