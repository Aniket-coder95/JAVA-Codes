import java.util.*;
class kumar
{
	public static void main(String[] args)
	{

		//System.out.println("Enter no for gcd m and n:");
		int [] array = {1,3,9,6,90,79,78,54,35,43};
		int i=0;
		int j=array.length-1;
		int res = mn(array,i,j);
		System.out.printf(" max in array : %d",res);

	}
	static int mn(int []array,int i, int j)
	{
		int max;
		if(i==j)
		{
			return array[i];
		}
		if(i==j-1)
		{
			if(array[i]>array[j])
			{
				return array[i];
			}else
			{
				return array[j];
			}
		}else
		{
			
			int mid=(i+j)/2;
			int max1 = mn(array,i,mid);
			int max2 = mn(array,mid+1,j);
			if(max1>max2)
			{
				max = max1;
			}else
			{
				max = max2;
			}
		}
		return max;
		
	}
}