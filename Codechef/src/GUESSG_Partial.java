import java.util.*;
class GUESSG_Partial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            long high=val.nextInt();
            long low=1;
            long mid=0;
            String x="";
            long ch=0;
            System.out.println(low);
            System.out.flush();
            x=val.next();
            low++;
            char cho='a';
            if(x.equals("E")==false)
            {
                if(x.equals("L"))
                    cho='o';
                else
                    cho='e';
            }
            int k=2;
            switch(cho)
            {
                case 'o':
                    String y="";
                    while(y.equals("E")==false)
                    {
                        mid=(high+low)/2;
                        System.out.println(mid);
                        System.out.flush();
                        y=val.next();
                        if(y.equals("E")==false)
                        {
                            if(k%2==0)
                            {
                                if(y.equals("G"))
                                    low=mid+1;
                                else
                                    high=mid-1;
                            }
                            k++;
                        }
                    }
                    break;
                case 'e':
                    k=2;
                    String z="";
                    while(z.equals("E")==false)
                    {
                        mid=(high+low)/2;
                        System.out.println(mid);
                        System.out.flush();
                        z=val.next();
                        if(z.equals("E")==false)
                        {
                            if(k%2==1)
                            {
                                if(z.equals("G"))
                                    low=mid+1;
                                else
                                    high=mid-1;
                            }
                            k++;
                        }
                    }
                    break;
            }
        }catch(Exception t){}
    }
}
