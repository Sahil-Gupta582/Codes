import java.util.*;
class ANSLEAK_Partial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                int m=val.nextInt();
                int k=val.nextInt();
                int arr[][]=new int[n][k];
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<k;j++)
                        arr[i][j]=val.nextInt();
                }
                int a=1;
                for(int i=0;i<n;i++){
                    if(a!=m){
                        System.out.print(a+" ");
                        a++;
                    }
                    else
                    {
                        System.out.print(a+" ");
                        a=1;
                    }
                }
            }
        }catch(Exception t){}
    }
}
