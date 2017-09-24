// BeBetter.cpp: 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <iostream>
using namespace std;
int Partition(int *r, int s, int t);
void QuickSort(int *r, int s, int t);
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
	QuickSort(r, 0, length - 1);
	cout << "After sorted" << endl;
	for (int i = 0; i < length; i++)
		cout << r[i] << " ";
}
void QuickSort(int *r, int s, int t)
{
	int pivot;
	if (s < t)
	{
		pivot = Partition(r, s, t);
		QuickSort(r, s, pivot - 1);
		QuickSort(r, pivot + 1, t);
	}
}
int Partition(int *r, int s, int t)
{
	int i = (s + t) / 2, j = t, temp;
	while (i<j)
	{
		while (r[i] < r[j] && i<j)j--;
		if (i<j)//如果是以 r[i]>r[j]的条件，那就造成i=j，而 r[i]与r[j]相同数互换的窘境！
		{
			temp = r[i]; r[i] = r[j]; r[j] = temp; i++;
		}
		i = s;
		while (r[j] > r[i] && i<j)i++;
		if (i<j)
		{
			temp = r[i]; r[i] = r[j]; r[j] = temp; j--;
		}
	}

	return i;
}

