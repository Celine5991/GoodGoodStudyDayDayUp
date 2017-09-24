// BeBetter.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
using namespace std;
void MergeSort(int *r, int s, int t);
void Merge(int *r, int *r1, int s, int m, int t);
int main()
{
	int length, r[100];
	cout << "Please input the count of your Array" << endl;
	cin >> length;
	cout << "Please input each item of your Array" << endl;
	for (int i = 0; i < length; i++)
		cin >> r[i];
	cout << "Before sorted" << endl;
	for (int i = 0; i < length; i++)
		cout << r[i] << " ";
	cout << endl;
	MergeSort(r, 0, length - 1);
	cout << "After sorted" << endl;
	for (int i = 0; i < length; i++)
		cout << r[i] << " ";
	cout << endl;
}
void MergeSort(int *r, int s, int t)
{
	int m, r1[100];
	if (s == t)return;
	else
	{
		m = (s + t) / 2;
		MergeSort(r, s, m);
		MergeSort(r, m + 1, t);
		Merge(r, r1, s, m, t);
		for (int i = s; i <= t; i++)
			r[i] = r1[i];
	}
}
void Merge(int *r, int *r1, int s, int m, int t)
{
	int i = s, j = m + 1, k = s;
	while (i <= m&&j <= t)
	{
		if (r[i]<r[j])
			r1[k++] = r[i++];
		else
		{
			r1[k++] = r[j++];
		}
	}
	while (i <= m)r1[k++] = r[i++];
	while (j <= t)r1[k++] = r[j++];
}
