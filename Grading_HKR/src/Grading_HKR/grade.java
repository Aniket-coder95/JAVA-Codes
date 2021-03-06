/*Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
*/
package Grading_HKR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class grade {
	public static List<Integer> gradingStudents(List<Integer> l) {
        int len=l.size();
        List<Integer> l1=new ArrayList<Integer>();
        for(int i=0 ; i<len ; i++)
        {
            int temp = l.get(i);
            if(temp<38)
            {
                l1.add(i,temp);
            }else if(temp%5==0 )
            {
                l1.add(i,temp);
            }else if((temp+1)%5==0 )
            {
                l1.add(i,temp+1);
            }  else if((temp+2)%5==0 )
            {
                l1.add(i,temp+2);
            }else
            {
                l1.add(i,temp);
            }
        }
        return l1;
    }

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
        List<Integer> grades = new ArrayList<Integer>();
        int gradesCount=scan.nextInt();
        for (int i = 0; i < gradesCount; i++) {
            grades.add(scan.nextInt());
        }

        List<Integer> result = grade.gradingStudents(grades);
        for(int x:result) 
        {
        	System.out.println(x);
        }
    }

}
