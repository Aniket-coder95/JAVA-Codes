package SortInsertion;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Create your array :) ");
		int[] arr = new int[10];
		for (int a=0 ; a<arr.length ; a++) {
			arr[a]= scan.nextInt();
		}
		
		int[] sorted=new int[arr.length];
		int temp=0;
		sorted[0]=arr[0];
		for(int b=1; b<arr.length ; b++) {
			sorted[b]=arr[b];
			for(int c=b; c>0 ; c--) {
				if(sorted[c]<sorted[c-1]) {
					temp = sorted[c-1];
					sorted[c-1]=sorted[c];
					sorted[c]=temp;
				}
			}
		}
		System.out.print("the sorted array is: {");
		for(int x:sorted) {
			System.out.print(x+" ");
		}System.out.print("}");
			
	}
}
