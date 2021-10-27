
/*
Enter the length of array: 
6
Enter 1 element of array: 
1
Enter 2 element of array: 
3
Enter 3 element of array: 
5
Enter 4 element of array: 
6
Enter 5 element of array: 
5
Enter 6 element of array: 
2
sorted array is: [1, 2, 3, 5, 5, 6]
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class solution
{
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the length of array: ");
	    int len = scan.nextInt();
	    int[] arr = new int[len];
	    for(int i=0 ; i<len ; i++)
	    {
	    	System.out.println("Enter "+(i+1)+" element of array: ");
	    	arr[i] = scan.nextInt();
	    }
	    bubblesort(arr);
	}
	public static void bubblesort(int[] arr)
	{
		for(int a=1 ; a<arr.length ; a++)
		{
			int j=1;
			for(int i=0 ; i<arr.length-a ; i++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				}else
				{
					j++;
					//break;
				}
			//System.out.printf(i+" swap is: %s",Arrays.toString(arr));
			//System.out.println();
			}
		}
		System.out.printf("sorted array is: %s",Arrays.toString(arr));
		System.out.println();
	}
	
}
