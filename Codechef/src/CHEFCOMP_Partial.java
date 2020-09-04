import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
class CHEFCOMP {
    static int[] a;
    static int[] f;
    static int[] d;
    static boolean[] fvisit;
    static ArrayList<Integer>[] adj;
    public static void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        int n=in.nextInt();
        fvisit=new boolean[n];
        d=new int[n];
        adj=(ArrayList<Integer>[])new ArrayList[n];
        for(int i=0;i<n;i++)
            adj[i]=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            int a=in.nextInt()-1;
            int b=in.nextInt()-1;
            adj[a].add(b);
            adj[b].add(a);
        }
        int[] p=new int[n];
        a=new int[n];
        f=new int[n];
        for(int i=0;i<n;i++)
            p[i]=in.nextInt()-1;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
            f[i]=in.nextInt();
        for(int i=0;i<n;i++)
        {
            DFS(p[i],i+1);
            fvisit[p[i]]=true;
        }
        for(int i=0;i<n;i++)
        {
            if(f[i]!=0)
                d[i]=-1;
        }
        Arrays.sort(p);
        for(int i=0;i<n;i++)
            System.out.print(d[p[i]]+" ");
        System.out.println();
    }
    public static void DFS(int s,int dayCount)
    {
        boolean[] bool =new boolean[adj.length];
        //System.out.println(dayCount);
        Stack<Integer> Q=new Stack<>();
        Q.push(s);
        bool[s]=true;
        while(!Q.isEmpty())
        {
            int u=Q.pop();
            f[u]=f[u]-Math.min(a[s],f[u]);
            if(f[u]==0) {
                //System.out.println("Present Sir");
                if(d[u]==0)
                    d[u] = dayCount;
            }
            for(int i=0;i<adj[u].size();i++)
            {
                if(!bool[adj[u].get(i)] && !fvisit[adj[u].get(i)])
                {
                    bool[adj[u].get(i)]=true;
                    Q.push(adj[u].get(i));
                }
            }
        }
    }
}