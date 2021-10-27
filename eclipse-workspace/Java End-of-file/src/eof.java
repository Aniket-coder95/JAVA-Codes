import java.util.Scanner;
public class eof {
	static String a = "";
    public static void main(String[] args) {
    	Scanner inp = new Scanner(System.in);
        int i = 1;
        while(inp.hasNext()){
        	a = inp.nextLine();
        	System.out.print(i+" "+a+"\n");
        	i++;
        }
            
 
	    }

}
