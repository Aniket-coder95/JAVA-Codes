/**/
package oracleprob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class key {
	public static void main(String args[]){
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("enter your no: ");
			int A= inp.nextInt();
			List<Integer> mylist = new ArrayList<Integer>();
			
			while(A > 0) {
				Integer a = A%10;
				mylist.add(a);
				A = A/10;
			}
			Collections.reverse(mylist);
			System.out.print(mylist+" \n");
			Collections.sort(mylist);
			
			
			Integer arr[] = new Integer[mylist.size()];
			mylist.toArray(arr);
			int count = 0;

			for(int i=0 ; i<arr.length ; i++) {
				if(arr[i] == 0) {
					count++;
				}
			}
			int temp = arr[0];
			arr[0] = arr[count];
			arr[count] = temp;
			
			List<Integer> list1 =Arrays.asList(arr);
			for(int X:list1) {
				System.out.print(X);
			}
		}catch (Exception e) {
			System.out.println("Out of range");
		}
	}

}
