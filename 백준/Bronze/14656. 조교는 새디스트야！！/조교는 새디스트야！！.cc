#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N;
int num;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;
	
	for (int n = 1; n <= N; n++)
	{
		cin >> num;
		if (num != n) ans++;
	}

	cout << ans;
	
	return 0;
}