/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class CASH
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            long ans[]=new long[t];
            int k=0;
            while(k!=t)
            {
                long n=val.nextLong();
                long d=val.nextLong();
                long sum=0;
                for(long i=0;i<n;i++)
                {
                    sum=sum+val.nextLong();
                }
                ans[k]=sum%d;
                k++;
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(ans[i]);
            }
        }catch(Exception t){}
    }
}
