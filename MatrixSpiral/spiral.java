import java.util.*;
class spiral
{
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("Input matrix is :  ");
		for(int i=0; i<arr.length; i++) // for printing the matrix
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		List<Integer> array = new ArrayList<Integer>();
		array = spiralOrder(arr); //calling spiralorder method
		System.out.println("Spiral array is :  "+Arrays.asList(array));

	}
	public static List<Integer> spiralOrder(int[][] arr) //code for spiral matrix
    {
        List<Integer> array = new ArrayList<Integer>();
        
        int top=0, down=arr.length-1, left=0, right=arr[0].length-1, direct=0;
        
        while(top<=down && left<=right)
        {
            if ( direct == 0 )
            {
                for ( int i=left; i<=right; i++ )
                {
                    //System.out.print(arr[top][i]+" ");
                    array.add(arr[top][i]);
                }
                top+=1;
            }
            
            else if ( direct == 1 )
            {
                for (  int i=top; i<=down; i++   )
                {
                   // System.out.print(arr[i][right]+" ");
                    array.add(arr[i][right]);
                }
                right-=1;
            }
            
            else if ( direct == 2 )
            {
                for (  int i=right; i>=left; i--   )
                {
                   // System.out.print(arr[down][i]+" ");
                    array.add(arr[down][i]);
                }
                down-=1;
            }
            
            else if ( direct == 3 )
            {
                for (  int i=down; i>=top; i-- )
                {
                    //System.out.print(arr[i][left]+" ");
                    array.add(arr[i][left]);
                }
                left+=1;
            }
            direct=(direct+1)%4;
            //System.out.println("direct: "+direct);
        }
        return array;
    }
}