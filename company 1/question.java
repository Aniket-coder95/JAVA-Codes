import java.util.*;
class kum
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> l1 = new ArrayList<Integer>(4);
		ArrayList<Integer> l2 = new ArrayList<Integer>(4);
		for(int i=0 ; i<4 ; i++){
			int x = scan.nextInt(); 
			l1.add(x);
		}
		for(int j=0 ; j<4 ; j++){
			int y = scan.nextInt();
			l2.add(y);
		}
		System.out.println(l1);System.out.println(l2);

		int res = c_possible(l1,l2,Integer.MIN_VALUE , 0 ,0 );
		System.out.println("ans is : "+res);
	}
	

	static int c_possible(ArrayList<Integer> l1 , ArrayList<Integer> l2,int prev ,int index , int count) //for equal length
	{
		//System.out.println("prev is:"+prev);
		//System.out.println("index is:"+(index+1));
		//System.out.println("count is:"+(count));
		//System.out.println();

		if((index+1) > l1.size()){
			return count+=1;
		}
		else
		{
			int min=0 , max =0 ;
			if(l1.get(index) <= l2.get(index))
			{
				min = l1.get(index);
				max = l2.get(index);
			}
			else
			{
				min = l2.get(index);
				max = l1.get(index);
			}
			for(int i=min ; i<=max ; i++) //for every ele
			{
				 if(i > prev)
				 {
				 	count = c_possible(l1,l2, i , index+1,  count);
				 	//System.out.println("count111 is:"+(count));
				 }else
				 {
				 	continue;
				 }
				
			}

		}
		return count;	
	}
}




/*
you are given two list of integers l1 and l2 of same length n.
Find the count of strictly increasing sequence of integers l[0] < l[1]<....< l[n-1]
Such that,  min(l1[i] , l2[i]) <= l[i] <= max(l1[i] , l2[i]) for each i.

input 1:
l1 = [6 3 4 4]
l2 = [1 5 1 6]
output: 
4

explained:

soln possible-
1 3 4 5
1 3 4 6
2 3 4 5
2 3 4 6

so ans is 4
*/