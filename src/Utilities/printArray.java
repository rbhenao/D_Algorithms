package Utilities;

public class printArray {
	
	//String version
	public static void printTheArray(String[] arrayToPrint){
		for(String string: arrayToPrint)
			System.out.print(string + " ");
		System.out.println();
	}
	
	//Integer version
	public static void printTheArray(int[] arrayToPrint){
		for(int myInt: arrayToPrint)
			System.out.print(myInt + " ");
		System.out.println();
	}
	
}
