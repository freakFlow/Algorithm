#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N;
int D, P;
char ch;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> ch;
		if (ch == 'D') D++;
		else P++;

		if (abs(D - P) >= 2) break;
	}

	cout << D << ':' << P;
	
	return 0;
}