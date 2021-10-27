import java.util.Scanner;
import java.util.Arrays;

class Solution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the array:");
		int len = input.nextInt();
		System.out.println("Enter elements of the array:");
		int[] arr = new int[len];
		for(int i=0 ; i<len ; i++)
		{
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int prev = arr[0];
		int[] res = new int[len];
		res[0]=prev;
		for(int j=1 ; j<arr.length ; j++)
		{
			if(arr[j] != prev)
			{
				res[j] = arr[j];
				prev=res[j];
			}else
			{
				prev=arr[j];
			}
		}
		System.out.printf("your array is %s",Arrays.toString(arr)+"\n");
		System.out.printf("your array after removing repeted elements is %s",Arrays.toString(res)+"\n");

		
	}
}