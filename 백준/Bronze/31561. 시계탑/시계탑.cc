#include <iostream>

using namespace std;

int M;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cout << fixed;
	cout.precision(1);

	cin >> M;

	if (M <= 30) cout << M * 0.5;
	else cout << 15 + (M - 30) * 1.5;
	
	return 0;
}