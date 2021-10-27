/*Given an array, return length of the longest subarray of non- negative integers.

Note: Subarray here means a continuous part of the array.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. The following line contains n space separated integers forming the array.

Output:
Print the length of the longest subarray of non-negative integers.

Constraints:
1<=T<=10^5
1<=n<=10^5
1<=a[i]<=10^5

Example:
Input:
2
9
2 3 4 -1 -2 1 5 6 3
10
1 0 0 1 -1 -1 0 0 1 0

Output:
4
4
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class arr {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    for(int i=0 ; i<T ; i++){
	        int ele =scan.nextInt();
	        int[] arr = new int[ele];
	        for(int j=0 ; j<ele ;j++){
	            arr[j] = scan.nextInt();
	        }
	        Integer count =0;
	        Integer[] a = new Integer[arr.length];
	        for (int k=0 ; k<arr.length ;k++){
	            if (arr[k] >=0){
	                count++;
	                a[k] = count;
	            }else{
	                count=0;
	                a[k] = count;
	            }
	       
	        }
	        int Z = Collections.max(Arrays.asList(a));
	        System.out.println(Z);
	    }
		//code
	}
	
}
