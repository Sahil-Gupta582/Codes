import java.util.*;
import java.lang.*;
import java.io.*;
class CHEFICRM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                int arr[]=new int[n];
                int max=0;
                for(int i=0;i<n;i++)
                {
                    arr[i]=val.nextInt();
                    if(arr[i]>max)
                        max=arr[i];
                }
                if(max==10)
                {
                    int cc[]=new int[2];
                    if(arr[0]!=5)
                        System.out.println("NO");
                    else
                    {
                        cc[0]=1;
                        int flag=1;
                        for(int i=1;i<n;i++)
                        {
                            int a=arr[i];
                            if(a==15)
                            {
                                if(cc[1]>=1)
                                {cc[1]--;
                                    cc[2]++;
                                }
                                else
                                {
                                    if(cc[0]>=2)
                                    {cc[0]=cc[0]-2;cc[2]++;}
                                    else
                                    {
                                        flag=0;break;
                                    }
                                }
                            }
                            if(a==10)
                            {
                                if(cc[0]>=1)
                                {cc[0]--;cc[1]++;
                                }else
                                {
                                    flag=0;
                                    break;
                                }
                            }
                            if(a==5)
                                cc[0]++;
                        }
                        if(flag==0)
                            System.out.println("NO");
                        else
                            System.out.println("YES");
                    }}
                else
                {
                    check(arr);
                }
            }
        }catch(Exception t){}
    }
    public static void check(int arr[])
    {
        int mycoin=0;
        int flag=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==5)
            {
                mycoin+=5;
                continue;
            }
            int temp=arr[i]-5;
            if(temp>mycoin)
            {
                flag=0;
                break;
            }
            else
                mycoin=mycoin-temp+5;
        }
        if(flag==0)
            System.out.println("NO");
        if(flag==1)
            System.out.println("YES");
    }
}
