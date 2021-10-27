import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Solution
{
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 3, 7, 5, 2};
		int len = arr.length;
		System.out.printf("Given array is : %s",Arrays.toString(arr));
		System.out.println();
		QuickSort(arr, 0 , len );
		System.out.printf("Sorted array is: %s",Arrays.toString(arr));
		System.out.println();
		//printArray(arr);
		
		
	}
	public static int partition(int[] array,int a,int b)
	{
		int pivote =array[a];
		int i = a;
		for(int j=a+1 ; j<b ; j++)
		{
			if(array[j] <= pivote)
			{
				i=i+1;
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int t = array[i];
		array[i] = array[a];
		array[a] = t;
		return i;
	}

	public static void QuickSort(int[] ar , int x , int y)
	{
		if(x < y)
		{
			int index = partition(ar , x , y);
			QuickSort(ar ,x ,index-1);
			QuickSort(ar ,index+1,y);
		}
	}

	public static void printArray(int[] p_array)
	{
		System.out.print("Sorted Array is: ");
		for(int x : p_array)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}
}