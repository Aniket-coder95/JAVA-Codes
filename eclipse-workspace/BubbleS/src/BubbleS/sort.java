package BubbleS;
import java.util.Scanner;
public class sort {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Create your array :) ");
		int[] arr = new int[10];
		for (int i=0 ; i<arr.length ; i++) {
			arr[i]= scan.nextInt();
		}
		
		for(int j=0 ; j<arr.length ; j++ ) {
			int temp=0,flag=0;
			for(int k=0 ; k<arr.length-1-j ; k++) {
				if(arr[k] > arr[k+1]) {
					temp = arr[k+1];
					arr[k+1]=arr[k];
					arr[k]=temp;
					flag = 1;
				}
			}
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
	}

}
