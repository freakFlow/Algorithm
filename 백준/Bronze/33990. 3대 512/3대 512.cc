#include <iostream>
using namespace std;

int N;
int A, B, C;

int sum;
int ans = INT32_MAX;

int main(void)
{
	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> A >> B >> C;
		sum = A + B + C;
		if (sum >= 512)
		{
			ans = min(ans, sum);
		}
	}

	if (ans == INT32_MAX)
	{
		cout << -1;
	}
	else
	{
		cout << ans;
	}

	return 0;
}