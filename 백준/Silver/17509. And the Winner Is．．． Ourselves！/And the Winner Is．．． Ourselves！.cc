#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int D, V;
vector<int> minutes;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	for (int i = 0; i < 11; i++)
	{
		cin >> D >> V;
		minutes.push_back(D);
		ans += 20 * V;
	}

	sort(minutes.begin(), minutes.end());

	int i = 11;
	for (int min : minutes)
	{
		ans += i-- * min;
	}

	cout << ans;
	
	return 0;
}