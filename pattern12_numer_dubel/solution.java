/*
Enter no. of rows: 7

 1 2 3 4 5 6 7 
  2 3 4 5 6 7 
   3 4 5 6 7 
    4 5 6 7 
     5 6 7 
      6 7 
       7 
      6 7 
     5 6 7 
    4 5 6 7 
   3 4 5 6 7 
  2 3 4 5 6 7 
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
		for(int i=1 ; i<=row ; i++) //  for uper triangle
		{
			for(int k=0 ; k<=i-1 ; k++) // create spaces before rows
			{
				System.out.print(" ");
			}
			for(int j=i ; j<=row ; j++) // print row numbers
			{
				System.out.print(j+" ");
			}
			System.out.println();			
		}
/////////////////////////////////////////////////////////////////////////
		for(int i1=row-1;i1>=1;i1--) //  for lower triangle
		{
			for(int a=i1-1 ; a>=0 ; a--) // create spaces before rows
			{
				System.out.print(" ");
			}
			for(int b=i1 ; b<=row ; b++) // print row numbers
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}
}