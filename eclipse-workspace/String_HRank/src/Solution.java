/*Sample Input

welcometojava
3


Sample Output

ava
wel
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        int len=s.length();
        String smallest = "";
        String largest = "";
        for(int i=0 ; i<len-2 ; i++){
            String string = s.substring(i,i+k);
            if(i==0){
                smallest=s.substring(i,i+k);
            }
            if(string.substring(0,1).compareTo(largest)>0){
                 largest = string;
             }else if(string.substring(0,1).compareTo(smallest)<0){
                 smallest = string;
             }
                 
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}