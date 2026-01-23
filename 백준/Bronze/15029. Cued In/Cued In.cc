#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N;
string str;
int red, yellow, green, brown, blue, pink, black;
bool isOnlyRed;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> str;
		if (str == "red") red++;
		else if (str == "yellow") yellow++;
		else if (str == "green") green++;
		else if (str == "brown") brown++;
		else if (str == "blue") blue++;
		else if (str == "pink") pink++;
		else if (str == "black") black++;
	}

	if (black > 0) ans += 7 * red;
	else if (pink > 0) ans += 6 * red;
	else if (blue > 0) ans += 5 * red;
	else if (brown > 0) ans += 4 * red;
	else if (green > 0) ans += 3 * red;
	else if (yellow > 0) ans += 2 * red;
	else
	{
		isOnlyRed = true;
		ans = 1;
	}

	if (!isOnlyRed) ans += red + yellow * 2 + green * 3 + brown * 4 + blue * 5 + pink * 6 + black * 7;

	cout << ans;
	
	return 0;
}