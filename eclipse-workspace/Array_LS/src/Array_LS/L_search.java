package Array_LS;

import java.util.Scanner;

public class L_search {
	public static void main(String [] args) {
		int[] arr = {12, 13, 45, 74, 92, 94, 874, 634, 2, 45, 845, 5};
		System.out.println("enter your no search in the given 12, 13, 45, 74, 92, 94, 874, 634, 2, 45, 845, 5 array: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i] == num) {
				System.out.println("Hurray! this element is in the array. \n"+" and the position is "+i);
			}
		}
		System.out.println("oops! it seems this element is not in the array.");
		
	}

}
