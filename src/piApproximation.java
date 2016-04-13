import java.util.Scanner;
public class piApproximation {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter how many iterations pi will be estimated to.");
		int n = input.nextInt();
		double pi = 0;
		
		for(double i = 0;i<n+1;i++){
			if(i%2 == 0){
				pi+= 1/(1+(2*i));
			}else{
				pi-= 1/(1+(2*i));
			}
		}
		pi*=4;
		System.out.println(pi);
	}
}
