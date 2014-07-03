    public int searchInsert(int[] A, int target) {
        int i=0;
        for(i=0;i<A.length;i++){
            if(target<=A[i]){
               break;
            }
        }
        return i;
    }

//beetter solution
    int searchInsert(int A[],int target) {  
        int l=0, r=A.length-1;  
        while(l<=r){  
            int mid = (l+r)/2;  
            if(A[mid] == target) 
                return mid;  
            if(mid>l && A[mid]>target && A[mid-1]<target) 
                return mid;  
            if(A[mid] > target){  
                r= mid-1;  
            }else{  
                l=mid+1;  
            }        
        }  
        return l;  
    }