package fileexp;
import java.io.File;

public class head {
	public static void main(String[] args) {
		File x = new File("C:\\Users\\kuman\\Desktop\\MyCalc.txt");
		
		if(x.exists()) {
			System.out.println(x.getName()+"exist!");
		}else{
			System.out.println("no such file is found.");
			}
	}

}
