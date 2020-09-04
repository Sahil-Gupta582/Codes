import java.io.PrintWriter;

class CRDGAME3 {
    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        double a=in.nextDouble();
        double b=in.nextDouble();
        double x=(a/9.0);
        double y=(b/9.0);
        int dc=-1;
        int dr=-1;
        if(a%9.0==0)
            dc=(int)x;
        else
            dc=(int)x+1;
        if(b%9.0==0)
            dr=(int)y;
        else
            dr=(int)y+1;
        if(dc<dr)
            System.out.println("0 "+dc);
        else
            System.out.println("1 "+dr);
    }
}