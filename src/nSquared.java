import java.util.Scanner;
public class nSquared {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be squared");
		int n = input.nextInt(); 
		long time = System.currentTimeMillis();
		int answer = 0;
		//not as efficient as normal squaring but still cool
		//uses summation formula
		for(int i = 1;i<=n;i++){
			answer+=((2*i)-1);
		}
		System.out.println(answer);
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
