import java.util.*;
class ADAKING
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner val=new Scanner(System.in);
        int t=val.nextInt();
        while(t-->0)
        {
            int k=val.nextInt();
            int count=0;
            for(int i=0;i<8;i++)
            {
                for(int j=0;j<8;j++)
                {
                    if(count<k)
                    {
                        if(count==0)
                            System.out.print("O");
                        else
                            System.out.print(".");
                        count++;
                    }
                    else
                        System.out.print("X");
                }
                System.out.println();
            }
        }
    }
}
