import java.util.*;
class COVDSMPL_Partial
{
    static int dd[][];
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                int p=val.nextInt();
                dd=new int[n][n];
                int prev=0;
                for(int i=0;i<n;i++)
                {
                    int k=n;
                    prev=0;
                    for(int j=n-1;j>=0;j--)
                    {
                        System.out.println("1 "+(i+1)+" 1 "+(i+1)+" "+(j+1));
                        System.out.flush();
                        int x=val.nextInt();
                        if(x==k){
                            fill(i,j);break;}
                        if(x==(prev-1))
                            dd[i][j+1]=1;
                        if(x==0)
                            break;
                        k--;
                        prev=x;
                    }
                }
                System.out.println("2");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                        System.out.print(dd[i][j]+" ");
                    System.out.println();
                }
                System.out.flush();
                int a=val.nextInt();
                if(a==1)
                    continue;
                else
                    break;
            }
        }catch(Exception t){}
    }
    public static void fill(int r,int j)
    {
        for(int i=0;i<=j;i++)
            dd[r][i]=1;
    }
}
