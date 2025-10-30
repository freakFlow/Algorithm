#include <iostream>
#include <climits>
#include <algorithm>

using namespace std;

int N;
int x, y;
int minX = INT_MAX, minY = INT_MAX, maxX = INT_MIN, maxY = INT_MIN;
int ans;

int main(void)
{
	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> x >> y;
		minX = min(x, minX);
		minY = min(y, minY);
		maxX = max(x, maxX);
		maxY = max(y, maxY);
	}

	ans = (maxX - minX) * (maxY - minY);

	cout << ans;

	return 0;
}