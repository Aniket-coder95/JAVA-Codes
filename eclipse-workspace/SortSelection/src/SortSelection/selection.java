package SortSelection;

import java.util.Scanner;

public class selection {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Create your array :) ");
		int[] arr = new int[10];
		for (int a=0 ; a<arr.length ; a++) {
			arr[a]= scan.nextInt();
		}
		int min=0;
		int temp=0;
		for(int i =0; i<arr.length-1 ; i++) {
			min=i;
			for(int j =i+1; j<arr.length ; j++) {
			
				if(arr[j] < arr[min]) {
					min=j;
				}
				
			}
			temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			//min=i+1;
			
		}
		System.out.print("the sorted array is: {");
		for(int x:arr) {
			System.out.print(x+" ");
		}System.out.print("}");
		
	}
}
