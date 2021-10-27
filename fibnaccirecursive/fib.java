import java.util.*;
class kumar
{
	public static void main(String[] args)
	{

		System.out.println("Enter no of series for fib:");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		//int n = scan.nextInt();
		int a=0;
		int b=1;
		fib(a,b,m);
		//System.out.printf(" fibnacci is : %d",res);

	}
	static void fib(int a, int b,int m)
	{
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(m-2!=0)
		{
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			m=m-1;
		}
	}
}