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
        int[] arr=in.readArray(n);
        int[] parent=new int[n];
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++)
            parent[i]=i;
        int secondIndex=-1;
        visit[0]=true;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[0]) {
                parent[i] = 0;
                secondIndex=i;
                visit[i]=true;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!visit[i])
            {
                parent[i]=secondIndex;
            }
        }
        if(secondIndex==-1)
            out.println("NO");
        else
        {
            out.println("YES");
            for(int i=0;i<n;i++)
            {
                if(parent[i]!=i)
                    out.println((i+1)+" "+(parent[i]+1));
            }
        }
    }
}