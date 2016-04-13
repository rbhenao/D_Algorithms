import java.util.*;
public class BinarySearch {
	public static void main(String args[]){
		int[] a = {1,3,4,5,6,7,11,13,14,15,19};
		int key = 19;
		int imin = 0;
		int imax = a.length;
		
		String answer = BinarySearcher(a,key,imin,imax);
		System.out.println(answer);
	}
	public static String BinarySearcher(int A[], int key, int imin, int imax){
		  // test if array is empty
		  if (imax < imin)
		    // set is empty, so return value showing not found
		    return "KEY_NOT_FOUND";
		  else {
		      // calculate midpoint to cut set in half
		      int imid = (imin+imax)/2;
		      // three-way comparison
		      if (A[imid] > key)
		        // key is in lower subset
		        return BinarySearcher(A, key, imin, imid-1);
		      else if (A[imid] < key)
		        // key is in upper subset
		        return BinarySearcher(A, key, imid+1, imax);
		      else
		        // key has been found
		        return imid+"";
		     
		  }
	}
}
