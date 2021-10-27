import java.util.*;
class solution{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int len = scan.nextInt();
		int[] array1 = new int[len];
		int[] array2 = new int[len];
		System.out.println("Enter element of 1st array: ");
		for (int i=0 ; i<len ;i++ )
		{
			array1[i] = scan.nextInt();
		}
		System.out.println("Enter element of 2nd array: ");
		for (int j=0 ; j<len ;j++ )
		{
			array2[j] = scan.nextInt();
		}
		scan.close();
		Intersection(array1,array2);
	}
	public static void Intersection(int[] arr1 , int[] arr2)
	{
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0 ;i<arr1.length;i++)
		{
			int check = arr1[i];
			for(int j=0 ;j<arr2.length;j++)
			{
				if(arr2[j]==check)
				{
					res.add(check);
					j=arr2.length;
				}
			}
		}
		System.out.println("inter section of array is: "+res);
	}
}