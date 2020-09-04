
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class MODEFREQ {
    public static void main(String[] args)
    {
        FastScanner in=new FastScanner();
        int T=in.nextInt();
        while(T-->0)
        {
            int n=in.nextInt();
            int[] arr=in.readArray(n);
            int[] count=new int[10000+1];
            for(int i=0;i<n;i++)
                count[arr[i]]++;
            Arrays.sort(count);
            int max=0;
            int ans=0;
            int[] count2=new int[10000+1];
            for(int i=0;i<count.length;i++)
            {
                if(count[i]!=0)
                    count2[count[i]]++;
            }
            for(int i=0;i<count2.length;i++)
            {
                if(count2[i]>max) {
                    ans=i;
                    max=count2[i];
                }
            }
            System.out.println(ans);
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
