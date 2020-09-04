#include <iostream>
using namespace std;

int main() {
    int t,n;
    cin>>t;
    while(t-->0)
    {
        cin>>n;
        if(n!=1 && n!=2 && n!=3)
        {
         cout<<n/2<<"\n";
         cout<<"3 1 2 3\n";
         int k=4;
         for(int i=1;i<n/2-1;i++)
		        {
		            printf("%d %d %d\n",2,k,(k+1));
		            k=k+2;
		        }
                int a=n-k+1;
                printf("%d ",a);
                for(int i=k;i<=n;i++)
                printf("%d ",i);
        }
        else
        {
            cout<<"1\n";
            printf("%d ",n);
            for(int i=1;i<=n;i++)
            printf("%d ",i);
        }
        printf("\n");
    }
	return 0;
}
