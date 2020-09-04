import java.util.*;
import java.lang.*;
import java.io.*;
class PRICECON
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try
        {
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                int k=val.nextInt();
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    int a=val.nextInt();
                    if(a>k)
                        sum=sum+a-k;
                }
                System.out.println(sum);
            }
        }catch(Exception t){}
    }
}
