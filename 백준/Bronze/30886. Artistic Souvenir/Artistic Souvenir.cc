#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

double a;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cout << fixed;
	cout.precision(10);

	cin >> a;

	cout << pow(2 * sqrt(a / acos(-1.0)) + 2, 2);
	
	return 0;
}