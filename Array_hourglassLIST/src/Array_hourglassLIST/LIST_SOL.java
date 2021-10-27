/***************
 Sample Input
 ***************
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

*****************
Sample Output
*****************
19

*/
package Array_hourglassLIST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIST_SOL {
	// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int len = arr.length;
        //int[][] ar= new int[len-2][len-2]; //for array
        List<List<Integer>> list = new ArrayList<List<Integer>>();// for list of list
        for(int a=0 ; a<len-2 ;a++){
            for(int i=0 ; i<len-2 ; i++){
                int s1=0,s2=0,s3=0,s=0;
                for(int j=0 ; j<3 ; j++){
                    s1=s1+arr[a][j+i];
                    s2=arr[a+1][i+1];
                    s3=s3+arr[a+2][i+j];
                }
                s=s1+s2+s3;
                list.add(new ArrayList<Integer>()); //creating space for adding sum
                list.get(a).add(i,s); //adding sum into list
                //ar[a][i]=s; //adding sum into arry
            }
        }
        int max=list.get(0).get(0);
        for(int a=0 ; a<len-2 ;a++){ 
            for(int b=0 ; b<len-2 ;b++){
                if(list.get(a).get(b)>max){ //aor array ar[a][b]>max
                    max=list.get(a).get(b); //max=ar[a][b];
                }
            }
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = scanner.nextInt();
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }

}
