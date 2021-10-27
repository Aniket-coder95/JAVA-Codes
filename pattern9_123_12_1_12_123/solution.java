/*
Enter no. of rows: 7

1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7    
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
		for(int i=row ; i>=1 ; i--)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i1=1 ; i1<=row-1 ; i1++)
		{
			for(int j1=1 ; j1<=i1+1 ; j1++)
			{
				System.out.print(j1+" ");
			}
			System.out.println();
		}
	}
}