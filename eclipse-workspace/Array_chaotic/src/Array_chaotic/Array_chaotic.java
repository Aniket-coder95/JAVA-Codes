/*It's New Year's Day and everyone's in line for the
Wonderland rollercoaster ride! There are a number of people queued up,
and each person wears a sticker indicating their initial position in the queue.
Initial positions increment by 1 from 1 at the front of the line to  at the back.

Any person in the queue can bribe the person directlyin front of them to swap
positions. If two people swap positions, they still wear the same sticker denoting
their original places in line. One person can bribe at most two others. For example,
if n=8 and person 5 bribes person 4, the queue will look 
like this: 1,2,3,4,5,6,7,8.

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes
that took place to get the queue into its current state!

**********************
Function Description
************************

Complete the function minimumBribes in the editor below. It must print an integer representing
the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
_____________________________________________
minimumBribes has the following parameter(s):
_____________________________________________

q: an array of integers
_____________________________________________
Input Format
_____________________________________________


The first line contains an integer t, the number of test cases.

Each of the next t pairs of lines are as follows:
- The first line contains an integer t , the number of people in the queue
- The second line has n space-separated integers describing the final state of the queue.
______________________________________________
Constraints
_______________________________________________
* 1<=t<=10
* 1<=n<=10pow5

_____________________________________________
Subtasks
_______________________________________________

For 60% score 1<=n<=10pow3
For 100% score 1<=n<=10pow5


___________________________________________
Output Format
_______________________________________________

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.
*************************
Sample Input
**************************
2
5
2 1 5 3 4
5
2 5 1 3 4
******************
Sample Output
********************
3
Too chaotic
*/

package Array_chaotic;
import java.util.Scanner;
public class Array_chaotic {
	static void minimumBribes(int[] arr) {
        int count=0;
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i]!=(i+1))
            {
                if((i-1)>=0 && arr[i-1]==(i+1))
                {
                    int temp = arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                    count++;
                }else if((i-2)>=0 && arr[i-2]==(i+1))
                {
                    arr[i-2]=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=arr[i-2];
                    count=count+2;
                }else
                {
                    System.out.print("Too chaotic");
                    return;
                }
            }            
        }
        System.out.print("\n"+count);
        


    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = scanner.nextInt();
            }
            minimumBribes(q);
        }
        scanner.close();
    }

}
