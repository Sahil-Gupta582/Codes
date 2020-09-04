/* package codechef; // don't place package name! */

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class STFOOD
{
    public static void main (String[] args) {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            int[] ans =new int[t];
            int k=0;
            while(k!=t)
            {
                int n=val.nextInt();
                int max=0;
                for(int i=0;i<n;i++)
                {
                    int s=val.nextInt();
                    int p=val.nextInt();
                    int v=val.nextInt();
                    int price=(p/(s+1))*v;
                    if(max<price)
                    {
                        max=price;
                    }
                }
                ans[k]=max;
                k++;
            }
            for(int i=0;i<t;i++)
            {
                System.out.println(ans[i]);
            }
        }catch(Exception ignored){}
    }
}
