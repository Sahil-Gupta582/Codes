import java.io.PrintWriter;

class SUBSFEQ_Partial {

    public void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        int n=in.nextInt();
        int[] arr=new int[n];
        final long MOD=(int)1e9 + 7;
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        long twoPow=1;
        String[] s= new String[n];
        s[n-1]="1";
        for(int i=n-2;i>=0;i--)
        {
            twoPow=(twoPow*2)%MOD;
            s[i]=String.valueOf(twoPow);
        }
        for(String x : s)
            System.out.print(x+" ");
        System.out.println();
    }
}