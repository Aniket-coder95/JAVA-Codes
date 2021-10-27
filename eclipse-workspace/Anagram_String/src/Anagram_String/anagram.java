/*
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
*/
package Anagram_String;
import java.util.Scanner;
public class anagram {
	static boolean isAnagram(String aa, String bb) {
        int flag=0;
        if(aa.length()==bb.length()){
            char[] A = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
            'q','r','s','t','u','v','w','x','y','z'};
            char[] B = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X','Y','Z'};
            int[] first = new int[A.length];
            int[] second = new int[B.length];
            
            for(int i=0 ; i<A.length ;i++){
                int acount=0;
                for(int j=0 ; j<aa.length();j++){
                    if(A[i]==aa.charAt(j) || B[i]==aa.charAt(j)){
                        acount++;
                        //System.out.println(aa.charAt(j));
                    }
                    //System.out.println(acount);
                }
                first[i]=acount;
            }

           // for(int z:first){
               // System.out.print(z+" ");
            //}
            //System.out.println();

            for(int i=0 ; i<B.length ;i++){
                int bcount=0;
                for(int j=0 ; j<bb.length();j++){
                    if(A[i]==bb.charAt(j) || B[i]==bb.charAt(j)){
                        //System.out.println(B[i]);
                        bcount++;
                    }
                    //System.out.println(bcount);
                    
                }second[i]=bcount;
            }
            //for(int y:second){
                //System.out.print(y+" ");
            //}
            for (int k=0 ; k<first.length;k++){
                if(first[k]==second[k]){
                    flag=1;
                }else
                {
                    flag=0;
                    k=first.length;
                }
            }
            if(flag==0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}