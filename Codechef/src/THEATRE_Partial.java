/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) {
        try{
            Scanner val=new Scanner(System.in);
            int t=val.nextInt();
            long[] ans =new long[t];
            int k=0;
            while(k!=t)
            {
                int n=val.nextInt();
                HashMap<String,Integer> hmap= new HashMap<>();
                for(int i=0;i<n;i++)
                {
                    String key=val.next()+ val.nextInt();
                    if(hmap.containsKey(key))
                    {
                        hmap.put(key,hmap.get(key)+1);
                    }
                    else
                    {
                        hmap.put(key,1);
                    }
                }
                //Sorting Hashmap by value
                List<Map.Entry<String, Integer> > list = new LinkedList<>(hmap.entrySet());
                list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
                HashMap<String, Integer> temp = new LinkedHashMap<>();
                for (Map.Entry<String, Integer> aa : list) {
                    temp.put(aa.getKey(), aa.getValue());
                }
                int c=0;
                long sum=0;
                int a=0,b=0,c1=0,d=0,t12=0,t3=0,t6=0,t9=0;
                for (Map.Entry<String, Integer> en : temp.entrySet()) {
                    if(c!=4)
                    {
                        String test=String.valueOf(en.getKey());
                        if(test.charAt(0)=='A' && a==0)
                        {
                            //System.out.println("I am here");
                            if(test.charAt(1)=='1' && t12==0)
                            {t12++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                a++;}
                                if(c==2){
                                    a++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){a++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    a++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='3' && t3==0)
                            {t3++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                a++;}
                                if(c==2){
                                    a++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){a++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    a++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='6' && t6==0)
                            {t6++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                a++;}
                                if(c==2){
                                    a++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){a++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    a++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='9' && t9==0)
                            {t9++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                a++;}
                                if(c==2){
                                    a++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){a++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    a++;
                                    sum=sum+en.getValue()*25;}}
                        }
                        if(test.charAt(0)=='B' && b==0)
                        {
                            if(test.charAt(1)=='1' && t12==0)
                            {t12++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                b++;}
                                if(c==2){
                                    b++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){b++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    b++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='3' && t3==0)
                            {t3++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                b++;}
                                if(c==2){
                                    b++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){b++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    b++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='6' && t6==0)
                            {t6++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                b++;}
                                if(c==2){
                                    b++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){b++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    b++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='9' && t9==0)
                            {t9++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                b++;}
                                if(c==2){
                                    b++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){b++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    b++;
                                    sum=sum+en.getValue()*25;}}
                        }
                        if(test.charAt(0)=='C' && c1==0)
                        {
                            if(test.charAt(1)=='1' && t12==0)
                            {t12++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                c1++;}
                                if(c==2){
                                    c1++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){c1++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    c1++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='3' && t3==0)
                            {t3++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                c1++;}
                                if(c==2){
                                    c1++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){c1++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    c1++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='6' && t6==0)
                            {t6++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                c1++;}
                                if(c==2){
                                    c1++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){c1++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    c1++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='9' && t9==0)
                            {t9++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                c1++;}
                                if(c==2){
                                    c1++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){c1++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    c1++;
                                    sum=sum+en.getValue()*25;}}
                        }
                        if(test.charAt(0)=='D' && d==0)
                        {
                            if(test.charAt(1)=='1' && t12==0)
                            {t12++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                d++;}
                                if(c==2){
                                    d++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){d++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    d++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='3' && t3==0)
                            {t3++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                d++;}
                                if(c==2){
                                    d++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){d++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    d++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='6' && t6==0)
                            {t6++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                d++;}
                                if(c==2){
                                    d++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){d++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    d++;
                                    sum=sum+en.getValue()*25;}}
                            if(test.charAt(1)=='9' && t9==0)
                            {t9++;c+=1;if(c==1){
                                sum=sum+en.getValue()*100;
                                d++;}
                                if(c==2){
                                    d++;
                                    sum=sum+en.getValue()*75;
                                }
                                if(c==3){d++;
                                    sum=sum+en.getValue()*50;}
                                if(c==4)
                                {
                                    d++;
                                    sum=sum+en.getValue()*25;}}
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                if(a==0)
                {
                    sum=sum-100;
                }
                if(b==0)
                {
                    sum=sum-100;
                }
                if(c1==0)
                {
                    sum=sum-100;
                }
                if(d==0)
                {
                    sum=sum-100;
                }
                ans[k]=sum;
                k++;
            }
            long fsum=0;
            for(int i=0;i<t;i++)
            {
                fsum=fsum+ans[i];
                System.out.println(ans[i]);
            }
            System.out.println(fsum);
        }catch(Exception ignored){}
    }
}
