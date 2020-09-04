#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t-->0)
    {
        int n;
        long long x;
        cin>>n>>x;
        vector<int> v(n);
        for(int& i:v)
        cin>>i;
        sort(v.begin(),v.end());
        vector<int>::iterator it = lower_bound(v.begin(),v.end(),x);
        int pivot=it-v.begin();
        int days=0;
        for(int i=pivot;i<n;i++)
        {
            if(x<v[i])
            {
                while(x<v[i])
                {
                    x=2*x;
                    days++;
                }
                days++;
            }
            else
            days++;
            x=2*v[i];
        }
        int tot=pivot+days;
        if(pivot!=0)
        {
            days=0;
            pivot--;
            for(int i=pivot;i<n;i++)
            {
                if(x<v[i])
                {
                    while(x<v[i])
                    {
                    x=2*x;
                    days++;
                    }
                    days++;
                }
                else
                days++;
                x=2*v[i];
            }
            int ans=min(days+pivot,tot);
            cout<<ans<<"\n";
        }
        else
        cout<<tot<<"\n";
    }
    return 0;
}