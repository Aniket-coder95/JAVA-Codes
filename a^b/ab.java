import java.util.*;
class kumar
{
	public static void main(String[] args)
	{

		System.out.println("Enter no for M power N :");
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res = power(m,n);
		System.out.printf(" MxN : %d",res);

	}
	static int power(int a, int b)
	{
		int result;
		if(a==0)
		{
			return 0;
		}
		if(b==0)
		{
			return 1;
		}if(b==1)
		{
			return a;
		}else
		{	
			int mid=(b/2);
			int res = power(a,mid);
			result=res*res;
		}
		if(b%2==1)//if power is a odd number
		{
			result=result*a;
		}
		return result;
		
	}
}