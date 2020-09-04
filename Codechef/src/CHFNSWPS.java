import java.util.*;
class CHFNSWPS
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        while(t-->0)
        {
            int n=val.nextInt();
            HashMap<Long,Integer> a=new HashMap<Long,Integer>();
            HashMap<Long,Integer> b=new HashMap<Long,Integer>();
            List<Long> diffa=new ArrayList<Long>();
            List<Long> diffb=new ArrayList<Long>();
            long min=Long.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                long x=val.nextLong();
                if(min>x)
                    min=x;
                if(a.containsKey(x))
                    a.put(x,a.get(x)+1);
                else
                    a.put(x,1);
            }
            for(int i=0;i<n;i++)
            {
                long x=val.nextLong();
                if(min>x)
                    min=x;
                if(b.containsKey(x))
                    b.put(x,b.get(x)+1);
                else
                    b.put(x,1);
            }
            int flag=0;
            int dist=0;
            long cost=0;
            for(Map.Entry entry : a.entrySet())
            {
                long x=(long)entry.getKey();
                int z=(int)entry.getValue();
                if(b.containsKey(x))
                {
                    int y=b.get(x);
                    if(z==y)
                    {
                        a.put(x,0);
                        b.put(x,0);
                    }
                    else
                    {
                        int w=(z<y)?z:y;
                        a.put(x,z-w);
                        b.put(x,y-w);
                        if((z-w)!=0)
                        {
                            if((z-w)%2==1)
                                flag=-1;
                            else
                            {
                                for(int i=0;i<(z-w)/2;i++)
                                    diffa.add(x);
                            }
                        }
                    }
                }
                else
                {
                    if(z%2==0)
                    {
                        for(int i=0;i<z/2;i++)
                            diffa.add(x);
                        dist=dist+z;
                    }
                    else
                    {
                        flag=-1;
                        break;
                    }
                }
            }
            if(flag!=-1)
            {
                for(Map.Entry entry : b.entrySet())
                {
                    long x=(long)entry.getKey();
                    int z=(int)entry.getValue();
                    if(z!=0)
                    {
                        if(z%2==1)
                        {
                            flag=-1;
                            break;
                        }
                        else
                        {
                            for(int i=0;i<z/2;i++)
                                diffb.add(x);
                            dist=dist+z;
                        }
                    }
                }
            }
            if(flag!=-1)
            {
                Collections.sort(diffa);
                Collections.sort(diffb);
                long oo=2*min;
                int index=diffb.size()-1;
                for(int i=0;i<diffa.size();i++)
                {
                    long m=(diffa.get(i)<diffb.get(index))?diffa.get(i):diffb.get(index);
                    if(m<oo)
                        cost=cost+m;
                    else
                        cost=cost+oo;
                    index--;
                }
                System.out.println(cost);
            }
            else
                System.out.println(flag);
        }
    }
}
