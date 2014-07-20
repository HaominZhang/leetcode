    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        if(rowIndex==0) 
            return row;
        for(int i=1;i<=rowIndex;i++){
            for(int j=0;j<row.size()-1;j++){
                row.set(row.get(j)+row.get(j+1));
            }
            currow.add(1);
        }
        return row;
    }