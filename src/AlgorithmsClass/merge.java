package AlgorithmsClass;

import java.util.Arrays;
import java.util.Random;

public class merge {
	
	public static void main(String args[]){
		int size = 4;
		int[] array1 = initArray(size);
		int[] array2 = initArray(size);
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		printArray(array1);
		printArray(array2);
		
		int[] result = merge(array1,array2);
		
		printArray(result);
	}
	
	public static int[] merge(int[] array1, int[] array2){		
		int[] subArray = new int[array1.length];
		int i = 0,j = 0, k = 0;
		
		while(i < array1.length && j < array2.length){
			if(array1[i] <= array2[j]){
				if(k < array1.length){
					subArray[k] = array1[i];
					i++;
					k++;
				}else{
					array1[k-array1.length] = array1[i];
					i++;
					k++;
				}
			}else{
				if(k < array1.length){
					subArray[k] = array2[j];
					j++;
					k++;
				}else{
					array1[k-array1.length] = array2[j];
					j++;
					k++;
				}
			}
		}
		
		if(i >= array1.length)
			for(; j < array2.length; j++)
				array1[j] = array2[j];
		
		int[] finalArray = new int[subArray.length*2];
		
		for(int l = 0; l < subArray.length; l++)
			finalArray[l] = subArray[l];
		
		for(int m = array1.length; m < finalArray.length; m++)
			finalArray[m] = array1[m-array1.length];
			
		return finalArray;
	}
	
	public static int[] initArray(int size){
		Random gen = new Random();		
		int[] array = new int[size];		
		for(int i = 0; i < array.length; i++)
			array[i] = gen.nextInt(10);
		return array;
	}
	
	public static void printArray(int[] arrayInput){
		for(int i = 0; i < arrayInput.length; i++){
			System.out.print(arrayInput[i] + " ");
		}
		System.out.println("\n");
	}
}
