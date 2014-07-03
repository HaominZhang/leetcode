	public static int[] mergesort(int[] array, int[] helper, int low, int high){
		if(low<high){
			int middle = (low+high)/2;
			mergesort(array,helper,low,middle);
			mergesort(array,helper, middle+1,high);
			merge(array,helper,low,middle,high);
		}
		return array;
	}

	public static void merge(int [] array, int[] helper, int low, int middle, int high){
		for(int i=low;i<=high;i++){
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle +1;
		int current = low;

		while(helperLeft<=middle && helperRight <= high){
			if(helper[helperLeft]<=helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}

		int remaining  = middle - helperLeft;
		for(int i=0;i<=remaining;i++){
			array[current + i] = helper[helperLeft+i];
		}
	}
	
	public static int[] MergeSort(int[] array){
		int[] helper = new int[array.length];
		mergesort (array,helper,0,array.length-1);
		return array;
	}
    
    public static void merge(int A[], int m, int B[], int n) {
        for(int index=m;index<m+n;index++){
            A[index] = B[index-m];
        }
        MergeSort(A);
    }

//better solution
    public void merge(int A[], int m, int B[], int n) {
        for (int idx = m + n - 1; idx >= 0; idx--) {
            if (m <= 0) {
                A[idx] = B[--n]; 
            } else if (n <= 0) {
                break;
            } else if (A[m-1] < B[n-1]) {
                A[idx] = B[--n];
            } else {
                A[idx] = A[--m];
            }
        }
    }