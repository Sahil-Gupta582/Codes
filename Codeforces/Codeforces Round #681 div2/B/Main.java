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
        int t= in.nextInt();
        for(int i=0;i<t;i++)
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
        public int[] readArray(int n)
        {
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=nextInt();
            return arr;
        }
        static long gcd(long x, long y){
            if(x==0)
                return y;
            if(y==0)
                return x;
            long r=0, a, b;
            a = Math.max(x, y);
            b = Math.min(x, y);
            r = b;
            while(a % b != 0){
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }
        static long modulo(long a,long b,long c){
            long x=1,y=a%c;
            while(b > 0){
                if(b%2 == 1)
                    x=(x*y)%c;
                y = (y*y)%c;
                b = b>>1;
            }
            return  x%c;
        }
        public static void debug(Object... o){
            System.err.println(Arrays.deepToString(o));
        }
        static String printPrecision(double d){
            DecimalFormat ft = new DecimalFormat("0.00000000000");
            return String.valueOf(ft.format(d));
        }
        static int countBit(long mask){
            int ans=0;
            while(mask!=0){
                mask&=(mask-1);
                ans++;
            }
            return ans;
        }
    }
}
class Solution
{
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    public static void solve(Main.InputReader in, PrintWriter out)
    {
        int a=in.nextInt();
        int b=in.nextInt();
        char[] arr=in.next().toCharArray();
        int sum=0;
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1') {
                start = i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
                end=i;
        }
        boolean all_zero=true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                all_zero=false;
                break;
            }
        }
//        out.println(start+" "+end);
        if(start==end && arr[start]!='1')
        {
            int count=0;
            for(int i=start;i<arr.length;i++)
            {
                if(arr[i]=='0')
                    count++;
            }
            sum=b*count+a;
        }
        else {
            int in_one = 1;
            int exp = 0;
            for (int i = start; i <= end; i++) {
                if (arr[i] == '0') {
                    exp++;
                } else {
                    if (exp > 0)
                        in_one++;
                    exp = 0;
                }
            }
            int count = 0;
//        out.println(in_one);
            for (int i = start; i <= end; i++) {
                if (arr[i] == '0') {
                    count++;
                } else {
//                    out.println(count);
                    if (count > 0 && count * b < a) {
                        sum += count * b;
                        in_one--;
                    }
                    count = 0;
                }
            }
            sum += in_one * a;
        }
        if(all_zero)
            sum=0;
        out.println(sum);
    }
}