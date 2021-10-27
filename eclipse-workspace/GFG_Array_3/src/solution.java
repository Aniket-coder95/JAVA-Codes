
/*
 Given an array A of size n of integers in the range from 1 to n, we need to find the inverse permutation of that array.
Inverse Permutation is a permutation which you will get by inserting position of an element at the position specified by
 the element value in the array. For better understanding, consider the following example:
Suppose we found element 4 at position 3 in an array, then in reverse permutation, we insert 3 (position of element 4 in
the array) in position 4 (element value).

Input:
The first line of the input contains an integer T denoting the number of test cases. For each test case, the first line contains an integer n, denoting the size of the array A  followed by n-space separated integers i.e elements of array A.

Output:
For each test case, the output is the array after performing inverse permutation on A.

Constraints:
1<=T<=100
1<=n<=50
1<=A[i]<=50
Note: Array should contain unique elements and should have elements from 1 to n. 

Example:
Input:
3
4
1 4 3 2
5
2 3 4 5 1
5
2 3 1 5 4

Output:
1 4 3 2
5 1 2 3 4
3 1 2 5 4

Explanation:
1. For element 1 we insert position of 1 from arr1 i.e 1 at position 1 in arr2. For element 4 in arr1,
we insert 2 from arr1 at position 4 in arr2. Similarly, for element 2 in arr1, we insert position of 2 i.e 4 in arr2.
2. As index 1 has value 2 so 1 will b placed at index 2, similarly 2 has 3 so 2 will be placed at index 3
 similarly 3 has 4 so placed at 4, 4 has 5 so 4 placed at 5 and 5 has 1 so placed at index 1. 
*/

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class solution {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0; i<T ; i++){
            int ele =scan.nextInt();
            int[] arr=new int[ele];
            for(int j=1 ; j<=ele ; j++){
                arr[j-1]=scan.nextInt();
            }
            StringBuilder str= new StringBuilder();
            int[] N_arr=new int[arr.length];
            for(int k=1 ; k<=arr.length ; k++){
                int temp =arr[k-1];
                N_arr[temp-1] = k;
            }
            for(int l=1 ; l<=N_arr.length ;l++){
                str.append(N_arr[l-1]+" ");
            }
            System.out.println(str);
            
        }
        
    }
}
