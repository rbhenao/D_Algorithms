import Utilities.printArray;

public class SelectionSort {
	public static void main(String args[]){
		int[] myArray = {5,3,1,8,7,2,9,8,16,14,23,23,12,59,92,24,1,22};
		
		for(int x = 0; x < myArray.length; x++){		
			//minimum will store the lowest value in the array starting from index x
			int minimum = x; 
			
			for(int y = x; y < myArray.length; y++){
				//if the array at current minimum is greater than index y set new minimum to y
				if(myArray[minimum] > myArray[y]) 
					minimum = y;	
			}
		 
		int temp = myArray[x];
		myArray[x] = myArray[minimum]; //swaps minimum with x index
		myArray[minimum] = temp;
		
		printArray.printTheArray(myArray);
		
		}
	}
}