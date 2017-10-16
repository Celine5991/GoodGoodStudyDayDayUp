// BeBetter.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
#define N 10
int r[N],w[N],v[N],n,maxv,C;
using namespace std;
void subset(int n, int cur);
int main()
{
	cout << "Count" << endl;
	cin >> n;
	cin >> C;
	cout << "Each weight" << endl;
	for (int i = 0; i < n; i++)
	{
		cin >> w[i];
	}
	cout << "Each value" << endl;
	for (int i = 0; i < n; i++)
	{
		cin >> v[i];
	}
	subset(n, 0);
	cout << "Maxvalue:" << maxv << endl;
	return 0;
}
void subset(int n, int cur)
{
	if (cur == n)
	{
		for (int i = 0,weight=0,value=0; i < n; i++)
		{
			if (r[i] == 1)
			{
				weight = weight + w[i];
				if (weight <= C)
					value = value + v[i];
				if(value > maxv)
					maxv = value;
			}
		}
		return;
	}
	for (int k = 1; k >= 0; k--)
	{
		r[cur] = k;
		subset(n, cur+1);
	}
}

