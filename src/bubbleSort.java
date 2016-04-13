import Utilities.printArray;

/*
 * bubble sorting algorithm
 * run time of O(n^2)
 */
public class bubbleSort {
	public static void main(String args[]){
		//unordered array that will be sorted
		int[] numList = {5,3,1,8,7,2,9,8,16,14,23,23,12,59,92,24,1,22};
		
		//counts each sort
		for(int i = 0;i<numList.length-1;i++){
			//loops up to numlist-1 and checks whether to switch two numbers around or not. large numbers "float" to top
			for(int j = 0;j<numList.length-(i+1);j++){
				if(numList[j] > numList[j+1]){
					int temp     = numList[j+1];
					numList[j+1] = numList[j];
					numList[j]   = temp;
				}
			}
			printArray.printTheArray(numList); //prints out the elements each time around
		}
	}
}
