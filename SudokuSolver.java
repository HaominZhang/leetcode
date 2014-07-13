//http://blog.csdn.net/linhuanmars/article/details/20748761
 public void solveSudoku(char[][] board) {  
        helper(board,0,0);  
    }  
    private boolean helper(char[][] board, int i, int j)  
    {  
        if(j>=9)  
            return helper(board,i+1,0);  
        if(i==9)  
        {  
            return true;  
        }  
        if(board[i][j]=='.')  
        {  
            for(int k=1;k<=9;k++)  
            {  
                board[i][j] = (char)(k+'0');  
                if(isValid(board,i,j))  
                {  
                    if(helper(board,i,j+1))  
                        return true;  
                }  
                board[i][j] = '.';  
            }  
        }  
        else  
        {  
            return helper(board,i,j+1);  
        }  
        return false;  
    }  
    private boolean isValid(char[][] board, int i, int j)  
    {  
        boolean[] map = new boolean[9];  
        for(int k=0;k<9;k++)  
        {  
            if(k!=j && board[i][k]==board[i][j])  
                return false;  
        }  
        for(int k=0;k<9;k++)  
        {  
            if(k!=i && board[k][j]==board[i][j])  
                return false;  
        }          
        for(int row = i/3*3; row<i/3*3+3; row++)  
        {  
            for(int col=j/3*3; col<j/3*3+3; col++)  
            {  
                if((row!=i || col!=j) && board[row][col]==board[i][j])  
                    return false;  
            }  
        }  
        return true;  
    }  