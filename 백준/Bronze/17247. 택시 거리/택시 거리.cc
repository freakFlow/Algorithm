#include <iostream>
#include <string>

using namespace std;

int N, M;
int r1 = -1, c1, r2, c2;
int num;
int ans;

int main(void)
{
	cin >> N >> M;

	for (int n = 0; n < N; n++)
	{
		for (int m = 0; m < M; m++)
		{
			cin >> num;
			if (num == 0) continue;

			if (r1 == -1)
			{
				r1 = n;
				c1 = m;
			}
			else
			{
				r2 = n;
				c2 = m;
			}
		}
	}

	ans = abs(r1 - r2) + abs(c1 - c2);

	cout << ans;

	return 0;
}