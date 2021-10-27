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
		String string ="";
		for(int i=0 ; i<len ; i++)
		{
			
			if(str.charAt(i)==' ')
			{
				flag++;
				//i++;
			}else
			{
				string = string + str.charAt(i);
			}
		}
		System.out.printf("there is %d words in this sentence",flag);
		System.out.println();
		System.out.println(string);
	}
}