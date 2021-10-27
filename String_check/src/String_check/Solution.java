/*
Sample Input:::::::::

He is a very very good boy, isn't he?
Sample Output:::::::

10
He
is
a
very
very
good
boy
isn
t
he

*******************************************
*Input (stdin)::::::::::::::::::
           YES      leading spaces        are valid,    problemsetters are         evillllll
Expected Output::::::::

8
YES
leading
spaces
are
valid
problemsetters
are
evillllll
*/package String_check;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        
        System.out.println(s);
        System.out.println(s.length());
        //String A = "";
        //for(String z:arr) {System.out.println(z);}
        String[] NEW =new String[s.length()];
        char[] symb = {'['  ,  '['  ,  '?'  ,  '.'  ,  '_'  ,  '\''  ,  '@'  ,  ']'  ,  '+'  ,  ',',' '}  ;
        int l=0;
    	String N =""; 
    	for(int i=0 ; i<s.length() ;i++)
        {
    		int flag=1;
    		for(int j=0 ; j<symb.length ; j++) 
    		{
    			if(s.charAt(i) != symb[j]) 
    			{
    				flag=0;
    			}else {
    				flag=1;
    				if(N.length()>0) {
    					NEW[l]=N;
            			l++;
    				}
    				N="";
        			break;
    			}
    		}if(flag==0) 
    		{
    			N=N+s.charAt(i);
    		}else {
    			
    		}
        }if(N.length()>0) {
			NEW[l]=N;
			l++;
		}
    	
    	
    	int count=0;
    	for(String S:NEW) {
    		if(S == null || S=="") {}else {count++;}
    		}
    	System.out.println(count);
    	for(String S:NEW) {
    		if(S == null || S=="" ) {}else {System.out.println(S);}
    		}
        
	}

}
