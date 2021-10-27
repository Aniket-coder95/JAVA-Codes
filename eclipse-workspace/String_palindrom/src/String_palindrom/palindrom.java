package String_palindrom;

import java.util.Scanner;

public class palindrom {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] str=new char[A.length()];
        for(int i=0; i<A.length();i++ ){
            str[i] =A.charAt(i);
        }
        int flag=0;
        for(int j=0; j<str.length ; j++){
            if(str[j]==str[str.length-j-1]){
                flag=1;
            }else{
                flag=0;
            }
            if(j==str.length-j-1){
                j=str.length;
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }

}
