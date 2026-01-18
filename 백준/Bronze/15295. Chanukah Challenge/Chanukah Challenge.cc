#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int P, K, N;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> P;

	for (int p = 0; p < P; p++)
	{
		cin >> K >> N;
		ans = N * (N + 1) / 2 + N;

		cout << K << ' ' << ans << endl;
	}
	
	return 0;
}