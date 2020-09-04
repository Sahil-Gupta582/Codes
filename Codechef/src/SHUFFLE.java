import java.util.*;
class SHUFFLE
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner val=new Scanner(System.in);
            int test=val.nextInt();
            while(test-->0)
            {
                int n=val.nextInt();
                int k=val.nextInt();
                int ans=0;
                HashMap<Long,Integer> hmap=new HashMap<Long,Integer>();
                long arr[]=new long[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=val.nextLong();
                    hmap.put(arr[i],i);
                }
                Arrays.sort(arr);
                for(int i=0;i<n;i++)
                {
                    int a=hmap.get(arr[i]);
                    int x=(int)(Math.abs((double)(i-a)));
                    if(x!=0 && x<k)
                        ans=1;
                }
                if(ans==1)
                    System.out.println("no");
                else
                    System.out.println("yes");
            }
        }catch(Exception t){}
    }
}
