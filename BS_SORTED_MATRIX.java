import java.util.*;
import java.lang.*;
class kumar
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value to find");
		int x  = scan.nextInt();
		int[][] arr = {{1,3,5,7},
					   {10,11,16,20},
					   {23,30,34,60}};
		int[] arr1 = new int[4];
		for(int i =0 ; i< arr.length ; i++)
		{
			arr1 = arr[i];
			if(x > arr[i][3])
			{
				continue;
			}else
			{
			
				System.out.println(Arrays.toString(arr1));
				int j =binarysearch(0 , arr1.length-1  , arr1 , x);
				System.out.println(" index is--> "+i+","+j);
				i=arr.length;
			}
		}

	}
	
	static int binarysearch(int start , int end , int[] arr , int x)
	{
		//System.out.println(start+" --> "+end  +"    "+arr[start]);
			if(start == end)
			{
				if(arr[start]==x)
				{
					return start;
				}else
				{
					System.out.println("not found");
					return -1;
				}
			}else
			{
				int mid = (start +end)/2;
				//System.out.println(mid);

				if((arr[mid])==x)
				{
					System.out.println("yes found");
					return mid;
				}

				else if(x < arr[mid])
				{
					return binarysearch(start , mid-1 ,arr , x);
				}
				
				else if (x > arr[mid])
				{
					return binarysearch(mid+1 , end , arr,x);
				}
			}
		
			
		
		System.out.println("not found");
		return -1;
	}
}
