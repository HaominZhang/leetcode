public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows<=0) 
            return triangle;
        List<Integer> row = new ArrayList<Integer>();
       
        row.add(1);
        triangle.add(row);
        
        for(int i=2;i<=numRows;i++){
            List<Integer> currow = new ArrayList<Integer>();
            currow.add(1);
            for(int j=0;j<triangle.size()-1;j++){
                currow.add(row.get(j)+row.get(j+1));
            }
            currow.add(1);
            triangle.add(currow);
            row = currow;
        }
        return triangle;
    }