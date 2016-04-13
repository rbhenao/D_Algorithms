package TheroeticalNotes;

public class MakeArrayIndexOutOfBounds {

	private int[] array;
	
	public MakeArrayIndexOutOfBounds(int arrayLength){
		this.array = new int [arrayLength];
		for(int i = 0; i < this.array.length; i++){
			this.array[i] = (int)(Math.random() * 100 - 1);
			System.out.println(i);
		}
		
	}

	public int numberAtArrayIndexPosition(int i) throws FoundArrayIndexOutOfBoundsException{
		try{
			return this.array[i];
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new FoundArrayIndexOutOfBoundsException("index is out of bounds");
		}
	}
	
}
