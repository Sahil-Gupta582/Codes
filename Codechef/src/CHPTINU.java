/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHPINTU
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t!=0)
            {
                t--;
                int N=val.nextInt();
                int M=val.nextInt();
                HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
                int f[]=new int[N];
                int b[]=new int[N];
                for(int i=0;i<N;i++)
                    f[i]=val.nextInt();
                for(int i=0;i<N;i++)
                    b[i]=val.nextInt();
                int min=Integer.MAX_VALUE;
                for(int i=0;i<N;i++)
                {
                    if(hmap.containsKey(f[i]))
                        hmap.put(f[i],hmap.get(f[i])+b[i]);
                    else
                        hmap.put(f[i],b[i]);
                }
                for (Map.Entry entry : hmap.entrySet()) {
                    int x=Integer.valueOf(String.valueOf(entry.getValue()));
                    if(min>x)
                        min=x;
                }
                System.out.println(min);
            }
        }catch(Exception t){}
    }
}
