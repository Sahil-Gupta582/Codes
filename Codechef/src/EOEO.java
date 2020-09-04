import java.util.*;
import java.math.*;
class EOEO
{
    static BigInteger two=new BigInteger("2");
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                BigInteger n=new BigInteger(val.next());
                int x=noOFtwos(n);
                BigInteger k=two.pow(x);
                BigInteger z=n.divide(k);
                BigInteger count=z.divide(two);
                System.out.println(count);
            }
        } catch(Exception e) {}
    }
    public static int noOFtwos(BigInteger n)
    {
        int count=0;
        while(String.valueOf(n.mod(two)).equals("1")==false)
        {
            count++;
            n=n.divide(two);
        }
        return count;
    }
}