import java.io.PrintWriter;

class CENS20G {
    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        String s=in.next();
        String D=s.replace("D","");
        String U=s.replace("U","");
        String L=s.replace("L","");
        String R=s.replace("R","");
        long Dlen=s.length()-D.length();
        long Ulen=s.length()-U.length();
        long Llen=s.length()-L.length();
        long Rlen=s.length()-R.length();
        long x1=in.nextLong();
        long y1=in.nextLong();
        int q=in.nextInt();
        while(q-->0)
        {
            String ans="NO";
            long len=0;
            long x2=in.nextInt();
            long y2=in.nextInt();
            long Dcount=0;
            long Ucount=0;
            long Lcount=0;
            long Rcount=0;
            if(x2>x1)
                Rcount=x2-x1;
            else
                Lcount=x1-x2;
            if(y2>y1)
                Ucount=y2-y1;
            else
                Dcount=y1-y2;
            if(Dlen>=Dcount && Ulen>=Ucount && Llen>=Lcount && Rlen>=Rcount)
            {
                ans="YES";
                len=Dcount+Ucount+Lcount+Rcount;
            }
            if(ans.equals("NO"))
                out.println(ans);
            else
                out.println(ans+" "+len);
        }
    }
}