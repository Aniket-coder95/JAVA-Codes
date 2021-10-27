import java.util.*;

class kumar
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = s.length();
		int sum = 0 ;

		for(int i=0 ;i<len ; )
		{
			if(! Character.isLetter(s.charAt(i)) )
			{
				int x=0;
				x = Character.getNumericValue(s.charAt(i));
				int  i1 = i+1;
				while( i1<len && ! Character.isLetter(s.charAt(i1)))
				{
					System.out.println("x1 is : "+x);
					x = x*10  + Character.getNumericValue(s.charAt(i1));
					i1++;
				}
				System.out.println("x2 is : "+x);
				i = i1-1;
				sum += x;

			}
			i++;	
		} 
		System.out.println(sum);
	}
}