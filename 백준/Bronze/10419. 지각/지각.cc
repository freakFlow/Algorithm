#include <iostream>
#include <cmath>
#include <string>

using namespace std;

int T;
int d;
int ans;

int main(void)
{
	cin >> T;

	for (int t = 0; t < T; t++)
	{
		cin >> d;

		ans = (int)((-1 + sqrt(1 + 4 * d)) / 2.0);

		cout << ans << endl;
	}

	return 0;
}