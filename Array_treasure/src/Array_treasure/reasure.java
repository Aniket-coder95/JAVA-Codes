/*
 *****Input*******
34
21
32
41
25
14
42
43
14
31
54
45
52
42
23
33
15
51
31
35
21
52
33
13
23*/
package Array_treasure;
import java.util.Scanner;
public class reasure {
	public static void main(String[] args) 
    { 
	 int[][] arr =new int[5][5];
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter elements of array: ");
	 for(int i=0 ; i<5 ; i++) {
		 for(int j=0 ; j<5 ;j++) {
			 arr[i][j]=scan.nextInt();
		 }
	 }
	 for(int i=0 ;i<5 ;) {
		 for(int j=0 ; j<5 ; ) {
			 if(arr[i][j]==0) {
				 System.out.println("Loop Found!");
				 return;
			 }else if((((i+1)*10)+(j+1))==arr[i][j]) {
				 System.out.println("Treasure Found!");
				 return;
			 }else {
				 System.out.print(arr[i][j]+" --> ");
				 int temp=arr[i][j];
				 arr[i][j]=0;
				 i=(temp/10)-1;
				 j=(temp%10)-1;
				 
			 }
		 }
	 }
	 
    }

}
