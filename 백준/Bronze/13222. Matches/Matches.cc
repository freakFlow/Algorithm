#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N, W, H;
int match;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N >> W >> H;

	for (int n = 0; n < N; n++)
	{
		cin >> match;

		if (pow(match, 2) <= pow(W, 2) + pow(H, 2)) cout << "YES\n";
		else cout << "NO\n";
	}
	
	return 0;
}