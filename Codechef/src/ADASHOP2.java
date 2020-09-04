import java.util.*;
import java.lang.*;
import java.io.*;
class ADASHOP2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();
            while(x-->0)
            {
                int r=scn.nextInt();
                int c=scn.nextInt();
                if(r==1 && c==1)
                {
                    System.out.println("25");
                }
                else{
                    System.out.println("27");
                    int n=(r+c)/2;
                    System.out.println(n+" "+n);
                    System.out.println("1 1");
                }
                System.out.println("2 2");
                System.out.println("1 3");
                System.out.println("3 1");
                System.out.println("2 2");
                System.out.println("3 3");
                System.out.println("1 5");
                System.out.println("5 1");
                System.out.println("3 3");
                System.out.println("4 4");
                System.out.println("1 7");
                System.out.println("7 1");
                System.out.println("4 4");
                System.out.println("5 5");
                System.out.println("2 8");
                System.out.println("8 2");
                System.out.println("5 5");
                System.out.println("6 6");
                System.out.println("4 8");
                System.out.println("8 4");
                System.out.println("6 6");
                System.out.println("7 7");
                System.out.println("6 8");
                System.out.println("8 6");
                System.out.println("7 7");
                System.out.println("8 8");
            }
        }catch(Exception t){}
    }
}
