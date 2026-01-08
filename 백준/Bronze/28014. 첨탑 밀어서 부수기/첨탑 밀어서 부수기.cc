#include <iostream>

using namespace std;

int N;
int height;
int current;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> height;
		if (current <= height) ans++;
		current = height;
	}

	cout << ans;
	
	return 0;
}