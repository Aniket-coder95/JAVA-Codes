import java.util.*;

class check
{
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[100][2];
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[0].length ; j++)
			{
				arr[i][j] = r.nextInt();
				System.out.print(arr[i][j]); 
			}
			System.out.println();
		}


		int x = scan.nextInt();
		int y = scan.nextInt();
		int x_min = arr[0][0] , y_min = arr[0][1];
		int x_close = 0 , y_close = 0;

		for(int k =0 ; k<arr.length ; k++)
		{
			if(Math.abs(arr[k][0])-x < x_min)
			{
				x_min = arr[k][0]-x;
				x_close = arr[k][0];
			}
		}
		for(int l =0 ; l<arr.length ; l++)
		{
			if(Math.abs(arr[l][1])- y < y_min)
			{
				y_min = arr[l][1]-y;
				y_close = arr[l][1];
			}
		}
		System.out.println(x_close+","+y_close);

	}
}