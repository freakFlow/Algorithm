#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int income;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> income;

	while (income != 0)
	{
		if (income <= 1000000)
		{
			cout << income;
		}
		else if (income <= 5000000)
		{
			cout << (int)(income * 0.9);
		}
		else
		{
			cout << (int)(income * 0.8);
		}

		cout << '\n';

		cin >> income;
	}
	
	return 0;
}