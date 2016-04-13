/*
 * Sieve of eratosthenes
 * 
 */
public class primeSieve {
	public static void main(String args[]){
		boolean[] prime = new boolean[100];
		long time = System.currentTimeMillis();
		
		//returns boolean with all primes set to false up to boolean length
		for(int n = 2;n<Math.sqrt(prime.length);n++){
			//if prime or false mark off all multiples starting at n*n
			if(prime[n] == false){
				for(int i = n*n;i<prime.length;i+=n){
					prime[i] = true;
				}
			}
			
		}
		
		//finds highest count of prime
		int count = 0;
		for(int j = 2;j<prime.length;j++){
			if(prime[j] == false){
				count++;
				System.out.println(j);
			}
		}
		
		//prints highest in boolean
		for(int k = prime.length-1;k>2;k--){
			if(prime[k] == false){
				System.out.println(k+" is the "+count+"th"+" prime number");
				break;
			}
		}
		System.out.println("Completed in " + (System.currentTimeMillis() - time) + "ms");
	}
}
