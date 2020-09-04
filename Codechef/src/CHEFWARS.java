import java.io.PrintWriter;

class CHEFWARS {
    public static void solve(int testNumbers, Main.InputReader in, PrintWriter out) {
        int d=in.nextInt();
        int c=in.nextInt();
        while(c!=0 && d>0)
        {
            d=d-c;
            c=c/2;
        }
        if(d<=0 && c>=0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}