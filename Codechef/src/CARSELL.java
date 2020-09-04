import java.util.*;
class CARSELL
{
    public static void main(String args[])
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                long p[]=new long[n];
                for(int i=0;i<n;i++)
                    p[i]=val.nextLong();
                Arrays.sort(p);
                long profit=0;
                long k=0;
                for(int i=n-1;i>=0;i--)
                {
                    if(p[i]>0)
                    {
                        long x=p[i]-k;
                        if(x>0){
                            profit=profit+x;
                            k++;}
                    }
                }
                profit=profit%1000000007;
                System.out.println(profit);
            }
        }catch(Exception t){}
    }
}