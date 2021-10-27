package temp;

import java.util.Arrays;
import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        
        String[] str =s.split(" ");
        //String A = "";
        //for(String z:arr) {System.out.println(z);}
        String[] NEW =new String[s.length()];
        char[] symb = {'['  ,  '['  ,  '?'  ,  '.'  ,  '_'  ,  '\''  ,  '@'  ,  ']'  ,  '+'  ,  ','}  ;
        for(int n=0 ; n<NEW.length ; n++){
        	String Z="";
        	for(int i=0 ; i<str.length ;i++)
            {
            	String A=str[i];
            	
            	for (int a=0 ; a<A.length();a++) 
            	{
            		int flag=0;
            		for(int j=0 ; j<symb.length ;j++) 
            		{
                		if(A.charAt(i)!=symb[j])
                		{
                			flag=1;
                		}
                		else
                		{
                			flag=0;
                		}
                	}if(flag == 1) {Z=Z+A.charAt(a);}else {//System.out.println(); }
            	 }
             }NEW[n]=Z;
        }
        for(String G:NEW) {
        	System.out.println(G);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
