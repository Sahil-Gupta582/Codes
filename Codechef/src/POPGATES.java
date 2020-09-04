/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class POPGATES
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t= val.nextInt();
            while(t!=0)
            {
                t--;
                int N=val.nextInt();
                int K=val.nextInt();
                String x="";
                for(int i=0;i<N;i++)
                    x=x+val.next();
                for(int i=0;i<K;i++)
                {
                    int n=x.length();
                    if(x.charAt(n-1)=='T'){
                        x=x.substring(0,n-1);
                    }
                    else{
                        String y="";
                        for(int j=0;j<n-1;j++)
                        {
                            if(x.charAt(j)=='T')
                                y=y+'H'+"";
                            else
                                y=y+'T'+"";
                        }
                        x=y;
                    }
                }
                int head=x.length()-x.replace("H","").length();
                System.out.println(head);
            }
        }catch(Exception t){}
    }
}
