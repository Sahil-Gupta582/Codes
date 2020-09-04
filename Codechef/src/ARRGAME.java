import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

class ARRGAME{
    public static void main(String[] args)
    {
        FastScanner in=new FastScanner();
        int T=in.nextInt();
        while(T-->0)
        {
            int n=in.nextInt();
            int[] arr=in.readArray(n);
            int maxZerorep=0;
            int count=0;
            int devta=0;
            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                    count++;
                else
                {
                    maxZerorep=Math.max(maxZerorep, count);
                    if(count!=0)
                        list.add(count);
                    count=0;
                }
            }
            maxZerorep=Math.max(maxZerorep, count);
            if(count!=0)
                list.add(count);
            if(maxZerorep%2==0)
                System.out.println("No");
            else
            {
                int flag=0;
                int rep=0;
                for(int i:list)
                {
                    if(i!=maxZerorep && i>=(maxZerorep+1)/2)
                    {
                        flag=1;
                        break;
                    }
                    if(i==maxZerorep)
                        rep++;
                }
                if(flag==1)
                    System.out.println("No");
                else
                {
                    if(rep>1)
                        System.out.println("No");
                    else
                        System.out.println("Yes");
                }
            }
        }
    }

    static final Random random=new Random();

    static void ruffleSort(int[] a) {
        int n=a.length;//shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
