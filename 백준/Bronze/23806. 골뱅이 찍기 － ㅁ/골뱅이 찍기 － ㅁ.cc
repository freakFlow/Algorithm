#include <iostream>

using namespace std;

int N;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int r = 0; r < 5 * N; r++)
	{
		for (int c = 0; c < 5 * N; c++)
		{
			if (r < N || c < N || r >= 4 * N || c >= 4 * N) cout << '@';
			else cout << ' ';
		}
		cout << '\n';
	}
	
	return 0;
}