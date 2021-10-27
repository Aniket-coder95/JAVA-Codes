package numoccurance;

import java.util.Scanner;

public class num {
	static int count = 0;
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int number[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
		System.out.print("Enter your number b/w 0-9 here:");
		int k = inp.nextInt();
		
		method(number , k);
		
		
	}
	private static void method(int[] number, int k) {
		for(int num : number) {
			System.out.println(num);
			if (num == k && num <=9) {
				count++;
			}else if(num%10 == k) {
				count++;
			}
			if(num/10 == k) {
				count++;
			}
		}System.out.printf("the no of times " + k +" is occuured: "+count);
		
	}

}
