import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
            Solution.solve(in, out);
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] readArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = nextInt();
            return arr;
        }

        static long gcd(long x, long y) {
            if (x == 0)
                return y;
            if (y == 0)
                return x;
            long r = 0, a, b;
            a = Math.max(x, y);
            b = Math.min(x, y);
            r = b;
            while (a % b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }

        static long modulo(long a, long b, long c) {
            long x = 1, y = a % c;
            while (b > 0) {
                if (b % 2 == 1)
                    x = (x * y) % c;
                y = (y * y) % c;
                b = b >> 1;
            }
            return x % c;
        }

        public static void debug(Object... o) {
            System.err.println(Arrays.deepToString(o));
        }

        static String printPrecision(double d) {
            DecimalFormat ft = new DecimalFormat("0.00000000000");
            return String.valueOf(ft.format(d));
        }

        static int countBit(long mask) {
            int ans = 0;
            while (mask != 0) {
                mask &= (mask - 1);
                ans++;
            }
            return ans;
        }
    }
}

class Solution {
    static long mod = (long) 1e9 + 7;
    static long mod1 = 998244353;

    public static void solve(Main.InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < n; i++) {
            count1[a[i] - 'a']++;
            count2[b[i] - 'a']++;
        }
        for(int i=0;i<26;i++)
        {
            int z=count1[i];
            count1[i]-=Math.min(z,count2[i]);
            count2[i]-=Math.min(z,count2[i]);
        }
        boolean flag=true;
        for(int i=0;i<26;i++)
        {
            if(count1[i]%k==0) {
                for (int j = i; j < 26; j++) {
                    if(count1[i]==0)
                        break;
                    if(count2[j]>count1[i] && i==j)
                    {
                        flag=false;
                        break;
                    }
                    else
                    {
                       if(count2[j]%k==0 && count1[i]%k==0)
                       {
                           int z=count2[j];
                           count2[j]-=Math.min(count2[j],count1[i]);
                           count1[i]-=Math.min(count1[i],z);
                       }
                       else
                       {
                           flag=false;
                           break;
                       }
                    }
                }
                if(!flag)
                    break;
            }
            else
            {
               flag=false;
                break;
            }
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<26;i++) {
            sum1+=count1[i];
            sum2+=count2[i];
        }
        if(flag && sum1==0 && sum2==0)
            out.println("Yes");
        else
            out.println("No");
    }
}