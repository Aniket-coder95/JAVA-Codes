/*Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
////////Sample Output////////
 
74
52
37
ERROR!
ERROR!*/


package ARRAY_Error;

import java.util.ArrayList;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) 
    {
        int row=0,col=0,query=0;
        Scanner scan = new Scanner(System.in);
        row=scan.nextInt();
        ArrayList[] arr =new ArrayList[row];
        for(int i=0 ; i<row ; i++)
        {
            col=scan.nextInt();
            arr[i] =new ArrayList();
            for(int j=0;j<col;j++)
            {
                arr[i].add(scan.nextInt());
            }
        }//System.out.println();
        query=scan.nextInt();
        for(int i=0 ; i<query ; i++)
        {
            int r=scan.nextInt();
            int c=scan.nextInt();
            try
            {
                System.out.println(arr[r-1].get(c-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        //scan.close();
    }

}
