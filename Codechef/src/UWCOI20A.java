/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UWCOI20A
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t!=0)
            {
                int N=val.nextInt();
                long arr[]=new long[N];
                for(int i=0;i<N;i++)
                {
                    arr[i]=val.nextLong();
                }
                Arrays.sort(arr);
                System.out.println(arr[N-1]);
                t--;
            }
        }catch(Exception t){}
    }
}
