//http://blog.csdn.net/linhuanmars/article/details/20588511
public static int search(int[] A, int target){
	        int low = 0;
	        int high = A.length-1;
	    	while(low<=high){
	    		int mid=(low+high)/2;
	    		if(A[mid]==target)
	    			return mid;
	    		if(A[low]<A[mid]){
	    			if(target>=A[low]&&target<A[mid])
	    				high = mid-1;
	    			else
	    				low=mid+1;
	    		}else if(A[mid]<A[low]){
	    			if(target>A[mid]&&target<=A[high])
	    				low=mid+1;
	    			else
	    				high=mid-1;
	    		}
	    	}
	    		return -1;
	    }