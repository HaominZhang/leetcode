 public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix==null||matrix.length==0)
            return list;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0,y=0;
    
        while(rows>0&&cols>0){
            if(rows==1){
                for(int j=0;j<cols;j++){
                    list.add(matrix[x][y++]);
                }
                break;
            }else if(cols==1){
                for(int j=0;j<rows;j++){
                    list.add(matrix[x++][y]);
                }
                break;
            }
            for(int j=0;j<cols-1;j++){
                list.add(matrix[x][y++]);
            }
            for(int j=0;j<rows-1;j++){
                list.add(matrix[x++][y]);
            }
            for(int j=0;j<cols-1;j++){
                list.add(matrix[x][y--]);
            }
            for(int j=0;j<rows-1;j++){
                list.add(matrix[x--][y]);
            }
            x++;
            y++;
            rows-=2;
            cols-=2;
        }
        return list;
    }