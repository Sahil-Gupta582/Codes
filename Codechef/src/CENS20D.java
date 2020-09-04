import java.io.PrintWriter;

class CENS20D {
    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((arr[i]&arr[j])==arr[i])
                    count++;
            }
        }
        out.println(count);
    }
}