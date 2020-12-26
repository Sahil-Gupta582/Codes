import java.io.*;
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
    }
}
class Solution
{
    public static void solve(Main.InputReader in, PrintWriter out)
    {
        int n=in.nextInt();
        int sum=0;
        int[] arr=in.readArray(n);
        int count=0;
        int start=0;
        for(int i=0;i<n;i++) if(arr[i]==1){ start=i; break;}
        int end=0;
        for(int i=0;i<n;i++) if(arr[i]==1) end=i;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
            else
            {
                sum+=count;
                count=0;
            }
        }
        sum+=count;
        out.println(sum);
    }
}