import java.util.Scanner;
public class eApproximation {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter to how many iterations e will be estimated to.");
		int n = input.nextInt();
		double e = 1;
		double factorial = 1;
		
		for(int i = 1;i<n+1;i++){
			for(int j = i;j>0;j--){
				factorial*=j;
			}
		e+= 1/(factorial);
		factorial = 1;
		}
		System.out.println(e);
	}
}
