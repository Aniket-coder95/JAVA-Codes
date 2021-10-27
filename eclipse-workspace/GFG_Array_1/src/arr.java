import java.util.Scanner;

/*Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/
public class arr {
	public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
		 int t=s.nextInt();
		 StringBuilder res=new StringBuilder();
		 
		 for(int i=0;i<t;i++)
		 {
		     int n=s.nextInt();
		     int d=s.nextInt();
		     //System.out.println("n:"+n);
		     //System.out.println(res);
		     int r[]=new int[n];
		     int m[]=new int[n];
		     for(int j=0;j<n;j++)
		     {
		         r[j]=s.nextInt();
		         if(j>=d)
		         m[j-d]=r[j];
		         else{
		             m[n-d+j]=r[j];
		         }
		     }
		      for(int j=0;j<n;j++)
		      {
		          res.append(m[j]+" ");
		      }
		         res.append('\n');
		 }
		   System.out.println(res);
	}

}
