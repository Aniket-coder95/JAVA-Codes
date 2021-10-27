/****************
  Sample Input
*****************
5 4
1 2 3 4 5
****************
Sample Output
****************

5 1 2 3 4
_______________
Explanation
_______________

When we perform  left rotations, the array undergoes the following sequence of changes:
[1,2,3,4,5]-->[2,3,4,5,1]-->[3,4,5,1,2]-->[4,5,1,2,3]-->[5,1,2,3,4]
*/
package Array_reverse;

import java.util.Scanner;

public class sol {
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        for(int i=0; i< d ;i++){
            int temp=a[0];
            for(int j=0 ; j<a.length-1 ;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=temp;
        }
        return a;


    }
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int d = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =scanner.nextInt();
        }
        scanner.close();
        int[] result = rotLeft(a, d);
        System.out.println("The output array is:");
        System.out.print("{ ");
        for (int X:result) {
        	System.out.print(X+" ");
        	
            }
        System.out.print("}");
        }

        
        
    }
