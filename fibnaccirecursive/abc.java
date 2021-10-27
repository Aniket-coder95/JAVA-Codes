import java.util.*;
class fib
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n here:");
		int n=scan.nextInt();
		int res=f(n-1);
		System.out.println(res);
	}
	static int f(int x)
	{
		if(x==0 || x==1)
		{
			return x;
		}else
		{
			return (f(x-1)+f(x-2));
		}
	}
}