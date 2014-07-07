public int maxArea(int[] height) {
        int Smax=0;
        int low = 0,high=height.length-1;
        while(low<high){
            Smax = Math.max(Smax,Math.min(height[low],height[high])*(high-low));
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return Smax;
    }