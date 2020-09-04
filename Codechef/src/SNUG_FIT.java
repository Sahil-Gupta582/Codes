import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SNUG_FIT
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
                int n=val.nextInt();
                long a[]=new long[n];
                long b[]=new long[n];
                for(int i=0;i<n;i++)
                {
                    a[i]=val.nextLong();
                }
                for(int i=0;i<n;i++)
                {
                    b[i]=val.nextLong();
                }
                Arrays.sort(a,0,n);
                Arrays.sort(b,0,n);
                long sum=0;
                for(int i=0;i<n;i++)
                {
                    if(a[i]<b[i])
                    {
                        sum=sum+a[i];
                    }
                    else{
                        sum=sum+b[i];
                    }
                }
                ans[k]=sum;
                k++;
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(ans[i]);
            }
        }catch(Exception t){}
    }
}
