import Utilities.printArray;

public class InsertionSort {
	public static void main(String args[]){
		int[] myArray = {5,3,1,8,7,2,9,8,16,14,23,23,12,59,92,24,1,22};
		
		for(int i = 0;i<myArray.length;i++){
			
			int j = i;
			
			int toInsert = myArray[i];
			
			while((j > 0) && (myArray[j-1] > toInsert)){
				
				myArray[j] = myArray[j-1]; //swap j with number one before j if number before is greater
				j--;
			
			}
			
			myArray[j] = toInsert;
			printArray.printTheArray(myArray);
		}
	}	
}
