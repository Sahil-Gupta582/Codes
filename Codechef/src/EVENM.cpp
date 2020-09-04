#include <bits/stdc++.h>
using namespace std;
const int MAX = 1000;
void spiralFill(int m, int n, int a[][MAX])
{
	int val = 1;
	int k = 0, l = 0;
	while (k < m && l < n)
	{
		for (int i = l; i < n; ++i)
			a[k][i] = val++;
		k++;
		for (int i = k; i < m; ++i)
			a[i][n-1] = val++;
		n--;
        if (k < m)
		{
			for (int i = n-1; i >= l; --i)
				a[m-1][i] = val++;
			m--;
		}
		if (l < n)
		{
			for (int i = m-1; i >= k; --i)
				a[i][l] = val++;
			l++;
		}
	}
}
int main()
{
    int t,n;
	cin>>t;
	while(t-->0)
	{
	    cin>>n;
	int a[MAX][MAX];
	spiralFill(n, n, a);
	for (int i=0; i<n; i++)
	{
	for (int j=0; j<n; j++)
		cout << a[i][j] << " ";
	cout << endl;
	}
	}
	return 0;
}
