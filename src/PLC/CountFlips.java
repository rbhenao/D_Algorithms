package PLC;
import java.util.*; //error on line 2

public class CountFlips {	
	public static void main(String args[]){ //error on line 5
		String userInput;
		int flips = 0, heads = 0, tails = 0;
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of flips: ");
		flips = reader.nextInt();
		
		for(int i = 0; i < flips; i++)
			if(Math.random() < 1/2)
				heads++;
			else
				tails++;
			
		
		
		System.out.println("Number of heads: " + heads + '\n' + 
						   "Number of tails: " + tails + '\n');
						   
	}
}
