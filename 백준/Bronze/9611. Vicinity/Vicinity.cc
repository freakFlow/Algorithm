#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int n;

int t, i, d;
int ans;

class Point
{
public:
	int x, y;

	bool isInVicinity(Point p)
	{
		return pow(abs(x - p.x), 2) + pow(abs(y - p.y), 2) <= pow(d, 2);
	}
};

Point points[1001];

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> n;

	for (int j = 1; j <= n; j++)
	{
		Point p;
		cin >> p.x >> p.y;
		points[j] = p;
	}

	cin >> t;

	for (int j = 0; j < t; j++)
	{
		cin >> i >> d;

		ans = 0;
		for (int k = 1; k <= n; k++)
		{
			if (k == i) continue;

			if (points[k].isInVicinity(points[i])) ans++;
		}

		cout << ans << '\n';
	}
	
	return 0;
}