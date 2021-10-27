package Array_BS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class bs {
	public static void main(String[] args) {
		int[] arr = {12, 13, 74, 92, 94, 874, 634, 2, 45, 845, 5};
		System.out.println("enter your no search in the given 12, 13, 45, 74, 92, 94, 874, 634, 2, 45, 845, 5 array: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		List<Integer> ls = new ArrayList<Integer>();
		for(int x:arr) {
			ls.add(x);
		}
		System.out.println("array is"+ls+"\n");
		Collections.sort(ls);
		System.out.println("sorted array"+ls+"\n");
		
		int len = ls.size();
		int start=0;
		int mid = (start + len)/2;
		while(ls.get(mid) != num) {
			if(num < ls.get(mid) ){
				mid = (start+mid)/2;
			}else {
				start=mid;
				mid=(mid+len)/2;
				
			}
		};
		System.out.println("found it at index "+mid);
	}
}
