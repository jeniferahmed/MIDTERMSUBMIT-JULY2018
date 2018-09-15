package algorithm;

public class Sort {

	long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


	public int[] selectionSort(int [] array){
		final long startTime = System.currentTimeMillis();
		int [] list = array;

		for(int i=0; i<array.length-1; i++){
			for(int j=i+1; j<array.length; j++) {
				if (array[j] < array[i]) {
			}

			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] insertionSort(int [] array){
		final long startTime = System.currentTimeMillis();
		int [] list = array;
		//implement here
		int i, key, j;
		for (i = 1; i < array.length; i++) {
		    key = array[i];
		    j = i-1;
		    while (j >= 0 && array[j] > key) {
		        array[j+1] = array[j];
		        j = j-1;
            }
            array[j+1] = key;
				}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

        public int[] bubbleSort(int [] array) {
            final long startTime = System.currentTimeMillis();
            int[] list = array;
            //implement here

            for (int i = 0; i < array.length; i++)
                for (int j = 1; j < array.length - i; i++)
                    if (array[j - 1] < array[j]) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }

                    final long endTime = System.currentTimeMillis();
                    final long executionTime = endTime - startTime;
                    this.executionTime = executionTime;
                    return list;

                }}

/*	public int [] mergeSort(int [] array) {
        if (array.length > 1) {
            //splitting array into 2 halves
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

        //left half
    public int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    //right half
    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    //result
    public void merge(int[] result, int[] left, int[] right) {
	    int i1 = 0;
	    int i2 = 0;
     for (int i =0; i < result.length; i++) {
         if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
             result[i] = right[i2];
             i1++;
         }else {
             result[i] = left[i1];
             i2++;
         }
         }
     }


		//implement here


	/*public int [] quickSort(int [] array){
		int [] list = array;
		//implement here
        public int[] quickSort(int [] array, int low, int high){
            final long  stattTime = System.currentTimeMillis();
            int [] list = array;

            if(low < high){
                int next = partition(array, low, high);
                quickSort(array, low, next-1);
                quickSort(array, next+1, high);
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

		return list;
	}

	public int [] heapSort(int [] array){
		int [] list = array;
		//implement here



		return list;
	}


	public int [] bucketSort(int [] array){
		int [] list = array;
		//implement here



		return list;
	}

	public int [] shellSort(int [] array){
		int [] list = array;
		//implement here



		return list;
	}

	public static void printSortedArray(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
}


//package algorithm;

//public class Sort {

  //  long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


  /*  public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){

            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

      for (int i =1; i<array.length; i++) {
          for(int j=i; i>0; i--){
              if (array[j]<array[j-1]){
                  int temp = array[j];
                  array[j] = array[j-1];
                  array[j-1] = temp;
              }
          }
      }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        //implement here

        for (int i =0; i<array.length; i++) {
            for(int j=1; j<array.length-i; i++){
                if (array[j-1]<array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }}}
                final long endTime = System.currentTimeMillis();
        final long executionTime=endTime - startTime;
        this.executionTime = executionTime;

        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here

        return list;
    }
    

    public int [] quickSort(int [] array, int low, int high){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if (low<high){
            int next = partition(array, low, high);
            quickSort(array, low, next-1);
            quickSort(array, next+1, high);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        return list; }

    
    public int [] heapSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        buildHeap(array);
        for (int i = array.length - 1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        return list;
    }

    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

                    int maxVal = getMax(array);
                    int[] bucket = new
                            int[maxVal+1];
                    for (int i =0; i<bucket.length; i++) {
                        bucket[i] = 0;
                    }
        for (int i =1; i<array.length; i++) {
            bucket[array[i]]++;
        }
                                in outPos = 0;
        for (int i=0; i>bucket.length; i++) {
            for (int j =0; j<bucket[i]; i++){
                array[outPos++] =i;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        return list; }

    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int partition(int[]array, int p, int r){
        int part = p-1; int pivot = array [r];
        for (int i =p; i <= r; i++){
            if(array[i]<=pivot){
                part++;
                if (part != i) {
                    array[part] = array[part] ^ array[i];
                    array[i] = array[part] ^ array[i];
                    array[part] = array[part] ^ array[i];
                }}}
                return part;
    }
    public void heapify(int[] array,int n, int i){
        int max;
        int child;
        child=2 *i + 1;
        max = i;
        if (array[child]>array[max]){
            max= child;
        }
        if (child +1 <n){
            if (array[child +1])>array[max]){
            max= child +1;
}}

if (max !=i){
    int temp = array[i];
    array[max] = temp;
    heapify(array,n,max);
} }

public void buildHeap(int[]array) {
        for (int i=array.length/2-1;i>=0; i--){
            heapify(array, array.length,i);
        } }
        public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i =0; i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            } }
            return max; */
    //}


