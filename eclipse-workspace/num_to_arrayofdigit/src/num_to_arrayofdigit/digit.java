package num_to_arrayofdigit;

import java.util.Scanner;

public class digit {
	public static void main(String[] args) {
		System.out.println("enter your no here b/w 0 to 9: ");
		Scanner inp = new Scanner(System.in);
		int value =inp.nextInt();
		int countval=0;
		int[] arr = {1232 , 3423, 342, 45, 332, 443, 432};
		int[] ar= new int[10];
		for(int i=0; i<arr.length ; i++) {
			int w=arr[i];
			while(w>0) {
				for(int j=0 ;j<ar.length ; j++) {
					
					ar[j]=w%10;
					w=w/10;
				}
				
			}
			int count = 0;
			for (int k=0 ;k<ar.length ;k++) {
				if(ar[k] == value) {
					count++;
				}
			}
			countval+=count;
		}
		System.out.println("count:"+countval);
	}

}
