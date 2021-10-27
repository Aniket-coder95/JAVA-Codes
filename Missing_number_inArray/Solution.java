
import java.util.Scanner;
import java.util.*;
class Solution
{
	public static void main(String[] args)
	{
		FindMissing(new int[] {1, 2, 3, 6} , 6);
		FindMissing(new int[] {1, 6} , 6);
		FindMissing(new int[] {1, 2, 3, 4, 5, 6} , 6);
		FindMissing(new int[] {} , 6);
		FindMissing(new int[] {1, 7, 3, 6} , 7);
		FindMissing(new int[] {1, 2, 3, 5, 6} , 8);
		FindMissing(new int[] {1, 2, 3, 8, 6} , 9);
		FindMissing(new int[] {1, 2, 3, 7, 8, 6} , 10);
		
	}
	public static void FindMissing(int[] arr , int num)
	{
		int Count_missing= num-arr.length;
		BitSet Bset = new BitSet(num);
		for(int element:arr)
		{
			Bset.set(element-1);
		}
		System.out.printf("In array %s, till number %d missing number is %n",Arrays.toString(arr),num);
		int LastMissingIndex=0;
		for(int i=0 ; i<Count_missing ; i++)
		{
			LastMissingIndex = Bset.nextClearBit(LastMissingIndex);
			//System.out.printf("index is",LastMissingIndex);
			System.out.println(++LastMissingIndex);
		}

	}
	
}
