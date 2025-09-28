#include <iostream>

using namespace std;

int N;
int ans;

int main(void)
{
	cin >> N;

	if (N % 2 == 0)
	{
		ans = 2;
	}
	else
	{
		ans = 1;
	}

	cout << ans;

	return 0;
}