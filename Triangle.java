 public static int minimumTotal(List<List<Integer>> triangle) {
		 int[] sum = new int[triangle.size()];
		 for(int i=0;i<sum.length;i++){
			 sum[i] = triangle.get(triangle.size()-1).get(i);
		 }
		 for(int i=triangle.size()-2;i>=0;i--){
			 List<Integer> current = triangle.get(i);
			 for(int j=0;j<current.size();j++){
				 sum[j] = Math.min(sum[j],sum[j+1])+current.get(j);
			 }
		 }
		 return sum[0];
	 }