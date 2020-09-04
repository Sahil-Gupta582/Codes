import java.util.*;
class COVIDLQ
{
    public static void main(String args[])
    {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            while(t-->0)
            {
                int n=val.nextInt();
                String s="";
                for(int i=0;i<n;i++)
                    s=s+String.valueOf(val.nextInt());
                int pos=0;
                int temp=0;
                int flag=0;
                int count=0;
                while(pos!=s.length())
                {
                    if(count==0)
                    {
                        temp=s.indexOf('1');
                        count++;
                    }
                    else
                    {
                        pos=s.indexOf('1',temp+1);
                        count++;
                        if(pos!=-1 && pos-temp<6)
                        {
                            flag=1;
                            break;
                        }else
                            temp=pos;
                    }
                    if(pos==-1)
                        pos=s.length();
                }
                if(flag==1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }catch(Exception t){}
    }
}