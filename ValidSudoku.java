 public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            boolean[] flag = new boolean[9];
            for(int t=0;t<9;t++){
                flag[t]=false;
            }
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }else{
                    int index = Character.getNumericValue(board[i][j])-1;
                    if(flag[index]==true){
                        return false;
                    }else{
                        flag[index]=true;
                    }
                }
            }
        }
        
        for(int i=0;i<9;i++){
            boolean[] flag = new boolean[9];
            for(int t=0;t<9;t++){
                flag[t]=false;
            }
            for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }else{
                    int index = Character.getNumericValue(board[j][i])-1;
                    if(flag[index]==true){
                        return false;
                    }else{
                        flag[index]=true;
                    }
                }
            }
        }
        
        for (int k = 0; k < 9; k++) {
            boolean[] flag = new boolean[9];
            for(int t=0;t<9;t++){
                flag[t]=false;
            }
            for (int i = k/3*3; i < k/3*3+3; i++) {
                for (int j = (k%3)*3; j < (k%3)*3+3; j++) {
                     if(board[i][j]=='.'){
                        continue;
                     }else{
                        int index = Character.getNumericValue(board[i][j])-1;
                        if(flag[index]==true){
                            return false;
                        }else{
                            flag[index]=true;
                        }
                     }
                }
            }
        }
        return true;
    }