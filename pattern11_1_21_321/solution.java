/*
Enter no. of rows: 7

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1    
*/
import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int row = scan.nextInt();
		System.out.println();
		for(int i=1 ; i<=row ; i++)
		{
			for(int j=i ; j>=1 ; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();			
		}
		
	}
}