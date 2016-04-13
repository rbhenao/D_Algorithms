package AlgorithmsClass;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class hw1 {
    
    static Scanner scan = new Scanner(System.in); 
    
    public static void main(String[] args) {
               
        int[] numberArray = createArray();
        
        System.out.println("What integer would you like to search for?");
        int number = scan.nextInt();
                
        //for(int i = 0; i < numberArray.length;i++)
        	//System.out.print( "'" + numberArray[i] + "' ");     
               
        long time = System.nanoTime();       
        	System.out.println("\n linear search: "+linearSearch(numberArray, number));
        System.out.println("Completed in " + (System.nanoTime() - time) + " ns");
        
        
        System.out.println("\n" + "What size should the jumps be?");        
        int jumpSize = scan.nextInt();
        
        time = System.nanoTime();
        	System.out.println("\n jumpSearch: " + jumpSearch(numberArray, number, jumpSize));
        System.out.println("Completed in " + (System.nanoTime() - time) + " ns");
        
        
        
       System.out.println("\n How many divisions?");
       int numDiv = scan.nextInt();        
       System.out.println("\n recursiveJumpSearch: ");
        	
       time = System.nanoTime();
        	int index = recursiveJumpSearch(numDiv, numberArray, number);
        	if(numberArray[index] != number)
        		System.out.println(-1);
        	else
        		System.out.println(index);       	
        System.out.println("Completed in " + (System.nanoTime() - time) + " ns");
        
       
    }
    
    public static int[] createArray(){
        Random rand = new Random();
        
        int arraySize =  10000000;
        int[] numberArray = new int[arraySize];
        
        for (int i=0; i < arraySize; i++)
            numberArray[i]= rand.nextInt(arraySize);
              
        Arrays.sort(numberArray);  
        return numberArray;
    }
    
    public static int linearSearch(int[] numberArray, int number){
        for(int i = 0; i < numberArray.length; i++)
            if(numberArray[i] == number) 
                return i;       
        return -1;
    }
    
    public static int jumpSearch(int[] numberArray, int number, int jumpSize){    	       
        int arraySize = numberArray.length;        
        for(int i = jumpSize-1; i < arraySize; i+=jumpSize){
        	if(numberArray[i] == number){
        		return i;
        	}else if(numberArray[i] > number){     		
        		for(int j = i-jumpSize+1; j<i; j++)
        			if(numberArray[j] == number)
        				return j;      			       		
        		return -1;
        	} //if i doesn't have room to jump, push i back so that it is the last index on next cycle
        	//i = (i != (arraySize-1) && ((arraySize-1)-i) < jumpSize) ? i - (jumpSize - ((arraySize-1)-i)) : i; 
        }
        return -1;
    }
    
    public static int recursiveJumpSearch(int numDiv, int[] numberArray, int number){
    	int arraySize = numberArray.length;
    	int jumpSize = ((numberArray.length-1) % numDiv == 0 ) ? ((arraySize-1) / numDiv) : ((arraySize-1) / numDiv) + 1;
    	jumpSize = (jumpSize == 0) ? 1 : jumpSize; 
        for(int i = jumpSize-1; i < arraySize; i+=jumpSize){
        	if(numberArray[i] == number){
        		return i;
        	}else if(numberArray[i] > number){
        		int[] subArray = Arrays.copyOfRange(numberArray, (i < jumpSize) ? 0 : i-jumpSize+1, i);
        		return (i < jumpSize) ? 0 : i-jumpSize+1 + recursiveJumpSearch(numDiv, subArray, number);
        	} //if i doesn't have room to jump, push i back so that it is the last index on next cycle
        	i = (i != (arraySize-1) && ((arraySize-1)-i) < jumpSize) ? i - (jumpSize - ((arraySize-1)-i)) : i; 
        }
        return 0;
    }       
}
