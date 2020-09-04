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
	if(t*(N+Q)<=4000000)
	{
	    long oa=0,ea=0;
	for(int i=0;i<N;i++){
	fastscan(arr[i]);
	long h=__builtin_popcountl(arr[i]);
	(h&1)?oa++:ea++;
	}
	while(Q-- >0){
	    long P;
	fastscan(P);
	long x=__builtin_popcountl(P);
	long e=0;
	long o=0;
	if(x%2==1)
	{e=oa;
	o=ea;}
	else
	{
	    e=ea;
	    o=oa;
	}
	/*for(int j=0;j<N;j++)
	{
	long one=__builtin_popcountl(P^arr[j]);
	(one&1)?o++:e++;
	}*/
	printf("%ld %ld\n",e,o);

	}
	}
	else{continue;}
	}
	return 0;
}