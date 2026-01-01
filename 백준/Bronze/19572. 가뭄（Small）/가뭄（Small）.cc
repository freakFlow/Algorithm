#include <iostream>

using namespace std;

int d1, d2, d3;
double a, b, c;


int main(void)
{
	cout << fixed;
	cout.precision(1);

	cin >> d1 >> d2 >> d3;

	a = (d1 + d2 - d3) / 2.0;
	b = (d1 - d2 + d3) / 2.0;
	c = (-d1 + d2 + d3) / 2.0;

	if (a <= 0 || b <= 0 || c <= 0)
	{
		cout << -1;
	}
	else
	{
		cout << 1 << endl << a << ' ' << b << ' ' << c;
	}

	return 0;
}