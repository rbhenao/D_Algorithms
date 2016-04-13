import java.util.Arrays;


public class Stacks {
	
	private String stackArray[];
	
	private int stackSize;
	
	private int topOfStack = -1; //empty by default
	
	Stacks(int size){
		
		stackSize = size;
		
		stackArray = new String[size];
		
		Arrays.fill(stackArray, "-1");
		
	}
	
	public void push(String input){
		
		if(topOfStack + 1 < stackSize){
			
			topOfStack++;
			
			stackArray[topOfStack] = input;
			
		}else System.out.println("Stack is full");
		
		displayTheStack();
		
	}
	
	public String pop(){
		
		if(topOfStack >= 0){
			
			displayTheStack();
			
			System.out.println("POP " + stackArray[topOfStack] + " Was removed");
			
			stackArray[topOfStack] = "-1";
			
			return stackArray[topOfStack--];
			
		}else{
			
			displayTheStack();
			
			System.out.println("Sorry but the stack is empty");
			
			return "-1";
		}
		
	}
	
	public String seeStack(){
		
		displayTheStack();
		
		System.out.println(stackArray[topOfStack] + " Is at the top of the stack");
		
		return stackArray[topOfStack];
	}

	public void displayTheStack(){
		 	         
		for(int n = 0; n < 61; n++)System.out.print("-");
			             
			System.out.println();
		             
		for(int n = 0; n < stackSize; n++){
		                  
		System.out.format("| %2s "+ " ", n);               
		}
			             
		System.out.println("|");
			             
		for(int n = 0; n < 61; n++)System.out.print("-");
		 	             
		System.out.println();
		 	             
		for(int n = 0; n < stackSize; n++){
		 	                 
			if(stackArray[n].equals("-1")) System.out.print("|     ");
		 	                 
		 	else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
		 	                 
		}
		 	             
		System.out.println("|");
		 	             
		for(int n = 0; n < 61; n++)System.out.print("-");
		 	             
		System.out.println();
		 	         
		}
	
	public static void main(String args[]){
		
		Stacks theStack = new Stacks(10);
		
		theStack.push("10");
		
		theStack.push("15");
		
		theStack.seeStack();
		
		theStack.pop();
		
		theStack.pop();
		
	}
}
