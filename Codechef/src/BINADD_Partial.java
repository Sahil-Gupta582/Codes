/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class BINADD_Partial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            int ans[]=new int[t];
            int k=0;
            while(k!=t)
            {
                String n1=val.next();
                String n2=val.next();
                int a=Integer.parseInt(n1,2);
                int b=Integer.parseInt(n2,2);
                int c=0;
                while(b>0)
                {
                    int u=a^b;
                    int v=a&b;
                    a=u;
                    b=v*2;
                    c++;
                }
                ans[k]=c;
                k++;
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(ans[i]);
            }
        }catch(Exception t){}
    }
}
