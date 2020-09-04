import java.util.*;
import java.lang.*;
import java.io.*;
class XYSTR
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try
        {
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                String x=val.next();
                String y="yx";
                String z="xy";
                int max=0;
                if(x.contains(y))
                {
                    String a=x.replace(y,"");
                    max=max+x.length()-a.length();
                    x=a;
                }
                if(x.contains(z))
                {
                    String b=x.replace(z,"");
                    max=max+x.length()-b.length();
                }
                System.out.println(max/2);
            }
        }catch(Exception t){}
    }
}
