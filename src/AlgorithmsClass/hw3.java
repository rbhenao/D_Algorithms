package AlgorithmsClass;

import java.util.Random;
import java.util.Scanner;

import Utilities.printArray;

public class hw3 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of array elements n");
		int n = input.nextInt();
		input.close();
		
		int[] testArray = makeArray(n);
		
		
				
		long time = System.nanoTime(); 
		insertionSort(testArray);
		System.out.println("Insertion Completed in: " + (System.nanoTime() - time) + " ns");
		
		time = System.nanoTime(); 
		countingSort(testArray, n);
		System.out.println("Counting Completed in: " + (System.nanoTime() - time) + " ns");
		
		
		
		time = System.nanoTime();
		QuickSort.sort(testArray);
		System.out.println("QuickSort Completed in: " + (System.nanoTime() - time) + " ns");
		
		testArray = makeArray(n);
		
	    time = System.nanoTime();
		QuickSortM3.sortMedianThree(testArray);
		System.out.println("QuickSort MedianThree Completed in: " + (System.nanoTime() - time) + " ns");
		
		testArray = makeArray(n);
		
		time = System.nanoTime();
		QuickSortHybrid.sortHybrid(testArray);
		System.out.println("QuickSort with Insertion Completed in: " + (System.nanoTime() - time) + " ns");
		
		//String name = "Computer Science";
		//System.out.println(name.substring(9));
		
	}
	

	public static void insertionSort(int[] myArray){	
		for(int i = 0;i<myArray.length;i++){		
			int j = i;		
			int toInsert = myArray[i];			
			while((j > 0) && (myArray[j-1] > toInsert)){		
				myArray[j] = myArray[j-1]; //swap j with number one before j if number before is greater
				j--;		
			}			
			myArray[j] = toInsert;
		}
		//printArray.printTheArray(myArray);
	}
	
	public static void countingSort(int[] myArray, int max){
		int[] countTable = new int[max+1];
		for(int i = 0; i < myArray.length; i++){
			countTable[myArray[i]]++;
		}
		int total = 0;
		for(int j = 0; j < countTable.length; j++){
			total = total + countTable[j];
			countTable[j] = total;
		}	
		int[] finalArray = new int[myArray.length];
		for(int k = myArray.length-1; k >=0 ; k--){
			int num = --countTable[myArray[k]];
			finalArray[num] = myArray[k];
		}
		//printArray.printTheArray(finalArray);
	}
	
	public static int[] makeArray(int size){
		Random r = new Random();
		int[] array = new int[size];
		for(int i=0;i < array.length;i++){
			int rand = r.nextInt(size+1);
			array[i] = rand;
		}
		return array;
	}
}
