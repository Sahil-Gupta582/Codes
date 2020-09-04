import java.util.*;
class PTMSSNG
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        while(t-->0)
        {
            int n=val.nextInt();
            int x[]=new int[4*n-1];
            int y[]=new int[4*n-1];
            for(int i=0;i<4*n-1;i++)
            {
                x[i]=val.nextInt();
                y[i]=val.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            int mx=Integer.MAX_VALUE;
            int my=Integer.MAX_VALUE;
            int prevx=x[0];
            int prevy=y[0];
            int count=1;
            for(int i=1;i<x.length;i++)
            {
                if(x[i]==prevx)
                    count++;
                else
                {
                    if(count%2!=0)
                    {
                        mx=prevx;
                        count=0;
                        break;
                    }
                    else
                    {
                        count=1;
                        prevx=x[i];
                    }
                }
            }
            if(count%2==1)
                mx=x[x.length-1];
            count=1;
            for(int i=1;i<y.length;i++)
            {
                if(y[i]==prevy)
                    count++;
                else
                {
                    if(count%2!=0)
                    {
                        my=prevy;
                        count=0;
                        break;
                    }
                    else
                    {
                        count=1;
                        prevy=y[i];
                    }
                }
            }
            if(count%2==1)
                my=y[y.length-1];
            System.out.println(mx+" "+my);
        }
    }
}
