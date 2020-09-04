import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class LINCHESS {
    public static void main(String[] args)
    {
        FastScanner in=new FastScanner();
        int tt=in.nextInt();
        while(tt-->0)
        {
            int n=in.nextInt();
            long k=in.nextLong();
            long min=Long.MAX_VALUE;
            long val=-1;
            for(int i=0;i<n;i++)
            {
                long a=in.nextLong();
                if(k%a==0)
                {
                    long rem=k/a;
                    if(min>rem) {
                        min = rem;
                        val=a;
                    }
                }
            }
            System.out.println(val);
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
