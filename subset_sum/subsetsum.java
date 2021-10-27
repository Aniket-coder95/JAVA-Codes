
/*
Enter length of the array:
7
Enter elements of the array:
1
Enter elements of the array:
3
Enter elements of the array:
5
Enter elements of the array:
8
Enter elements of the array:
5
Enter elements of the array:
65
Enter elements of the array:
32
Array: [1, 3, 5, 8, 5, 65, 32]
Enter the sum : 
43
subset of given sum is found in this array
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class solution
{
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0 ; i<len ; i++)
		{
			System.out.println("Enter elements of the array:");
			arr[i] = scan.nextInt();
		}
	    //int len = arr.length;
	    System.out.printf("Array: %s",Arrays.toString(arr));
	    System.out.println();
	    System.out.println("Enter the sum : ");
	    int sum = scan.nextInt();
	    //boolean check = subset(arr , len, sum);
	    if(subset(arr , len, sum) == true)
	    {
	    	System.out.println("subset of given sum is found in this array");
	    }else
	    {
	    	System.out.println("no subset found");
	    }
	}
	public static boolean subset(int[] arr , int len , int sum)
	{
		if(sum==0)
		{
			return true;
		}
		if(len==0 && sum != 0)
		{
			return false;
		}
		if(arr[len-1]>sum)
		{
			return subset(arr , len-1, sum);
		}
		
		return subset(arr, len-1, sum) || subset(arr, len-1, sum-arr[len-1]);
		
	}
	
}
