import java.io.PrintWriter;
import java.util.Arrays;

class SKMP {

    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        String s= in.next();;
        String p=in.next();
        int ss=s.length();
        int ps=p.length();
        int[] count1 =new int[26];
        int[] count2 =new int[26];
        char[] ans1=new char[s.length()];
        char[] ans2=new char[s.length()];
        for(int i=0;i<ss;i++)
            count1[s.charAt(i)-'a']++;
        for(int i=0;i<ps;i++)
            count1[p.charAt(i)-'a']--;
        System.arraycopy(count1, 0, count2, 0, 26);
        int index=0;
        for(int i=0;i<=(p.charAt(0)-'a');i++)
        {
            while(count1[i]>0)
            {
                ans1[index]=(char)(i+97);
                index++;
                count1[i]--;
            }
        }
        for(int i=0;i<p.length();i++,index++)
            ans1[index]=p.charAt(i);
        for(int i=0;i<26;i++)
        {
            while(count1[i]>0)
            {
                ans1[index]=(char)(i+97);
                index++;
                count1[i]--;
            }
        }
        index=0;
        for(int i=0;i<p.charAt(0)-'a';i++)
        {
            while(count2[i]!=0)
            {
                ans2[index]=(char)(i+97);
                index++;
                count2[i]--;
            }
        }
        for(int i=0;i<p.length();i++,index++)
            ans2[index]=p.charAt(i);
        for(int i=0;i<26;i++)
        {
            while(count2[i]!=0)
            {
                ans2[index]=(char)(i+97);
                index++;
                count2[i]--;
            }
        }
        String a= Arrays.toString(ans1);
        a=a.replace("[","");
        a=a.replace("]","");
        a=a.replace(",","");
        a=a.replace(" ","");
        String b= Arrays.toString(ans2);
        b=b.replace("[","");
        b=b.replace("]","");
        b=b.replace(",","");
        b=b.replace(" ","");
        System.out.println((a.compareTo(b)<0)?a:b);
    }
}