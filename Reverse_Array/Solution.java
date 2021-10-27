import java.util.Arrays;
//import org.apache.commans.lang.ArrayUtils;
//import java.util.*;
class Solution
{
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.printf("Given Array is: %s",Arrays.toString(arr));
		System.out.println();
		int[] result = reverseArray(arr,arr.length);
		System.out.printf("Reversed Array is: %s",Arrays.toString(result));
		System.out.println();
	}
	public static int[] reverseArray(int[] array , int len)
	{
		int j=len-1;
		if(len%2==1)
		{
			len=len+1;
		}
		for(int i=0 ;i<len/2 ;i++)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j=j-1;
		}
		return array;
	}
}