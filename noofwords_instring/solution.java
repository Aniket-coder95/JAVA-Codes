import java.util.*;
class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your sentence here: ");
		String str = scan.nextLine();
		int len = str.length();
		int flag = 1;
		for(int i=0 ; i<len ; i++)
		{
			
			if(str.charAt(i)==' ')
			{
				flag++;
				i++;
			}
		}
		System.out.printf("there is %d words in this sentence",flag);
		System.out.println();
	}
}