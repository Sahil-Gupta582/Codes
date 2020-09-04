import java.util.*;
class FFL
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int test=val.nextInt();
            while(test-->0)
            {
                int i=0;
                int n=val.nextInt();
                int p=100-val.nextInt();
                int arr[]=new int[n];
                int brr[]=new int[n];
                for(i=0;i<n;i++)
                    arr[i]=val.nextInt();
                for(i=0;i<n;i++)
                    brr[i]=val.nextInt();
                int min1=100;
                int min2=100;
                for(i=0;i<n;i++)
                {
                    if(brr[i]==0)
                    {
                        if(arr[i]<min1)
                            min1=arr[i];
                    }
                    else
                    {
                        if(arr[i]<min2)
                            min2=arr[i];
                    }
                }
                if((min1+min2)<=p)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }catch(Exception t){}
    }
}
