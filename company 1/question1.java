import java.util.*;
class sol
    {
    	public static void main(String[] args)
        {
        	Scanner scan = new Scanner(System.in);
        	//System.out.println("enter no of cities");
            int n = scan.nextInt();
            //System.out.println("enter no of trips");
            int k = scan.nextInt();
        
            int res = findway(n,k-2 ,2,1);
            System.out.println("ans :"+res);
        }
        
        public static int findway(int n , int k ,int start,int count)
        {
        	if(k == 0)
            {
        	    return 1;
            }
        	for(int i=start ; i<=n ; i++)
            {
        	    if(i == start)
                {
        	        continue;
                }else
                {
            	    count += findway(n, k-1 ,i+1,count);
                }
        	
        }
        return count;
    }
}


