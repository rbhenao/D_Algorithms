/*
 * merge sort
 * complexity of O(log(n)n)
 */
public class mergeSort {
	public static void main(String args[]){
		int[] list  = {3,9,1,8,7,15,22,19,4,7,8,2,24};
		
		int[] answer = mergeSort(list);
	}
	public static int[] mergeSort(int[] A){
		if(A.length == 1){
			return A;
		}
		double length = (double) A.length;
		double mid = length/2;
		int[] left = new int[(int)Math.floor(mid)];
		int[] right = new int[(int)Math.ceil(mid)];
		
		for(int i = 0;i<Math.floor(mid);i++){
			left[i]  = A[i];
		}
		for(int j = (int)Math.floor(mid);j<A.length;j++){
			//right[0] = A[0];
		}
		
		int[] Q = merge(mergeSort(left),mergeSort(right));
		return Q;
		
	}
	public static int[] merge(int[] A, int[] B){
		//new array which will be in order
		int[] C = new int[(A.length)+(B.length)];
		int index = 0;
		
		//whiles A and B still have elements add them in order to C
		while( A.length != 0 && B.length != 0){
			if(A[0] < B[0]){
				C[index] = A[0];
				if(A.length > 1){
					int[] temp = new int[A.length-1];
					for(int i =1;i<A.length;i++){
						temp[i-1] = A[i];
					}
					A = temp;
				}else{
					A = new int[0];
				}
				index++;
			}else{
				C[index] = B[0];
				if(B.length > 1){
					int[] temp1 = new int[B.length-1];
					for(int j = 1;j<B.length;j++){
						temp1[j-1] = B[j];
					}
				}else{
					B = new int[0];				
				}
				index++;
			}
		}
		if(A.length > 0){
			for(int k = index,n=0;k<A.length;k++,n++){
				C[k] = A[n];
			}
		}
		if(B.length > 0){
			for(int s = index,t=0;s<A.length;s++,t++){
				C[s] = A[t];
			}
		}
		return C;
	}
	
}