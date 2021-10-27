import java.util.*;
class Sol
{
    public static void main(String[] args)
    {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Checking armstrong no (btw 0-1000)......");
        for(int i=1 ; i<1000; i++)
        {
            int sum=0;
            int a=i;
            while(a>0)
            {
                int x = a%10;
                sum = sum+(x*x*x);
                a=a/10;
            }
            if(sum == i)
            {
                System.out.println(i+" ");
            }
        }
   }
}

//**********************************************************************
/*
Checking armstrong no (btw 0-1000)......
1 
153 
370 
371 
407 
*/
