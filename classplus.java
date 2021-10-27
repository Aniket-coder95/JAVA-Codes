import java.util.*;
import java.io.*;
import java.lang.*;

class check
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m and n :");
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<ArrayList <Integer>> universe	= new ArrayList<ArrayList<Integer>>();
		for(int i =0 ; i<m ; i++ )
		{
			universe.add(new ArrayList<Integer>());
			//System.out.println("Enter "+i+1+" row element");
			for(int j= 0 ; j<3 ; j++)
			{
				universe.get(i).add(scan.nextInt() );
			}
		}
		ArrayList<ArrayList <Integer>> demons	= new ArrayList<ArrayList<Integer>>();
		for(int i1 =0 ; i1<n ; i1++ )
		{
			//System.out.println("Enter "+(m+i1+1)+" row element");
			demons.add(new ArrayList<Integer>());
			int col = scan.nextInt();
			for(int j1= 0 ; j1<col ; j1++)
			{
				demons.get(i1).add(scan.nextInt() );
			}
		}
		//printme(demons);


		ArrayList<Integer> demon_time = new ArrayList<Integer> ();
		demon_time = findmin(demons);

		int result = findvaccine(universe , demon_time ,1 ,m);
		System.out.println();
		System.out.println();

		System.out.println(result);

	}

	public static int findvaccine(ArrayList<ArrayList <Integer>> un , ArrayList<Integer> dt , int source , int dest)
	{
		int  total_min_time_aquire = Integer.MAX_VALUE;
		for(int i = 0 ; i<un.size()  ;i++)
		{
			int min_time_aquire = Integer.MAX_VALUE;
			ArrayList<Integer> universe = un.get(i);
			if(universe.get(0) != source){
				continue;
			}
			else if(universe.get(universe.size()-2)  != dest )
			{ 
				int a =  universe.get(universe.size()-1);
				if(a  > dt.get(i) )
				{
					min_time_aquire = a + findvaccine(un , dt , universe.get(universe.size()-2) , dest);
				}else
				{
					min_time_aquire = dt.get(i) + findvaccine(un , dt , universe.get(universe.size()-2) , dest);
				}
			}else
			{
				int a =  universe.get(universe.size()-1);
				if(a  > dt.get(i) )
				{
					 return a ;
				}else
				{
					return dt.get(i);
				}
			}
			if(min_time_aquire < total_min_time_aquire)
				total_min_time_aquire = min_time_aquire;
		}
		return total_min_time_aquire;

	}









	public static ArrayList<Integer> findmin(ArrayList<ArrayList <Integer>> demons)
	{
		ArrayList<Integer> min_demon = new ArrayList<Integer> ();
		ArrayList<Integer> min = new ArrayList<Integer> ();

		for(int i=0 ; i<demons.size() ;i++)
		{
			min = demons.get(i);
			int min1 = f_min(min);
			int max1 = f_max(min);
			int z = Math.abs(min1 - max1);
			//System.out.print("min"+min1);
			//System.out.println("max"+max1);
			min_demon.add(z);
		}


		return min_demon;
	}
	public static int f_min(ArrayList <Integer> x)
	{
		int minimum = Integer.MAX_VALUE;
		if(x.size()<1)
			return 0;
		if(x.size() == 1)
		{
			return x.get(0);
		}
		else
		{
			for(int i=0 ; i<x.size() ; i++)
			{
				if(x.get(i) < minimum)
					minimum = x.get(i);
			}
		}
		return minimum;
	}
	public static int f_max(ArrayList <Integer> x)
	{
		int maximum = Integer.MIN_VALUE;
		//System.out.println("size :"+x.size());
		if(x.size()<1)
			return 0;
		if(x.size() == 1)
		{
			return x.get(0);
		}
		else
		{
			for(int i=0 ; i<x.size() ; i++)
			{
				if(x.get(i) > maximum)
					maximum = x.get(i);
			}
		}
		return maximum;
	}





	public static void printme(ArrayList<ArrayList<Integer>> x)
	{
		System.out.println("list is:");
		for(int i=0 ; i<x.size() ; i++)
		{
			for(int j = 0 ; j< x.get(i).size() ; j++){
				System.out.print(x.get(i).get(j)+" ");
			}
			System.out.println();
		}	
	}
}