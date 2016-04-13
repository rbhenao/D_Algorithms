package AlgorithmsClass;

public class QuickSortHybrid {
	
	private static int[] numbers;
	private static int number;
	
	public static int[] sortHybrid(int [] values){
	  	
	    if (values ==null || values.length==0){
	      return new int[0];
	    }
	    numbers = values;
	    number = values.length;
	    quicksort(0, number - 1);
	    return numbers;
    }
	
	private static void quicksort(int low, int high) {
	    int i = low, j = high;
	    
	    if(high - low <= 20){
	    	insertionSort(low, high);
	    	return;
	    }
	    
	    int pivot = numbers[low + (high-low)/2];

	   
	    while (i <= j) {
	     
	      while (numbers[i] < pivot) {
	        i++;
	      }
	      
	      while (numbers[j] > pivot) {
	        j--;
	      }

	      if (i <= j) {
	        exchange(i, j);
	        i++;
	        j--;
	      }
	    }
	    
	    if (low < j)
	      quicksort(low, j);
	    if (i < high)
	      quicksort(i, high);
	  }

	  private static void exchange(int i, int j) {
	    int temp = numbers[i];
	    numbers[i] = numbers[j];
	    numbers[j] = temp;
	  }	
	  
	  private static void insertionSort(int low, int high){
		  for(int i = low;i<high;i++){		
				int j = i;		
				int toInsert = numbers[i];			
				while((j > 0) && (numbers[j-1] > toInsert)){		
					numbers[j] = numbers[j-1]; //swap j with number one before j if number before is greater
					j--;		
				}			
				numbers[j] = toInsert;
			}
	  }
}

