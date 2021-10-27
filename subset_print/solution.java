/* 
Enter length of array 4
Enter element of array 3
Enter element of array 2
Enter element of array 4
Enter element of array 1
Your array is [3, 2, 4, 1]
Subsets of array is: 
{ }
{ 3 }
{ 2 }
{ 3 2 }
{ 4 }
{ 3 4 }
{ 2 4 }
{ 3 2 4 }
{ 1 }
{ 3 1 }
{ 2 1 }
{ 3 2 1 }
{ 4 1 }
{ 3 4 1 }
{ 2 4 1 }
{ 3 2 4 1 }   
*/
import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0 ; i<len ; i++)
		{
			System.out.print("Enter element of array ");
			arr[i] = scan.nextInt();
		}
		System.out.printf("Your array is %s",Arrays.toString(arr)+"\n");
		scan.close();
		printsubsets(arr);
	}
	public static void printsubsets(int[] array)
	{
		int len = array.length;
		System.out.println("Subsets of array is: ");
		for(int i=0 ; i<(1<<len) ; i++) //for loop 0 to 2^len
		{
			int m=1;
			System.out.print("{ ");
			for(int j=0 ; j<len ; j++)
			{
				if( (i&m) > 0 )
				{
					System.out.print(array[j]+" ");
				}
				m=m<<1;
			}
			System.out.println("}");
		}
	}
}




//for string array
/*
import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array ");
		int len = scan.nextInt();
		String[] arr = new String[len];
		for(int i=0 ; i<len ; i++)
		{
			System.out.print("Enter element of array ");
			arr[i] = scan.next();
		}
		System.out.printf("Your array is %s",Arrays.toString(arr)+"\n");
		scan.close();
		printsubsets(arr);
	}
	public static void printsubsets(String[] array)
	{
		int len = array.length;
		System.out.println("Subsets of array is: ");
		for(int i=0 ; i<(1<<len) ; i++) //for loop 0 to 2^len
		{
			int m=1;
			System.out.print("{ ");
			for(int j=0 ; j<len ; j++)
			{
				if( (i&m) > 0 )
				{
					System.out.print(array[j]+" ");
				}
				m=m<<1;
			}
			System.out.println("}");
		}
	}
}
*/