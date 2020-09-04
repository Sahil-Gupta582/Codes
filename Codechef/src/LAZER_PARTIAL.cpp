#include <bits/stdc++.h>
using namespace std;
void fastscan(long &number)
{
	bool negative = false;
	register long c;
	number = 0;
	c = getchar();
	if (c=='-')
	{
		negative = true;
		c = getchar();
	}
	for (; (c>47 && c<58); c=getchar())
		number = number *10 + c - 48;
	if (negative)
		number *= -1;
}
int main()
{
	long t;
	fastscan(t);
	while(t-- >0)
	{
	long N;fastscan(N);
	long Q;fastscan(Q);
	long arr[N];
	for(int i=0;i<N;i++)
	fastscan(arr[i]);
    while(Q-- >0)
    {
        long x1;fastscan(x1);
        long x2;fastscan(x2);
        long y;fastscan(y);
        long start=1;
        long c=0;
        for(long j=x1-1;j<x2-1;j++)
        {
            if(arr[j]<=y && arr[j+1]>=y)
                c++;
            if(arr[j]>=y && arr[j+1]<=y)
                c++;
        }
        printf("%d\n",c);
    }
    }
    return 0;
}