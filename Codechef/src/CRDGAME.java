import java.util.*;
class CRDGAME
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        while(t-->0)
        {
            int n=val.nextInt();
            int chef=0;
            int morty=0;
            for(int i=0;i<n;i++)
            {
                long a=val.nextLong();
                int suma=sumdigi(a);
                long b=val.nextLong();
                int sumb=sumdigi(b);
                if(suma>sumb)
                    chef++;
                if(sumb>suma)
                    morty++;
                if(suma==sumb)
                {
                    chef++;
                    morty++;
                }
            }
            if(chef>morty)
                System.out.println("0 "+chef);
            else
            {
                if(chef==morty)
                    System.out.println("2 "+chef);
                else
                    System.out.println("1 "+morty);
            }
        }
    }
    public static int sumdigi(long a)
    {
        int sum=0;
        while(a!=0)
        {
            sum=sum+(int)a%10;
            a=a/10;
        }
        return sum;
    }
}
