#include <iostream>
#include <string>

using namespace std;

int T;
int n;

int main(void)
{
	cin >> T;

	for (int t = 0; t < T; t++)
	{
		cin >> n;

		if (n < 3) cout << 1 << endl;
		else cout << 3 << endl;
	}

	return 0;
}