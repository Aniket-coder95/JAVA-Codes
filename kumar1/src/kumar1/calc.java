package kumar1;
import java.util.Scanner;
public class calc {
	void calculator() {
		
		double fnum, snum, ans, sym;
		int C;
		
		Scanner A = new Scanner(System.in);
		System.out.println("Enter first no: ");
		fnum = A.nextDouble();
		System.out.println("Enter second no: ");
		snum = A.nextDouble();
		System.out.println("press '+=1' or '-=2' or '/=4' or '*=3'");
		sym =A.nextDouble();
		C = (int)sym;
		switch (C) {
		case 1:
			ans = fnum + snum;
			System.out.println(ans);
			break;
		
		case 2:
			ans = fnum - snum;
			System.out.println(ans);
			break;
			
		case 3:
			ans = fnum * snum;
			System.out.println(ans);
			break;
			
		case 4:
			ans = fnum / snum;
			System.out.println(ans);
			break;
		}
	}
}
