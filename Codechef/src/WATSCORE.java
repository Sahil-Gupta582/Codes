/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class WATSCORE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            int arr[]=new int[t];
            int k=0;
            while(k!=t)
            {
                int sum=0;
                int n=val.nextInt();
                HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
                for(int i=0;i<n;i++)
                {
                    int x=val.nextInt();
                    int y=val.nextInt();
                    Integer z=hmap.get(x);
                    if(hmap.get(x)==null)
                    {
                        hmap.put(x,y);
                    }
                    else{
                        hmap.put(x,Math.max(z,y));
                    }
                }
                for(int i=1;i<9;i++)
                {
                    if(hmap.get(i)!=null)
                    {
                        sum=sum+hmap.get(i);
                    }
                }
                arr[k]=sum;
                k++;
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(arr[i]);
            }}catch(Exception t){}
    }
}
