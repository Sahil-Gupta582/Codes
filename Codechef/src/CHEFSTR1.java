import java.util.*;
class CHEFSTR1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        while(t-->0)
        {
            int n=val.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
                arr[i]=val.nextLong();
            long sum=0;
            for(int i=0;i<n-1;i++)
            {
                long diff=arr[i]-arr[i+1];
                sum=sum+(long)Math.abs((double)diff)-1;
            }
            System.out.println(sum);
        }
    }
}
