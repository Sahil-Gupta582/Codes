import java.util.*;
import java.lang.*;
class STRNO
{
    static int kFactors(long n, long k)
    {
        ArrayList<Long> P = new ArrayList<Long>();
        while (n % 2 == 0)
        {
            P.add((long)2);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i = i + 2)
        {
            while (n % i == 0)
            {
                n = n / i;
                P.add(i);
            }
        }
        if (n > 2)
            P.add(n);
        if(P.size()<k)
            return -1;
        else
            return 1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                long x=val.nextLong();
                long k=val.nextLong();
                int z=kFactors(x, k);
                if(z==1)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
        }catch(Exception t){}
    }
}
