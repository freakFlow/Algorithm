#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

long N;
long num;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	if (N > 0) num = ans = 1;

	while (num < N)
	{
		if (N - num > num) num *= 2;
		else num = N;

		ans++;
	}

	cout << ans;
	
	return 0;
}