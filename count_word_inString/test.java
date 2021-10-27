import java.util.*;

class kumar
{
	public static void main(String [] args)
	{
		//Scanner scan = new Scanner(System.in);
		String s =  "hello kumar, my name is kumar! hello what is your name ";  //scan.nextLine();
		System.out.println("inout is : "+s);
		String[] arr  = s.split(" ");
		int len = arr.length;
		HashMap<String ,Integer> h = new HashMap<String , Integer>();

		for(int i=0 ;i<len ; i++)
		{
			String word1 = trim_me(arr[i]);
			int count =0; 
			for(int j=0 ;j<len ; j++)
			{
				String word2 = trim_me(arr[j]);
				if(word1.equals(word2))
				{
					count++;
				}
			}
			h.put(word1 , count);
				
		} 
		//System.out.println(h);
		//for print as string
		newPrint(h);
	}


	public static String trim_me(String s)
	{
		if(s == null)
			return null;
		String res = "";
		for(int i=0 ;i < s.length() ; i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				res+= s.charAt(i);
			}
		}
		return res;
	}


	public static void newPrint( HashMap<String , Integer> h )
	{
		String res = "";
		Iterator h_iterator = h.entrySet().iterator();
		while(h_iterator.hasNext() )
		{
			Map.Entry h_element = (Map.Entry)h_iterator.next();

			int x =(int) h_element.getValue();
			 
			String s =(String) h_element.getKey();
			res += s+" : "+x+",\n";
		}
		System.out.println("output is  : ");
		System.out.print(res);
	}


}