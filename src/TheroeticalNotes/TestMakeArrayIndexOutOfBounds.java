package TheroeticalNotes;

import java.util.Scanner;


public class TestMakeArrayIndexOutOfBounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int userInputArrayLength = input.nextInt();
		
		
		/*for (int i = 0; i < myArray.length; i++) { 
			System.out.print(myArray[i] + " ");
		}
		 */
		
		
		System.out.println("Enter an index to return number at index");

		
		boolean done = false;
		while(!done){
			MakeArrayIndexOutOfBounds  myArray = new MakeArrayIndexOutOfBounds (userInputArrayLength);
			int index = input.nextInt();
			try{
				myArray.numberAtArrayIndexPosition(index);
				done = true;
				System.out.println("valid index");
				System.out.println(myArray.numberAtArrayIndexPosition(index));
			}
			catch(FoundArrayIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
		}
	
		
	}
}


